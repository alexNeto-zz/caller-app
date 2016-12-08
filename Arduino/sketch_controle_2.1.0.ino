/*******
* BUGS *
* se tiver algum bug escreva aqui e me avisem
********/


#include <SPI.h> // Possibilita a utilização de uma interface serial.
#include <MFRC522.h> //Facilita a utilização do módulo RFID.
#include <SoftwareSerial.h> //Possibilita a utilização de qualquer 
                            //porta digital de forma serial.

#define SS_PIN 10
#define RST_PIN 9
// define as portas que serao usadas como serial
MFRC522 mfrc522(SS_PIN, RST_PIN); 
SoftwareSerial BTserial(2, 3);

void setup(){
    // Define a porta como saida
    pinMode(7, OUTPUT); // LED Vermelho
    pinMode(8, OUTPUT); // LED Verde
    /************************************************************
    ************* INICIALIZAÇAO DO MODULO BLUETOOTH *************
    *************************************************************/ 
    // Velocidade de comunicaçao padrao do HC-05 e 9600
    BTserial.begin(9600);
   /************************************************************
    ************* INICIALIZAÇAO DA PORTA SERIAL ****************
    *************************************************************/
    // Inicia monitor serial
    Serial.begin(9600);
    Serial.println("DBMP initialized"); // DBMP e o nome enquanto projeto
    /************************************************************
    ************** INICIALIZAÇAO DO MODULO RFID *****************
    *************************************************************/
    SPI.begin(); // inicia SPI bus
    mfrc522.PCD_Init(); // inicia MFRC522
}
/*****************************************************************
*********** SUBROTINA PARA RECEBER E ENVIAR DADOS ****************
********************** PELO BLUETOOTH ****************************/
void bluetooth(String idCard){        
   BTserial.println(idCard); // envia para aparelho conectado
}
/*****************************************************************
*********** SUBROTINA PARA RECEBER UID DO CARTAO *****************
************************* PELO RFID ******************************/

String rfid(){  
  // Verifica se ha cartao
  if (! mfrc522.PICC_IsNewCardPresent()){
    return "";
  }
  // Select one of the cards
  if (! mfrc522.PICC_ReadCardSerial()){
    return "";
  }
  //Mostra UID na serial
  Serial.print("UID da tag :");
  String conteudo= "";
  for (byte i = 0; i < mfrc522.uid.size; i++){
     Serial.print(mfrc522.uid.uidByte[i] < 0x10 ? " 0" : " ");
     Serial.print(mfrc522.uid.uidByte[i], HEX);
     conteudo.concat(String(mfrc522.uid.uidByte[i] < 0x10 ? " 0" : " "));
     conteudo.concat(String(mfrc522.uid.uidByte[i], HEX));
  }
  // formata o MAC address como caixa alta
  conteudo.toUpperCase();
  // Salva apenas o MAC address na string
  String idCard = conteudo.substring(1);
  return idCard;
  
}
void loop(){
  digitalWrite(7, HIGH);
  // read CARD
  String idCard = rfid(); // chama a funcao rfid() 
                          // e salva na string o valor
                          // retornado
   if(idCard != ""){      // se houver informaço para ser enviada 
     // digitalWrite() sao para a sequencia de sinalizacao
     digitalWrite(7, LOW);
     digitalWrite(8, HIGH);
     bluetooth(idCard);  // chama a funço bluetooth e envia o MAC
     delay(750);
     digitalWrite(8, LOW);
     digitalWrite(7, HIGH);
     delay(500);
     digitalWrite(7, LOW);
     delay(250);
     digitalWrite(7, HIGH);
     delay(500);
     
   }
   // zera a variavel
   idCard = ""; 
}  
/**********************************************************************************/
