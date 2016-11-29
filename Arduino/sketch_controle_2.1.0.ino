/*******
* BUGS *
* se tiver algum bug escreva aqui e me avisem
********/


#include <SPI.h>
#include <MFRC522.h> 
#include <SoftwareSerial.h>

#define SS_PIN 10
#define RST_PIN 9

MFRC522 mfrc522(SS_PIN, RST_PIN); 
SoftwareSerial BTserial(2, 3);
 
byte ATmodePin=4;
char c = ' ';
void setup(){
    pinMode(7, OUTPUT);
    pinMode(8, OUTPUT);
    /************************************************************
    *************** SETUP OF THE BLUETOOTH MODULE ***************
    *************************************************************/
    // set up the pin used to turn on AT mode
    pinMode(ATmodePin, OUTPUT); 
    digitalWrite(ATmodePin, LOW); 
    // HC-05 default serial speed for communication mode is 9600
    BTserial.begin(9600);
   /************************************************************
    **************** SETUP OF THE SERIAL PORT *******************
    *************************************************************/
    // Start the serial monitor
    Serial.begin(9600);
    Serial.println("DBMP initialized"); 
    /************************************************************
    ***************** SETUP OF THE RFID MODULE ******************
    *************************************************************/
    SPI.begin(); // init SPI bus
    mfrc522.PCD_Init(); // init MFRC522
    /************************************************************
    **************** PRINT THE INIT MESSAGE *********************
    *************************************************************/
    //Serial.println("BTserial started at 9600"); /**** message init ****/
    //Serial.println("Type # to enter AT mode");  /*** of the program ***/
    //Serial.println("Bring the card closer");    /*** will be changed **/
}
/***********************************************************************
*************** SUBROUTINE TO RECEIVE AND SEND DATA ********************
************************** BY BLUETOOTH ********************************/
void atMode(char c){
// Keep reading from Arduino Serial Monitor and send to HC-05
  /********************************************************************
  ********************* ENTER AND EXIT AT MODE ************************
  *********************************************************************/ 
  
        if (c=='#'){  // enter AT mode
            digitalWrite(ATmodePin, HIGH);
            Serial.print("Entered AT mode. Type $ to exit");
        }
 
        else if (c=='$'){ // exit AT mode by reseting the HC-05
            digitalWrite(ATmodePin, LOW);
            BTserial.print("AT+RESET\n\r");
            Serial.print("AT+RESET\n\r"); 
        }        
 
        else{
              // Copy the serial data back to to the serial monitor. 
              // This makes it easy to follow the commands and replies
              Serial.write(c);
              BTserial.write(c);  
        }
 }
void bluetooth(String idCard){        
   // Copy the serial data back to to the serial monitor. 
   // This makes it easy to follow the commands and replies
   BTserial.println(idCard);
  
}
String rfid(){  
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
  //Serial.println();
  //Serial.print("Mensagem : "); monitor serial do arduino ide
  conteudo.toUpperCase();
  String idCard = conteudo.substring(1);
  return idCard;
  
}
void loop(){
  digitalWrite(7, HIGH);
  // Keep reading from HC-05 and send to Arduino Serial Monitor
  if (BTserial.available()){  
    c = BTserial.read();
      Serial.write(c);
      BTserial.write(c); 
  }
  // read CARD
  String idCard = rfid();
   if(idCard != ""){
     digitalWrite(7, LOW);
     digitalWrite(8, HIGH);
     delay(500);
     bluetooth(idCard);
     digitalWrite(8, LOW);
     delay(250);
     digitalWrite(7, HIGH);
     delay(250);
     digitalWrite(7, LOW);
     delay(250);
     digitalWrite(7, HIGH);
     delay(750);
   }
   idCard = "";
   // Arduino to HC-05
   if(Serial.available()){
     c = Serial.read();
     if(c != ' ')
       atMode(c);
   }
 
}  
/**********************************************************************************/
    

