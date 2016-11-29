package appinventor.ai_efelipecarlos.Caller;

import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.BluetoothClient;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Clock;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.ListPicker;
import com.google.appinventor.components.runtime.Notifier;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.TinyDB;
import com.google.appinventor.components.runtime.TinyWebDB;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.expr.SetExp;
import gnu.kawa.functions.ArithOp;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.ParseFormat;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.kawa.xml.ElementType;
import gnu.kawa.xml.XDataType;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.Sequence;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.Procedure;
import gnu.mapping.PropertySet;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.DateTime;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;

/* compiled from: Cadastrar.yail */
public class Cadastrar extends Form implements Runnable {
    public static Cadastrar Cadastrar;
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final PairWithPosition Lit10;
    static final SimpleSymbol Lit100;
    static final SimpleSymbol Lit101;
    static final SimpleSymbol Lit102;
    static final SimpleSymbol Lit103;
    static final FString Lit104;
    static final SimpleSymbol Lit105;
    static final FString Lit106;
    static final FString Lit107;
    static final SimpleSymbol Lit108;
    static final IntNum Lit109;
    static final SimpleSymbol Lit11;
    static final FString Lit110;
    static final FString Lit111;
    static final IntNum Lit112;
    static final SimpleSymbol Lit113;
    static final FString Lit114;
    static final FString Lit115;
    static final FString Lit116;
    static final FString Lit117;
    static final FString Lit118;
    static final FString Lit119;
    static final PairWithPosition Lit12;
    static final SimpleSymbol Lit120;
    static final IntNum Lit121;
    static final FString Lit122;
    static final FString Lit123;
    static final IntNum Lit124;
    static final SimpleSymbol Lit125;
    static final FString Lit126;
    static final PairWithPosition Lit127;
    static final SimpleSymbol Lit128;
    static final PairWithPosition Lit129;
    static final PairWithPosition Lit13;
    static final SimpleSymbol Lit130;
    static final PairWithPosition Lit131;
    static final PairWithPosition Lit132;
    static final SimpleSymbol Lit133;
    static final PairWithPosition Lit134;
    static final PairWithPosition Lit135;
    static final PairWithPosition Lit136;
    static final PairWithPosition Lit137;
    static final PairWithPosition Lit138;
    static final SimpleSymbol Lit139;
    static final PairWithPosition Lit14;
    static final FString Lit140;
    static final FString Lit141;
    static final SimpleSymbol Lit142;
    static final SimpleSymbol Lit143;
    static final PairWithPosition Lit144;
    static final SimpleSymbol Lit145;
    static final SimpleSymbol Lit146;
    static final SimpleSymbol Lit147;
    static final SimpleSymbol Lit148;
    static final SimpleSymbol Lit149;
    static final PairWithPosition Lit15;
    static final SimpleSymbol Lit150;
    static final SimpleSymbol Lit151;
    static final FString Lit152;
    static final FString Lit153;
    static final FString Lit154;
    static final FString Lit155;
    static final FString Lit156;
    static final SimpleSymbol Lit157;
    static final IntNum Lit158;
    static final FString Lit159;
    static final PairWithPosition Lit16;
    static final IntNum Lit160;
    static final SimpleSymbol Lit161;
    static final SimpleSymbol Lit162;
    static final PairWithPosition Lit163;
    static final SimpleSymbol Lit164;
    static final PairWithPosition Lit165;
    static final SimpleSymbol Lit166;
    static final SimpleSymbol Lit167;
    static final SimpleSymbol Lit168;
    static final FString Lit169;
    static final PairWithPosition Lit17;
    static final FString Lit170;
    static final FString Lit171;
    static final FString Lit172;
    static final SimpleSymbol Lit173;
    static final PairWithPosition Lit174;
    static final SimpleSymbol Lit175;
    static final SimpleSymbol Lit176;
    static final SimpleSymbol Lit177;
    static final SimpleSymbol Lit178;
    static final SimpleSymbol Lit179;
    static final PairWithPosition Lit18;
    static final SimpleSymbol Lit180;
    static final SimpleSymbol Lit181;
    static final SimpleSymbol Lit182;
    static final SimpleSymbol Lit183;
    static final SimpleSymbol Lit184;
    static final SimpleSymbol Lit185;
    static final SimpleSymbol Lit186;
    static final SimpleSymbol Lit187;
    static final SimpleSymbol Lit188;
    static final SimpleSymbol Lit189;
    static final PairWithPosition Lit19;
    static final SimpleSymbol Lit2;
    static final PairWithPosition Lit20;
    static final PairWithPosition Lit21;
    static final PairWithPosition Lit22;
    static final PairWithPosition Lit23;
    static final PairWithPosition Lit24;
    static final PairWithPosition Lit25;
    static final SimpleSymbol Lit26;
    static final IntNum Lit27;
    static final SimpleSymbol Lit28;
    static final SimpleSymbol Lit29;
    static final SimpleSymbol Lit3;
    static final SimpleSymbol Lit30;
    static final SimpleSymbol Lit31;
    static final IntNum Lit32;
    static final SimpleSymbol Lit33;
    static final SimpleSymbol Lit34;
    static final SimpleSymbol Lit35;
    static final SimpleSymbol Lit36;
    static final SimpleSymbol Lit37;
    static final SimpleSymbol Lit38;
    static final SimpleSymbol Lit39;
    static final SimpleSymbol Lit4;
    static final IntNum Lit40;
    static final IntNum Lit41;
    static final IntNum Lit42;
    static final PairWithPosition Lit43;
    static final PairWithPosition Lit44;
    static final IntNum Lit45;
    static final IntNum Lit46;
    static final IntNum Lit47;
    static final PairWithPosition Lit48;
    static final PairWithPosition Lit49;
    static final SimpleSymbol Lit5;
    static final SimpleSymbol Lit50;
    static final SimpleSymbol Lit51;
    static final SimpleSymbol Lit52;
    static final SimpleSymbol Lit53;
    static final SimpleSymbol Lit54;
    static final SimpleSymbol Lit55;
    static final SimpleSymbol Lit56;
    static final SimpleSymbol Lit57;
    static final PairWithPosition Lit58;
    static final SimpleSymbol Lit59;
    static final PairWithPosition Lit6;
    static final SimpleSymbol Lit60;
    static final PairWithPosition Lit61;
    static final SimpleSymbol Lit62;
    static final SimpleSymbol Lit63;
    static final PairWithPosition Lit64;
    static final SimpleSymbol Lit65;
    static final SimpleSymbol Lit66;
    static final FString Lit67;
    static final SimpleSymbol Lit68;
    static final FString Lit69;
    static final PairWithPosition Lit7;
    static final FString Lit70;
    static final SimpleSymbol Lit71;
    static final IntNum Lit72;
    static final SimpleSymbol Lit73;
    static final IntNum Lit74;
    static final SimpleSymbol Lit75;
    static final IntNum Lit76;
    static final FString Lit77;
    static final FString Lit78;
    static final IntNum Lit79;
    static final SimpleSymbol Lit8;
    static final SimpleSymbol Lit80;
    static final SimpleSymbol Lit81;
    static final IntNum Lit82;
    static final SimpleSymbol Lit83;
    static final IntNum Lit84;
    static final IntNum Lit85;
    static final IntNum Lit86;
    static final SimpleSymbol Lit87;
    static final IntNum Lit88;
    static final FString Lit89;
    static final PairWithPosition Lit9;
    static final SimpleSymbol Lit90;
    static final SimpleSymbol Lit91;
    static final FString Lit92;
    static final SimpleSymbol Lit93;
    static final FString Lit94;
    static final FString Lit95;
    static final IntNum Lit96;
    static final IntNum Lit97;
    static final FString Lit98;
    static final SimpleSymbol Lit99;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn23 = null;
    static final ModuleMethod lambda$Fn24 = null;
    static final ModuleMethod lambda$Fn25 = null;
    static final ModuleMethod lambda$Fn26 = null;
    static final ModuleMethod lambda$Fn27 = null;
    static final ModuleMethod lambda$Fn28 = null;
    static final ModuleMethod lambda$Fn29 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public BluetoothClient BluetoothClient1;
    public final ModuleMethod Cadastrar$Initialize;
    public Clock Clock1;
    public final ModuleMethod Clock1$Timer;
    public Label Espaco_entre_btn_e_tela;
    public HorizontalArrangement f5Espao_;
    public HorizontalArrangement HorizontalArrangement1;
    public TextBox Input_Name;
    public TextBox Input_RA;
    public TextBox Input_RFID;
    public Label Label1;
    public ListPicker Lista;
    public final ModuleMethod Lista$AfterPicking;
    public final ModuleMethod Lista$BeforePicking;
    public Notifier Notifier1;
    public TinyDB TinyDB1;
    public TinyWebDB TinyWebDB1;
    public final ModuleMethod TinyWebDB1$GotValue;
    public VerticalArrangement VerticalArrangement1;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public Button btnBack;
    public final ModuleMethod btnBack$Click;
    public Button btnCadastrar;
    public final ModuleMethod btnCadastrar$Click;
    public Button btnLerCartao;
    public final ModuleMethod btnLerCartao$Click;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public Label lbltexto;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    /* compiled from: Cadastrar.yail */
    public class frame extends ModuleBody {
        Cadastrar $main;

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case ArithOp.XOR /*15*/:
                    return Cadastrar.lambda2();
                case SetExp.PROCEDURE /*16*/:
                    this.$main.$define();
                    return Values.empty;
                case Sequence.INT_U8_VALUE /*17*/:
                    return Cadastrar.lambda3();
                case Sequence.INT_S8_VALUE /*18*/:
                    return Cadastrar.lambda5();
                case Sequence.INT_U16_VALUE /*19*/:
                    return Cadastrar.lambda4();
                case Sequence.INT_S16_VALUE /*20*/:
                    return Cadastrar.lambda6();
                case Sequence.INT_U32_VALUE /*21*/:
                    return this.$main.Cadastrar$Initialize();
                case Sequence.INT_S32_VALUE /*22*/:
                    return Cadastrar.lambda7();
                case Sequence.INT_U64_VALUE /*23*/:
                    return Cadastrar.lambda8();
                case Sequence.INT_S64_VALUE /*24*/:
                    return Cadastrar.lambda9();
                case Sequence.FLOAT_VALUE /*25*/:
                    return Cadastrar.lambda10();
                case Sequence.DOUBLE_VALUE /*26*/:
                    return this.$main.btnBack$Click();
                case Sequence.BOOLEAN_VALUE /*27*/:
                    return Cadastrar.lambda11();
                case Sequence.TEXT_BYTE_VALUE /*28*/:
                    return Cadastrar.lambda12();
                case Sequence.CHAR_VALUE /*29*/:
                    return this.$main.btnLerCartao$Click();
                case XDataType.DAY_TIME_DURATION_TYPE_CODE /*30*/:
                    return Cadastrar.lambda13();
                case Sequence.CDATA_VALUE /*31*/:
                    return Cadastrar.lambda14();
                case SetExp.SET_IF_UNBOUND /*32*/:
                    return Cadastrar.lambda15();
                case Sequence.ELEMENT_VALUE /*33*/:
                    return Cadastrar.lambda16();
                case Sequence.DOCUMENT_VALUE /*34*/:
                    return Cadastrar.lambda17();
                case Sequence.ATTRIBUTE_VALUE /*35*/:
                    return Cadastrar.lambda18();
                case Sequence.COMMENT_VALUE /*36*/:
                    return Cadastrar.lambda19();
                case Sequence.PROCESSING_INSTRUCTION_VALUE /*37*/:
                    return Cadastrar.lambda20();
                case XDataType.STRING_TYPE_CODE /*38*/:
                    return Cadastrar.lambda21();
                case XDataType.NORMALIZED_STRING_TYPE_CODE /*39*/:
                    return Cadastrar.lambda22();
                case XDataType.TOKEN_TYPE_CODE /*40*/:
                    return Cadastrar.lambda23();
                case XDataType.LANGUAGE_TYPE_CODE /*41*/:
                    return Cadastrar.lambda24();
                case XDataType.NMTOKEN_TYPE_CODE /*42*/:
                    return Cadastrar.lambda25();
                case XDataType.NAME_TYPE_CODE /*43*/:
                    return Cadastrar.lambda26();
                case XDataType.NCNAME_TYPE_CODE /*44*/:
                    return this.$main.btnCadastrar$Click();
                case XDataType.ID_TYPE_CODE /*45*/:
                    return Cadastrar.lambda27();
                case XDataType.IDREF_TYPE_CODE /*46*/:
                    return Cadastrar.lambda28();
                case XDataType.ENTITY_TYPE_CODE /*47*/:
                    return this.$main.Lista$AfterPicking();
                case XDataType.UNTYPED_TYPE_CODE /*48*/:
                    return this.$main.Lista$BeforePicking();
                case 49:
                    return Cadastrar.lambda29();
                case 50:
                    return Cadastrar.lambda30();
                case 51:
                    return this.$main.Clock1$Timer();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
                case ArithOp.XOR /*15*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case SetExp.PROCEDURE /*16*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_U8_VALUE /*17*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_S8_VALUE /*18*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_U16_VALUE /*19*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_S16_VALUE /*20*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_U32_VALUE /*21*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_S32_VALUE /*22*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_U64_VALUE /*23*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_S64_VALUE /*24*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.FLOAT_VALUE /*25*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.DOUBLE_VALUE /*26*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.BOOLEAN_VALUE /*27*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.TEXT_BYTE_VALUE /*28*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.CHAR_VALUE /*29*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.DAY_TIME_DURATION_TYPE_CODE /*30*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.CDATA_VALUE /*31*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case SetExp.SET_IF_UNBOUND /*32*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.ELEMENT_VALUE /*33*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.DOCUMENT_VALUE /*34*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.ATTRIBUTE_VALUE /*35*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.COMMENT_VALUE /*36*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.PROCESSING_INSTRUCTION_VALUE /*37*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.STRING_TYPE_CODE /*38*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.NORMALIZED_STRING_TYPE_CODE /*39*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.TOKEN_TYPE_CODE /*40*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.LANGUAGE_TYPE_CODE /*41*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.NMTOKEN_TYPE_CODE /*42*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.NAME_TYPE_CODE /*43*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.NCNAME_TYPE_CODE /*44*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.ID_TYPE_CODE /*45*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.IDREF_TYPE_CODE /*46*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.ENTITY_TYPE_CODE /*47*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.UNTYPED_TYPE_CODE /*48*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 49:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 50:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 51:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case ParseFormat.SEEN_MINUS /*1*/:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case XDataType.ANY_ATOMIC_TYPE_CODE /*3*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case ArithOp.DIVIDE_INEXACT /*5*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case ArithOp.ASHIFT_LEFT /*10*/:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case ArithOp.ASHIFT_RIGHT /*11*/:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case ArithOp.LSHIFT_RIGHT /*12*/:
                    if (!(obj instanceof Cadastrar)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod, obj, callContext);
            }
        }

        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            switch (moduleMethod.selector) {
                case SetExp.DEFINING_FLAG /*2*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case XDataType.ANY_ATOMIC_TYPE_CODE /*3*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case ArithOp.QUOTIENT /*6*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case ArithOp.QUOTIENT_EXACT /*7*/:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case ArithOp.ASHIFT_GENERAL /*9*/:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case ArithOp.IOR /*14*/:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 52:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                default:
                    return super.match2(moduleMethod, obj, obj2, callContext);
            }
        }

        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            switch (moduleMethod.selector) {
                case SetExp.PREFER_BINDING2 /*8*/:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case ArithOp.AND /*13*/:
                    if (!(obj instanceof Cadastrar)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    if (!(obj4 instanceof String)) {
                        return -786428;
                    }
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod, obj, obj2, obj3, obj4, callContext);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case ParseFormat.SEEN_MINUS /*1*/:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case XDataType.ANY_ATOMIC_TYPE_CODE /*3*/:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "lookup-in-form-environment", 1, obj);
                    }
                case ArithOp.DIVIDE_INEXACT /*5*/:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "is-bound-in-form-environment", 1, obj);
                    }
                case ArithOp.ASHIFT_LEFT /*10*/:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case ArithOp.ASHIFT_RIGHT /*11*/:
                    this.$main.sendError(obj);
                    return Values.empty;
                case ArithOp.LSHIFT_RIGHT /*12*/:
                    this.$main.processException(obj);
                    return Values.empty;
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            switch (moduleMethod.selector) {
                case SetExp.PREFER_BINDING2 /*8*/:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case ArithOp.AND /*13*/:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj, (String) obj2, (String) obj3, (Object[]) obj4) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    throw new WrongType(e, "dispatchEvent", 4, obj4);
                                }
                            } catch (ClassCastException e2) {
                                throw new WrongType(e2, "dispatchEvent", 3, obj3);
                            }
                        } catch (ClassCastException e22) {
                            throw new WrongType(e22, "dispatchEvent", 2, obj2);
                        }
                    } catch (ClassCastException e222) {
                        throw new WrongType(e222, "dispatchEvent", 1, obj);
                    }
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case SetExp.DEFINING_FLAG /*2*/:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case XDataType.ANY_ATOMIC_TYPE_CODE /*3*/:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case ArithOp.QUOTIENT /*6*/:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e22) {
                        throw new WrongType(e22, "add-to-global-var-environment", 1, obj);
                    }
                case ArithOp.QUOTIENT_EXACT /*7*/:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case ArithOp.ASHIFT_GENERAL /*9*/:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case ArithOp.IOR /*14*/:
                    return this.$main.lookupHandler(obj, obj2);
                case 52:
                    return this.$main.TinyWebDB1$GotValue(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }
    }

    static {
        Lit189 = (SimpleSymbol) new SimpleSymbol("any").readResolve();
        Lit188 = (SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve();
        Lit187 = (SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve();
        Lit186 = (SimpleSymbol) new SimpleSymbol("send-error").readResolve();
        Lit185 = (SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve();
        Lit184 = (SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve();
        Lit183 = (SimpleSymbol) new SimpleSymbol("add-to-components").readResolve();
        Lit182 = (SimpleSymbol) new SimpleSymbol("add-to-events").readResolve();
        Lit181 = (SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve();
        Lit180 = (SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve();
        Lit179 = (SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve();
        Lit178 = (SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve();
        Lit177 = (SimpleSymbol) new SimpleSymbol("android-log-form").readResolve();
        Lit176 = (SimpleSymbol) new SimpleSymbol("GotValue").readResolve();
        Lit175 = (SimpleSymbol) new SimpleSymbol("TinyWebDB1$GotValue").readResolve();
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit30 = simpleSymbol;
        Lit174 = PairWithPosition.make(simpleSymbol, PairWithPosition.make(Lit189, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 839798), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 839792);
        Lit173 = (SimpleSymbol) new SimpleSymbol("$valueFromWebDB").readResolve();
        Lit172 = new FString("com.google.appinventor.components.runtime.TinyWebDB");
        Lit171 = new FString("com.google.appinventor.components.runtime.TinyWebDB");
        Lit170 = new FString("com.google.appinventor.components.runtime.TinyDB");
        Lit169 = new FString("com.google.appinventor.components.runtime.TinyDB");
        Lit168 = (SimpleSymbol) new SimpleSymbol("Timer").readResolve();
        Lit167 = (SimpleSymbol) new SimpleSymbol("Clock1$Timer").readResolve();
        Lit166 = (SimpleSymbol) new SimpleSymbol("$ParameterByte").readResolve();
        simpleSymbol = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit28 = simpleSymbol;
        Lit165 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 791129);
        Lit164 = (SimpleSymbol) new SimpleSymbol("ReceiveText").readResolve();
        Lit163 = PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 790791), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 790783);
        Lit162 = (SimpleSymbol) new SimpleSymbol("BytesAvailableToReceive").readResolve();
        Lit161 = (SimpleSymbol) new SimpleSymbol("IsConnected").readResolve();
        Lit160 = IntNum.make(0);
        Lit159 = new FString("com.google.appinventor.components.runtime.Clock");
        Lit158 = IntNum.make(500);
        Lit157 = (SimpleSymbol) new SimpleSymbol("TimerInterval").readResolve();
        Lit156 = new FString("com.google.appinventor.components.runtime.Clock");
        Lit155 = new FString("com.google.appinventor.components.runtime.Notifier");
        Lit154 = new FString("com.google.appinventor.components.runtime.Notifier");
        Lit153 = new FString("com.google.appinventor.components.runtime.BluetoothClient");
        Lit152 = new FString("com.google.appinventor.components.runtime.BluetoothClient");
        Lit151 = (SimpleSymbol) new SimpleSymbol("BeforePicking").readResolve();
        Lit150 = (SimpleSymbol) new SimpleSymbol("Lista$BeforePicking").readResolve();
        Lit149 = (SimpleSymbol) new SimpleSymbol("list").readResolve();
        Lit148 = (SimpleSymbol) new SimpleSymbol("AddressesAndNames").readResolve();
        Lit147 = (SimpleSymbol) new SimpleSymbol("Elements").readResolve();
        Lit146 = (SimpleSymbol) new SimpleSymbol("AfterPicking").readResolve();
        Lit145 = (SimpleSymbol) new SimpleSymbol("Lista$AfterPicking").readResolve();
        Lit144 = PairWithPosition.make(Lit30, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 704626);
        Lit143 = (SimpleSymbol) new SimpleSymbol("Selection").readResolve();
        Lit142 = (SimpleSymbol) new SimpleSymbol("Connect").readResolve();
        Lit141 = new FString("com.google.appinventor.components.runtime.ListPicker");
        Lit140 = new FString("com.google.appinventor.components.runtime.ListPicker");
        Lit139 = (SimpleSymbol) new SimpleSymbol("btnCadastrar$Click").readResolve();
        Lit138 = PairWithPosition.make(Lit30, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 660712);
        Lit137 = PairWithPosition.make(Lit30, PairWithPosition.make(Lit189, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 660439), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 660433);
        Lit136 = PairWithPosition.make(Lit30, PairWithPosition.make(Lit189, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 660425), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 660419);
        Lit135 = PairWithPosition.make(Lit30, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 660260);
        Lit134 = PairWithPosition.make(Lit30, PairWithPosition.make(Lit189, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 660177), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 660171);
        Lit133 = (SimpleSymbol) new SimpleSymbol("StoreValue").readResolve();
        Lit132 = PairWithPosition.make(Lit149, PairWithPosition.make(Lit189, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 660047), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 660041);
        Lit131 = PairWithPosition.make(Lit189, PairWithPosition.make(Lit189, PairWithPosition.make(Lit189, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 660017), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 660013), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 660008);
        Lit130 = (SimpleSymbol) new SimpleSymbol("$cards").readResolve();
        Lit129 = PairWithPosition.make(Lit30, PairWithPosition.make(Lit189, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 659753), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 659747);
        Lit128 = (SimpleSymbol) new SimpleSymbol("TinyDB1").readResolve();
        Lit127 = PairWithPosition.make(Lit30, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 659536);
        Lit126 = new FString("com.google.appinventor.components.runtime.Button");
        Lit125 = (SimpleSymbol) new SimpleSymbol("Visible").readResolve();
        Lit124 = IntNum.make(21);
        Lit123 = new FString("com.google.appinventor.components.runtime.Button");
        Lit122 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit121 = IntNum.make(150);
        Lit120 = (SimpleSymbol) new SimpleSymbol("Espa\u00e7o_").readResolve();
        Lit119 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit118 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit117 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit116 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit115 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit114 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit113 = (SimpleSymbol) new SimpleSymbol("Hint").readResolve();
        Lit112 = IntNum.make(16);
        Lit111 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit110 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit109 = IntNum.make(-1080);
        Lit108 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve();
        Lit107 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit106 = new FString("com.google.appinventor.components.runtime.Label");
        Lit105 = (SimpleSymbol) new SimpleSymbol("lbltexto").readResolve();
        Lit104 = new FString("com.google.appinventor.components.runtime.Label");
        Lit103 = (SimpleSymbol) new SimpleSymbol("btnLerCartao$Click").readResolve();
        Lit102 = (SimpleSymbol) new SimpleSymbol("TimerEnabled").readResolve();
        Lit101 = (SimpleSymbol) new SimpleSymbol("Clock1").readResolve();
        Lit100 = (SimpleSymbol) new SimpleSymbol("Open").readResolve();
        Lit99 = (SimpleSymbol) new SimpleSymbol("Lista").readResolve();
        Lit98 = new FString("com.google.appinventor.components.runtime.Button");
        Lit97 = IntNum.make(-1080);
        int[] iArr = new int[2];
        iArr[0] = Component.COLOR_PINK;
        Lit96 = IntNum.make(iArr);
        Lit95 = new FString("com.google.appinventor.components.runtime.Button");
        Lit94 = new FString("com.google.appinventor.components.runtime.Label");
        Lit93 = (SimpleSymbol) new SimpleSymbol("Label1").readResolve();
        Lit92 = new FString("com.google.appinventor.components.runtime.Label");
        Lit91 = (SimpleSymbol) new SimpleSymbol("Click").readResolve();
        Lit90 = (SimpleSymbol) new SimpleSymbol("btnBack$Click").readResolve();
        Lit89 = new FString("com.google.appinventor.components.runtime.Button");
        Lit88 = IntNum.make(2);
        Lit87 = (SimpleSymbol) new SimpleSymbol("Shape").readResolve();
        Lit86 = IntNum.make((int) DateTime.TIMEZONE_MASK);
        Lit85 = IntNum.make(32);
        Lit84 = IntNum.make(1);
        Lit83 = (SimpleSymbol) new SimpleSymbol("FontTypeface").readResolve();
        Lit82 = IntNum.make(13);
        Lit81 = (SimpleSymbol) new SimpleSymbol("FontSize").readResolve();
        Lit80 = (SimpleSymbol) new SimpleSymbol("FontBold").readResolve();
        iArr = new int[2];
        iArr[0] = Component.COLOR_PINK;
        Lit79 = IntNum.make(iArr);
        Lit78 = new FString("com.google.appinventor.components.runtime.Button");
        Lit77 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit76 = IntNum.make(-2);
        Lit75 = (SimpleSymbol) new SimpleSymbol("Width").readResolve();
        Lit74 = IntNum.make(35);
        Lit73 = (SimpleSymbol) new SimpleSymbol("Height").readResolve();
        Lit72 = IntNum.make((int) Component.COLOR_NONE);
        Lit71 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve();
        Lit70 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit69 = new FString("com.google.appinventor.components.runtime.Label");
        Lit68 = (SimpleSymbol) new SimpleSymbol("Espaco_entre_btn_e_tela").readResolve();
        Lit67 = new FString("com.google.appinventor.components.runtime.Label");
        Lit66 = (SimpleSymbol) new SimpleSymbol("Initialize").readResolve();
        Lit65 = (SimpleSymbol) new SimpleSymbol("Cadastrar$Initialize").readResolve();
        Lit64 = PairWithPosition.make(Lit30, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 95571);
        Lit63 = (SimpleSymbol) new SimpleSymbol("GetValue").readResolve();
        Lit62 = (SimpleSymbol) new SimpleSymbol("TinyWebDB1").readResolve();
        Lit61 = PairWithPosition.make(Lit30, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 95487);
        Lit60 = (SimpleSymbol) new SimpleSymbol("ShowAlert").readResolve();
        Lit59 = (SimpleSymbol) new SimpleSymbol("Notifier1").readResolve();
        simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve();
        Lit36 = simpleSymbol;
        Lit58 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 95338);
        Lit57 = (SimpleSymbol) new SimpleSymbol("Enabled").readResolve();
        Lit56 = (SimpleSymbol) new SimpleSymbol("BluetoothClient1").readResolve();
        Lit55 = (SimpleSymbol) new SimpleSymbol("TextColor").readResolve();
        Lit54 = (SimpleSymbol) new SimpleSymbol("btnCadastrar").readResolve();
        Lit53 = (SimpleSymbol) new SimpleSymbol("btnLerCartao").readResolve();
        Lit52 = (SimpleSymbol) new SimpleSymbol("$backgroundColor").readResolve();
        Lit51 = (SimpleSymbol) new SimpleSymbol("btnBack").readResolve();
        Lit50 = (SimpleSymbol) new SimpleSymbol("$fontColor").readResolve();
        Lit49 = PairWithPosition.make(Lit149, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 94580);
        Lit48 = PairWithPosition.make(Lit189, PairWithPosition.make(Lit189, PairWithPosition.make(Lit189, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 94557), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 94553), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 94548);
        Lit47 = IntNum.make(229);
        Lit46 = IntNum.make(246);
        Lit45 = IntNum.make(239);
        Lit44 = PairWithPosition.make(Lit149, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 94391);
        Lit43 = PairWithPosition.make(Lit189, PairWithPosition.make(Lit189, PairWithPosition.make(Lit189, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 94368), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 94364), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 94359);
        Lit42 = IntNum.make(45);
        Lit41 = IntNum.make(168);
        Lit40 = IntNum.make(91);
        Lit39 = (SimpleSymbol) new SimpleSymbol("TitleVisible").readResolve();
        Lit38 = (SimpleSymbol) new SimpleSymbol("Title").readResolve();
        Lit37 = (SimpleSymbol) new SimpleSymbol("Sizing").readResolve();
        Lit35 = (SimpleSymbol) new SimpleSymbol("Scrollable").readResolve();
        Lit34 = (SimpleSymbol) new SimpleSymbol("OpenScreenAnimation").readResolve();
        Lit33 = (SimpleSymbol) new SimpleSymbol("CloseScreenAnimation").readResolve();
        iArr = new int[2];
        iArr[0] = Component.COLOR_LTGRAY;
        Lit32 = IntNum.make(iArr);
        Lit31 = (SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve();
        Lit29 = (SimpleSymbol) new SimpleSymbol("AppName").readResolve();
        Lit27 = IntNum.make(3);
        Lit26 = (SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve();
        Lit25 = PairWithPosition.make(Lit36, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 33559);
        Lit24 = PairWithPosition.make(Lit189, PairWithPosition.make(Lit149, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 33536), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 33531);
        Lit23 = PairWithPosition.make(Lit189, PairWithPosition.make(Lit189, PairWithPosition.make(Lit189, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 33508), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 33504), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 33499);
        Lit22 = PairWithPosition.make(Lit189, PairWithPosition.make(Lit189, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 33486), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 33481);
        Lit21 = PairWithPosition.make(Lit30, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 33464);
        Lit20 = PairWithPosition.make(Lit189, PairWithPosition.make(Lit189, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 33306), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 33301);
        Lit19 = PairWithPosition.make(Lit30, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 33284);
        Lit18 = PairWithPosition.make(Lit189, PairWithPosition.make(Lit189, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 33128), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 33123);
        Lit17 = PairWithPosition.make(Lit30, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 33106);
        Lit16 = PairWithPosition.make(Lit36, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 33559);
        Lit15 = PairWithPosition.make(Lit189, PairWithPosition.make(Lit149, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 33536), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 33531);
        Lit14 = PairWithPosition.make(Lit189, PairWithPosition.make(Lit189, PairWithPosition.make(Lit189, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 33508), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 33504), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 33499);
        Lit13 = PairWithPosition.make(Lit189, PairWithPosition.make(Lit189, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 33486), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 33481);
        Lit12 = PairWithPosition.make(Lit30, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 33464);
        Lit11 = (SimpleSymbol) new SimpleSymbol("Input_Name").readResolve();
        Lit10 = PairWithPosition.make(Lit189, PairWithPosition.make(Lit189, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 33306), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 33301);
        Lit9 = PairWithPosition.make(Lit30, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 33284);
        Lit8 = (SimpleSymbol) new SimpleSymbol("Input_RA").readResolve();
        Lit7 = PairWithPosition.make(Lit189, PairWithPosition.make(Lit189, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 33128), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 33123);
        Lit6 = PairWithPosition.make(Lit30, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Cadastrar.yail", 33106);
        Lit5 = (SimpleSymbol) new SimpleSymbol("Text").readResolve();
        Lit4 = (SimpleSymbol) new SimpleSymbol("Input_RFID").readResolve();
        Lit3 = (SimpleSymbol) new SimpleSymbol("p$filledForm").readResolve();
        Lit2 = (SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve();
        Lit1 = (SimpleSymbol) new SimpleSymbol("getMessage").readResolve();
        Lit0 = (SimpleSymbol) new SimpleSymbol("Cadastrar").readResolve();
    }

    public Cadastrar() {
        ModuleInfo.register(this);
        ModuleBody appinventor_ai_efelipecarlos_Caller_Cadastrar_frame = new frame();
        appinventor_ai_efelipecarlos_Caller_Cadastrar_frame.$main = this;
        this.android$Mnlog$Mnform = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 1, Lit177, 4097);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 2, Lit178, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 3, Lit179, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 5, Lit180, 4097);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 6, Lit181, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 7, Lit182, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 8, Lit183, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 9, Lit184, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 10, Lit185, 4097);
        this.send$Mnerror = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 11, Lit186, 4097);
        this.process$Mnexception = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 12, "process-exception", 4097);
        this.dispatchEvent = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 13, Lit187, 16388);
        this.lookup$Mnhandler = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 14, Lit188, 8194);
        PropertySet moduleMethod = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 15, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime3960804766349238341.scm:547");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 16, "$define", 0);
        lambda$Fn2 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 17, null, 0);
        lambda$Fn4 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 18, null, 0);
        lambda$Fn3 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 19, null, 0);
        lambda$Fn5 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 20, null, 0);
        this.Cadastrar$Initialize = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 21, Lit65, 0);
        lambda$Fn6 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 22, null, 0);
        lambda$Fn7 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 23, null, 0);
        lambda$Fn8 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 24, null, 0);
        lambda$Fn9 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 25, null, 0);
        this.btnBack$Click = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 26, Lit90, 0);
        lambda$Fn10 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 27, null, 0);
        lambda$Fn11 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 28, null, 0);
        this.btnLerCartao$Click = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 29, Lit103, 0);
        lambda$Fn12 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 30, null, 0);
        lambda$Fn13 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 31, null, 0);
        lambda$Fn14 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 32, null, 0);
        lambda$Fn15 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 33, null, 0);
        lambda$Fn16 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 34, null, 0);
        lambda$Fn17 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 35, null, 0);
        lambda$Fn18 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 36, null, 0);
        lambda$Fn19 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 37, null, 0);
        lambda$Fn20 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 38, null, 0);
        lambda$Fn21 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 39, null, 0);
        lambda$Fn22 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 40, null, 0);
        lambda$Fn23 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 41, null, 0);
        lambda$Fn24 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 42, null, 0);
        lambda$Fn25 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 43, null, 0);
        this.btnCadastrar$Click = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 44, Lit139, 0);
        lambda$Fn26 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 45, null, 0);
        lambda$Fn27 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 46, null, 0);
        this.Lista$AfterPicking = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 47, Lit145, 0);
        this.Lista$BeforePicking = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 48, Lit150, 0);
        lambda$Fn28 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 49, null, 0);
        lambda$Fn29 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 50, null, 0);
        this.Clock1$Timer = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 51, Lit167, 0);
        this.TinyWebDB1$GotValue = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Cadastrar_frame, 52, Lit175, 8194);
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    public void run() {
        Throwable th;
        CallContext instance = CallContext.getInstance();
        Consumer consumer = instance.consumer;
        instance.consumer = VoidConsumer.instance;
        try {
            run(instance);
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        ModuleBody.runCleanup(instance, th, consumer);
    }

    public final void run(CallContext $ctx) {
        Consumer $result = $ctx.consumer;
        Object find = require.find("com.google.youngandroid.runtime");
        try {
            String str;
            ((Runnable) find).run();
            this.$Stdebug$Mnform$St = Boolean.FALSE;
            this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
            FString stringAppend = strings.stringAppend(misc.symbol$To$String(Lit0), "-global-vars");
            if (stringAppend == null) {
                str = null;
            } else {
                str = stringAppend.toString();
            }
            this.global$Mnvar$Mnenvironment = Environment.make(str);
            Cadastrar = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            find = require.find("com.google.youngandroid.runtime");
            try {
                ((Runnable) find).run();
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit3, lambda$Fn2), $result);
                } else {
                    addToGlobalVars(Lit3, lambda$Fn3);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit26, Lit27, Lit28);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit29, "RFID_V3", Lit30);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit31, Lit32, Lit28);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit33, "fade", Lit30);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit34, "zoom", Lit30);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit35, Boolean.TRUE, Lit36);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit37, "Responsive", Lit30);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit38, "Cadastrar", Lit30);
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit39, Boolean.FALSE, Lit36), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn5));
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit65, this.Cadastrar$Initialize);
                } else {
                    addToFormEnvironment(Lit65, this.Cadastrar$Initialize);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Cadastrar", "Initialize");
                } else {
                    addToEvents(Lit0, Lit66);
                }
                this.Espaco_entre_btn_e_tela = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit67, Lit68, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit69, Lit68, Boolean.FALSE);
                }
                this.HorizontalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit70, Lit71, lambda$Fn6), $result);
                } else {
                    addToComponents(Lit0, Lit77, Lit71, lambda$Fn7);
                }
                this.btnBack = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit71, Lit78, Lit51, lambda$Fn8), $result);
                } else {
                    addToComponents(Lit71, Lit89, Lit51, lambda$Fn9);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit90, this.btnBack$Click);
                } else {
                    addToFormEnvironment(Lit90, this.btnBack$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btnBack", "Click");
                } else {
                    addToEvents(Lit51, Lit91);
                }
                this.Label1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit92, Lit93, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit94, Lit93, Boolean.FALSE);
                }
                this.btnLerCartao = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit95, Lit53, lambda$Fn10), $result);
                } else {
                    addToComponents(Lit0, Lit98, Lit53, lambda$Fn11);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit103, this.btnLerCartao$Click);
                } else {
                    addToFormEnvironment(Lit103, this.btnLerCartao$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btnLerCartao", "Click");
                } else {
                    addToEvents(Lit53, Lit91);
                }
                this.lbltexto = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit104, Lit105, lambda$Fn12), $result);
                } else {
                    addToComponents(Lit0, Lit106, Lit105, lambda$Fn13);
                }
                this.VerticalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit107, Lit108, lambda$Fn14), $result);
                } else {
                    addToComponents(Lit0, Lit110, Lit108, lambda$Fn15);
                }
                this.Input_RFID = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit108, Lit111, Lit4, lambda$Fn16), $result);
                } else {
                    addToComponents(Lit108, Lit114, Lit4, lambda$Fn17);
                }
                this.Input_RA = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit108, Lit115, Lit8, lambda$Fn18), $result);
                } else {
                    addToComponents(Lit108, Lit116, Lit8, lambda$Fn19);
                }
                this.Input_Name = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit108, Lit117, Lit11, lambda$Fn20), $result);
                } else {
                    addToComponents(Lit108, Lit118, Lit11, lambda$Fn21);
                }
                this.f5Espao_ = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit119, Lit120, lambda$Fn22), $result);
                } else {
                    addToComponents(Lit0, Lit122, Lit120, lambda$Fn23);
                }
                this.btnCadastrar = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit123, Lit54, lambda$Fn24), $result);
                } else {
                    addToComponents(Lit0, Lit126, Lit54, lambda$Fn25);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit139, this.btnCadastrar$Click);
                } else {
                    addToFormEnvironment(Lit139, this.btnCadastrar$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btnCadastrar", "Click");
                } else {
                    addToEvents(Lit54, Lit91);
                }
                this.Lista = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit140, Lit99, lambda$Fn26), $result);
                } else {
                    addToComponents(Lit0, Lit141, Lit99, lambda$Fn27);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit145, this.Lista$AfterPicking);
                } else {
                    addToFormEnvironment(Lit145, this.Lista$AfterPicking);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Lista", "AfterPicking");
                } else {
                    addToEvents(Lit99, Lit146);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit150, this.Lista$BeforePicking);
                } else {
                    addToFormEnvironment(Lit150, this.Lista$BeforePicking);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Lista", "BeforePicking");
                } else {
                    addToEvents(Lit99, Lit151);
                }
                this.BluetoothClient1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit152, Lit56, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit153, Lit56, Boolean.FALSE);
                }
                this.Notifier1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit154, Lit59, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit155, Lit59, Boolean.FALSE);
                }
                this.Clock1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit156, Lit101, lambda$Fn28), $result);
                } else {
                    addToComponents(Lit0, Lit159, Lit101, lambda$Fn29);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit167, this.Clock1$Timer);
                } else {
                    addToFormEnvironment(Lit167, this.Clock1$Timer);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Clock1", "Timer");
                } else {
                    addToEvents(Lit101, Lit168);
                }
                this.TinyDB1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit169, Lit128, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit170, Lit128, Boolean.FALSE);
                }
                this.TinyWebDB1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit171, Lit62, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit172, Lit62, Boolean.FALSE);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit175, this.TinyWebDB1$GotValue);
                } else {
                    addToFormEnvironment(Lit175, this.TinyWebDB1$GotValue);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "TinyWebDB1", "GotValue");
                } else {
                    addToEvents(Lit62, Lit176);
                }
                runtime.initRuntime();
            } catch (ClassCastException e) {
                throw new WrongType(e, "java.lang.Runnable.run()", 1, find);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "java.lang.Runnable.run()", 1, find);
        }
    }

    static Object lambda3() {
        return runtime.callYailPrimitive(runtime.yail$Mnnot, LList.list1(runtime.callYailPrimitive(runtime.yail$Mnlist$Mnmember$Qu, LList.list2(Boolean.FALSE, runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list3(runtime.callYailPrimitive(runtime.yail$Mnnot$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit4, Lit5), runtime.callYailPrimitive(runtime.string$Mntrim, LList.list1(ElementType.MATCH_ANY_LOCALNAME), Lit6, "trim")), Lit7, "="), runtime.callYailPrimitive(runtime.yail$Mnnot$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit8, Lit5), runtime.callYailPrimitive(runtime.string$Mntrim, LList.list1(ElementType.MATCH_ANY_LOCALNAME), Lit9, "trim")), Lit10, "="), runtime.callYailPrimitive(runtime.yail$Mnnot$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit11, Lit5), runtime.callYailPrimitive(runtime.string$Mntrim, LList.list1(ElementType.MATCH_ANY_LOCALNAME), Lit12, "trim")), Lit13, "=")), Lit14, "make a list")), Lit15, "is in list?")), Lit16, "not");
    }

    static Procedure lambda4() {
        return lambda$Fn4;
    }

    static Object lambda5() {
        return runtime.callYailPrimitive(runtime.yail$Mnnot, LList.list1(runtime.callYailPrimitive(runtime.yail$Mnlist$Mnmember$Qu, LList.list2(Boolean.FALSE, runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list3(runtime.callYailPrimitive(runtime.yail$Mnnot$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit4, Lit5), runtime.callYailPrimitive(runtime.string$Mntrim, LList.list1(ElementType.MATCH_ANY_LOCALNAME), Lit17, "trim")), Lit18, "="), runtime.callYailPrimitive(runtime.yail$Mnnot$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit8, Lit5), runtime.callYailPrimitive(runtime.string$Mntrim, LList.list1(ElementType.MATCH_ANY_LOCALNAME), Lit19, "trim")), Lit20, "="), runtime.callYailPrimitive(runtime.yail$Mnnot$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit11, Lit5), runtime.callYailPrimitive(runtime.string$Mntrim, LList.list1(ElementType.MATCH_ANY_LOCALNAME), Lit21, "trim")), Lit22, "=")), Lit23, "make a list")), Lit24, "is in list?")), Lit25, "not");
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit26, Lit27, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit29, "RFID_V3", Lit30);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit31, Lit32, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit33, "fade", Lit30);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit34, "zoom", Lit30);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit35, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit37, "Responsive", Lit30);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit38, "Cadastrar", Lit30);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit39, Boolean.FALSE, Lit36);
    }

    public Object Cadastrar$Initialize() {
        Object signalRuntimeError;
        runtime.setThisForm();
        Object $backgroundColor = runtime.callYailPrimitive(runtime.make$Mncolor, LList.list1(runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list3(Lit40, Lit41, Lit42), Lit43, "make a list")), Lit44, "make-color");
        Object $fontColor = runtime.callYailPrimitive(runtime.make$Mncolor, LList.list1(runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list3(Lit45, Lit46, Lit47), Lit48, "make a list")), Lit49, "make-color");
        SimpleSymbol simpleSymbol = Lit0;
        SimpleSymbol simpleSymbol2 = Lit31;
        if ($fontColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit50), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $fontColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit28);
        simpleSymbol = Lit51;
        simpleSymbol2 = Lit31;
        if ($backgroundColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit52), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $backgroundColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit28);
        simpleSymbol = Lit53;
        simpleSymbol2 = Lit31;
        if ($backgroundColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit52), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $backgroundColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit28);
        simpleSymbol = Lit54;
        simpleSymbol2 = Lit31;
        if ($backgroundColor instanceof Package) {
            $backgroundColor = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit52), " is not bound in the current context"), "Unbound Variable");
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, $backgroundColor, Lit28);
        simpleSymbol = Lit51;
        simpleSymbol2 = Lit55;
        if ($fontColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit50), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $fontColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit28);
        simpleSymbol = Lit53;
        simpleSymbol2 = Lit55;
        if ($fontColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit50), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $fontColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit28);
        simpleSymbol = Lit54;
        simpleSymbol2 = Lit55;
        if ($fontColor instanceof Package) {
            $fontColor = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit50), " is not bound in the current context"), "Unbound Variable");
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, $fontColor, Lit28);
        if (runtime.callYailPrimitive(runtime.yail$Mnnot, LList.list1(runtime.getProperty$1(Lit56, Lit57)), Lit58, "not") != Boolean.FALSE) {
            runtime.callComponentMethod(Lit59, Lit60, LList.list1("Bluetooth is not enabled - use Settings to turn BT on"), Lit61);
        }
        return runtime.callComponentMethod(Lit62, Lit63, LList.list1("users"), Lit64);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit71, Lit31, Lit72, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit71, Lit73, Lit74, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit71, Lit75, Lit76, Lit28);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit71, Lit31, Lit72, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit71, Lit73, Lit74, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit71, Lit75, Lit76, Lit28);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit51, Lit31, Lit79, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit80, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit81, Lit82, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit83, Lit84, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit73, Lit85, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit75, Lit86, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit87, Lit88, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit51, Lit5, "RETURN", Lit30);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit51, Lit31, Lit79, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit80, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit81, Lit82, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit83, Lit84, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit73, Lit85, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit75, Lit86, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit87, Lit88, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit51, Lit5, "RETURN", Lit30);
    }

    public Object btnBack$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.close$Mnscreen, LList.Empty, LList.Empty, "close screen");
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit53, Lit31, Lit96, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit80, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit81, Lit82, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit83, Lit84, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit73, Lit85, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit75, Lit97, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit87, Lit88, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit53, Lit5, "CONNECT TO CALLER DEVICE", Lit30);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit53, Lit31, Lit96, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit80, Boolean.TRUE, Lit36);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit81, Lit82, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit83, Lit84, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit73, Lit85, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit75, Lit97, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit87, Lit88, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit53, Lit5, "CONNECT TO CALLER DEVICE", Lit30);
    }

    public Object btnLerCartao$Click() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit99, Lit100, LList.Empty, LList.Empty);
        return runtime.setAndCoerceProperty$Ex(Lit101, Lit102, Boolean.TRUE, Lit36);
    }

    static Object lambda13() {
        return runtime.setAndCoerceProperty$Ex(Lit105, Lit5, " '", Lit30);
    }

    static Object lambda14() {
        return runtime.setAndCoerceProperty$Ex(Lit105, Lit5, " '", Lit30);
    }

    static Object lambda15() {
        return runtime.setAndCoerceProperty$Ex(Lit108, Lit75, Lit109, Lit28);
    }

    static Object lambda16() {
        return runtime.setAndCoerceProperty$Ex(Lit108, Lit75, Lit109, Lit28);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit4, Lit81, Lit112, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit4, Lit75, Lit76, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit4, Lit113, "Place your card over the Caller device", Lit30);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit4, Lit81, Lit112, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit4, Lit75, Lit76, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit4, Lit113, "Place your card over the Caller device", Lit30);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit8, Lit81, Lit112, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit8, Lit75, Lit76, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit8, Lit113, "Insert your R.A", Lit30);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit8, Lit81, Lit112, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit8, Lit75, Lit76, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit8, Lit113, "Insert your R.A", Lit30);
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit11, Lit81, Lit112, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit75, Lit76, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit11, Lit113, "Insert your name", Lit30);
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit11, Lit81, Lit112, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit11, Lit75, Lit76, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit11, Lit113, "Insert your name", Lit30);
    }

    static Object lambda23() {
        return runtime.setAndCoerceProperty$Ex(Lit120, Lit73, Lit121, Lit28);
    }

    static Object lambda24() {
        return runtime.setAndCoerceProperty$Ex(Lit120, Lit73, Lit121, Lit28);
    }

    static Object lambda25() {
        runtime.setAndCoerceProperty$Ex(Lit54, Lit81, Lit124, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit83, Lit84, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit87, Lit84, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit5, "Cadastrar", Lit30);
        return runtime.setAndCoerceProperty$Ex(Lit54, Lit125, Boolean.FALSE, Lit36);
    }

    static Object lambda26() {
        runtime.setAndCoerceProperty$Ex(Lit54, Lit81, Lit124, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit83, Lit84, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit87, Lit84, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit5, "Cadastrar", Lit30);
        return runtime.setAndCoerceProperty$Ex(Lit54, Lit125, Boolean.FALSE, Lit36);
    }

    public Object btnCadastrar$Click() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit62, Lit63, LList.list1("users"), Lit127);
        if (Scheme.applyToArgs.apply1(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St)) == Boolean.FALSE) {
            return runtime.callComponentMethod(Lit59, Lit60, LList.list1("Fill in the fields correctly"), Lit138);
        }
        Object signalRuntimeError;
        Object $cards = runtime.callComponentMethod(Lit128, Lit63, LList.list2("cards", runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list")), Lit129);
        ModuleMethod moduleMethod = runtime.yail$Mnlist$Mnadd$Mnto$Mnlist$Ex;
        if ($cards instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit130), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $cards;
        }
        runtime.callYailPrimitive(moduleMethod, LList.list2(signalRuntimeError, runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list3(runtime.getProperty$1(Lit4, Lit5), runtime.getProperty$1(Lit8, Lit5), runtime.getProperty$1(Lit11, Lit5)), Lit131, "make a list")), Lit132, "add items to list");
        SimpleSymbol simpleSymbol = Lit128;
        SimpleSymbol simpleSymbol2 = Lit133;
        String str = "cards";
        if ($cards instanceof Package) {
            $cards = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit130), " is not bound in the current context"), "Unbound Variable");
        }
        runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list2(str, $cards), Lit134);
        runtime.callComponentMethod(Lit59, Lit60, LList.list1("Success!"), Lit135);
        runtime.callComponentMethod(Lit62, Lit133, LList.list2("users", runtime.callComponentMethod(Lit128, Lit63, LList.list2("cards", ElementType.MATCH_ANY_LOCALNAME), Lit136)), Lit137);
        runtime.setAndCoerceProperty$Ex(Lit4, Lit5, ElementType.MATCH_ANY_LOCALNAME, Lit30);
        runtime.setAndCoerceProperty$Ex(Lit8, Lit5, ElementType.MATCH_ANY_LOCALNAME, Lit30);
        return runtime.setAndCoerceProperty$Ex(Lit11, Lit5, ElementType.MATCH_ANY_LOCALNAME, Lit30);
    }

    static Object lambda27() {
        runtime.setAndCoerceProperty$Ex(Lit99, Lit5, "Text for ListPicker1", Lit30);
        return runtime.setAndCoerceProperty$Ex(Lit99, Lit125, Boolean.FALSE, Lit36);
    }

    static Object lambda28() {
        runtime.setAndCoerceProperty$Ex(Lit99, Lit5, "Text for ListPicker1", Lit30);
        return runtime.setAndCoerceProperty$Ex(Lit99, Lit125, Boolean.FALSE, Lit36);
    }

    public Object Lista$AfterPicking() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit56, Lit142, LList.list1(runtime.getProperty$1(Lit99, Lit143)), Lit144) != Boolean.FALSE ? Boolean.FALSE : Values.empty;
    }

    public Object Lista$BeforePicking() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit99, Lit147, runtime.getProperty$1(Lit56, Lit148), Lit149);
    }

    static Object lambda29() {
        return runtime.setAndCoerceProperty$Ex(Lit101, Lit157, Lit158, Lit28);
    }

    static Object lambda30() {
        return runtime.setAndCoerceProperty$Ex(Lit101, Lit157, Lit158, Lit28);
    }

    public Object Clock1$Timer() {
        runtime.setThisForm();
        IntNum $ParameterByte = Lit160;
        if (runtime.getProperty$1(Lit56, Lit161) == Boolean.FALSE) {
            return Values.empty;
        }
        if (runtime.callYailPrimitive(Scheme.numGrt, LList.list2(runtime.callComponentMethod(Lit56, Lit162, LList.Empty, LList.Empty), Lit160), Lit163, ">") == Boolean.FALSE) {
            return Values.empty;
        }
        runtime.callComponentMethod(Lit56, Lit162, LList.Empty, LList.Empty);
        $ParameterByte = runtime.callComponentMethod(Lit56, Lit164, LList.list1(runtime.callComponentMethod(Lit56, Lit162, LList.Empty, LList.Empty)), Lit165);
        runtime.setAndCoerceProperty$Ex(Lit54, Lit125, Boolean.TRUE, Lit36);
        SimpleSymbol simpleSymbol = Lit4;
        SimpleSymbol simpleSymbol2 = Lit5;
        if ($ParameterByte instanceof Package) {
            $ParameterByte = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit166), " is not bound in the current context"), "Unbound Variable");
        }
        return runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, $ParameterByte, Lit30);
    }

    public Object TinyWebDB1$GotValue(Object $tagFromWebDB, Object $valueFromWebDB) {
        runtime.sanitizeComponentData($tagFromWebDB);
        $valueFromWebDB = runtime.sanitizeComponentData($valueFromWebDB);
        runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit128;
        SimpleSymbol simpleSymbol2 = Lit133;
        String str = "cards";
        if ($valueFromWebDB instanceof Package) {
            $valueFromWebDB = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit173), " is not bound in the current context"), "Unbound Variable");
        }
        return runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list2(str, $valueFromWebDB), Lit174);
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.form$Mnenvironment, object));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol name, Object default$Mnvalue) {
        boolean x = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & 1;
        if (x) {
            if (!this.form$Mnenvironment.isBound(name)) {
                return default$Mnvalue;
            }
        } else if (!x) {
            return default$Mnvalue;
        }
        return this.form$Mnenvironment.get(name);
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.global$Mnvar$Mnenvironment, object));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = lists.cons(lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        RetValManager.sendError(error == null ? null : error.toString());
    }

    public void processException(Object ex) {
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    public boolean dispatchEvent(Component componentObject, String registeredComponentName, String eventName, Object[] args) {
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (!isBoundInFormEnvironment(registeredObject)) {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            return false;
        } else if (lookupInFormEnvironment(registeredObject) != componentObject) {
            return false;
        } else {
            try {
                Scheme.apply.apply2(lookupHandler(registeredComponentName, eventName), LList.makeList(args, 0));
                return true;
            } catch (Throwable exception) {
                androidLogForm(exception.getMessage());
                exception.printStackTrace();
                processException(exception);
                return false;
            }
        }
    }

    public Object lookupHandler(Object componentName, Object eventName) {
        String str = null;
        String obj = componentName == null ? null : componentName.toString();
        if (eventName != null) {
            str = eventName.toString();
        }
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(obj, str)));
    }

    public void $define() {
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception exception) {
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        Cadastrar = this;
        addToFormEnvironment(Lit0, this);
        Object obj = this.events$Mnto$Mnregister;
        while (obj != LList.Empty) {
            try {
                Pair arg0 = (Pair) obj;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = lists.car.apply1(event$Mninfo);
                String obj2 = apply1 == null ? null : apply1.toString();
                Object apply12 = lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj2, apply12 == null ? null : apply12.toString());
                obj = arg0.getCdr();
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, obj);
            }
        }
        addToGlobalVars(Lit2, lambda$Fn1);
        Cadastrar closureEnv = this;
        obj = lists.reverse(this.global$Mnvars$Mnto$Mncreate);
        while (obj != LList.Empty) {
            try {
                arg0 = (Pair) obj;
                Object var$Mnval = arg0.getCar();
                Object var = lists.car.apply1(var$Mnval);
                addToGlobalVarEnvironment((Symbol) var, Scheme.applyToArgs.apply1(lists.cadr.apply1(var$Mnval)));
                obj = arg0.getCdr();
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, obj);
            } catch (ClassCastException e22) {
                throw new WrongType(e22, "arg0", -2, obj);
            } catch (ClassCastException e222) {
                throw new WrongType(e222, "add-to-form-environment", 0, component$Mnname);
            } catch (ClassCastException e3) {
                throw new WrongType(e3, "lookup-in-form-environment", 0, apply1);
            } catch (ClassCastException e2222) {
                throw new WrongType(e2222, "arg0", -2, obj);
            } catch (ClassCastException e22222) {
                throw new WrongType(e22222, "arg0", -2, obj);
            } catch (ClassCastException e222222) {
                throw new WrongType(e222222, "add-to-global-var-environment", 0, var);
            } catch (ClassCastException e2222222) {
                throw new WrongType(e2222222, "arg0", -2, obj);
            } catch (YailRuntimeError exception2) {
                processException(exception2);
                return;
            }
        }
        obj = lists.reverse(this.form$Mndo$Mnafter$Mncreation);
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            misc.force(arg0.getCar());
            obj = arg0.getCdr();
        }
        LList component$Mndescriptors = lists.reverse(this.components$Mnto$Mncreate);
        closureEnv = this;
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            Object component$Mninfo = arg0.getCar();
            Object component$Mnname = lists.caddr.apply1(component$Mninfo);
            lists.cadddr.apply1(component$Mninfo);
            Object component$Mnobject = Invoke.make.apply2(lists.cadr.apply1(component$Mninfo), lookupInFormEnvironment((Symbol) lists.car.apply1(component$Mninfo)));
            SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
            addToFormEnvironment((Symbol) component$Mnname, component$Mnobject);
            obj = arg0.getCdr();
        }
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            component$Mninfo = arg0.getCar();
            lists.caddr.apply1(component$Mninfo);
            Boolean init$Mnthunk = lists.cadddr.apply1(component$Mninfo);
            if (init$Mnthunk != Boolean.FALSE) {
                Scheme.applyToArgs.apply1(init$Mnthunk);
            }
            obj = arg0.getCdr();
        }
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            component$Mninfo = arg0.getCar();
            component$Mnname = lists.caddr.apply1(component$Mninfo);
            lists.cadddr.apply1(component$Mninfo);
            callInitialize(SlotGet.field.apply2(this, component$Mnname));
            obj = arg0.getCdr();
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        Object car;
        LList symbols = LList.makeList(argsArray, 0);
        Procedure procedure = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Pair result = LList.Empty;
        Object arg0 = symbols;
        while (arg0 != LList.Empty) {
            try {
                Pair arg02 = (Pair) arg0;
                Object arg03 = arg02.getCdr();
                car = arg02.getCar();
                try {
                    result = Pair.make(misc.symbol$To$String((Symbol) car), result);
                    arg0 = arg03;
                } catch (ClassCastException e) {
                    throw new WrongType(e, "symbol->string", 1, car);
                }
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, arg0);
            }
        }
        car = procedure.apply2(moduleMethod, LList.reverseInPlace(result));
        try {
            return misc.string$To$Symbol((CharSequence) car);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "string->symbol", 1, car);
        }
    }

    static Object lambda2() {
        return null;
    }
}
