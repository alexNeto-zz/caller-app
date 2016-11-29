package appinventor.ai_efelipecarlos.Caller;

import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.ActivityStarter;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import gnu.expr.LambdaExp;
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
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;

/* compiled from: Screen1.yail */
public class Screen1 extends Form implements Runnable {
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final SimpleSymbol Lit10;
    static final SimpleSymbol Lit100;
    static final FString Lit101;
    static final SimpleSymbol Lit102;
    static final FString Lit103;
    static final FString Lit104;
    static final IntNum Lit105;
    static final FString Lit106;
    static final PairWithPosition Lit107;
    static final SimpleSymbol Lit108;
    static final FString Lit109;
    static final SimpleSymbol Lit11;
    static final SimpleSymbol Lit110;
    static final IntNum Lit111;
    static final FString Lit112;
    static final FString Lit113;
    static final FString Lit114;
    static final FString Lit115;
    static final IntNum Lit116;
    static final FString Lit117;
    static final PairWithPosition Lit118;
    static final SimpleSymbol Lit119;
    static final SimpleSymbol Lit12;
    static final FString Lit120;
    static final SimpleSymbol Lit121;
    static final FString Lit122;
    static final FString Lit123;
    static final IntNum Lit124;
    static final FString Lit125;
    static final PairWithPosition Lit126;
    static final SimpleSymbol Lit127;
    static final FString Lit128;
    static final SimpleSymbol Lit129;
    static final SimpleSymbol Lit13;
    static final FString Lit130;
    static final FString Lit131;
    static final SimpleSymbol Lit132;
    static final FString Lit133;
    static final FString Lit134;
    static final SimpleSymbol Lit135;
    static final FString Lit136;
    static final FString Lit137;
    static final SimpleSymbol Lit138;
    static final FString Lit139;
    static final SimpleSymbol Lit14;
    static final FString Lit140;
    static final SimpleSymbol Lit141;
    static final FString Lit142;
    static final FString Lit143;
    static final FString Lit144;
    static final SimpleSymbol Lit145;
    static final SimpleSymbol Lit146;
    static final SimpleSymbol Lit147;
    static final SimpleSymbol Lit148;
    static final SimpleSymbol Lit149;
    static final SimpleSymbol Lit15;
    static final SimpleSymbol Lit150;
    static final SimpleSymbol Lit151;
    static final SimpleSymbol Lit152;
    static final SimpleSymbol Lit153;
    static final SimpleSymbol Lit154;
    static final SimpleSymbol Lit155;
    static final SimpleSymbol Lit156;
    static final SimpleSymbol Lit157;
    static final SimpleSymbol Lit158;
    static final SimpleSymbol Lit16;
    static final IntNum Lit17;
    static final SimpleSymbol Lit18;
    static final IntNum Lit19;
    static final SimpleSymbol Lit2;
    static final IntNum Lit20;
    static final IntNum Lit21;
    static final PairWithPosition Lit22;
    static final PairWithPosition Lit23;
    static final IntNum Lit24;
    static final IntNum Lit25;
    static final IntNum Lit26;
    static final PairWithPosition Lit27;
    static final PairWithPosition Lit28;
    static final IntNum Lit29;
    static final SimpleSymbol Lit3;
    static final IntNum Lit30;
    static final IntNum Lit31;
    static final PairWithPosition Lit32;
    static final PairWithPosition Lit33;
    static final SimpleSymbol Lit34;
    static final SimpleSymbol Lit35;
    static final SimpleSymbol Lit36;
    static final SimpleSymbol Lit37;
    static final SimpleSymbol Lit38;
    static final SimpleSymbol Lit39;
    static final IntNum Lit4;
    static final SimpleSymbol Lit40;
    static final SimpleSymbol Lit41;
    static final SimpleSymbol Lit42;
    static final SimpleSymbol Lit43;
    static final SimpleSymbol Lit44;
    static final SimpleSymbol Lit45;
    static final SimpleSymbol Lit46;
    static final FString Lit47;
    static final SimpleSymbol Lit48;
    static final SimpleSymbol Lit49;
    static final SimpleSymbol Lit5;
    static final IntNum Lit50;
    static final FString Lit51;
    static final FString Lit52;
    static final SimpleSymbol Lit53;
    static final IntNum Lit54;
    static final SimpleSymbol Lit55;
    static final SimpleSymbol Lit56;
    static final FString Lit57;
    static final SimpleSymbol Lit58;
    static final SimpleSymbol Lit59;
    static final SimpleSymbol Lit6;
    static final SimpleSymbol Lit60;
    static final SimpleSymbol Lit61;
    static final SimpleSymbol Lit62;
    static final SimpleSymbol Lit63;
    static final FString Lit64;
    static final SimpleSymbol Lit65;
    static final SimpleSymbol Lit66;
    static final IntNum Lit67;
    static final IntNum Lit68;
    static final FString Lit69;
    static final SimpleSymbol Lit7;
    static final FString Lit70;
    static final SimpleSymbol Lit71;
    static final FString Lit72;
    static final FString Lit73;
    static final SimpleSymbol Lit74;
    static final SimpleSymbol Lit75;
    static final IntNum Lit76;
    static final FString Lit77;
    static final FString Lit78;
    static final IntNum Lit79;
    static final SimpleSymbol Lit8;
    static final SimpleSymbol Lit80;
    static final IntNum Lit81;
    static final SimpleSymbol Lit82;
    static final IntNum Lit83;
    static final SimpleSymbol Lit84;
    static final IntNum Lit85;
    static final SimpleSymbol Lit86;
    static final IntNum Lit87;
    static final FString Lit88;
    static final PairWithPosition Lit89;
    static final SimpleSymbol Lit9;
    static final SimpleSymbol Lit90;
    static final FString Lit91;
    static final SimpleSymbol Lit92;
    static final IntNum Lit93;
    static final FString Lit94;
    static final FString Lit95;
    static final IntNum Lit96;
    static final IntNum Lit97;
    static final FString Lit98;
    static final PairWithPosition Lit99;
    public static Screen1 Screen1;
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
    static final ModuleMethod lambda$Fn30 = null;
    static final ModuleMethod lambda$Fn31 = null;
    static final ModuleMethod lambda$Fn32 = null;
    static final ModuleMethod lambda$Fn33 = null;
    static final ModuleMethod lambda$Fn34 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public ActivityStarter ActivityStarter1;
    public HorizontalArrangement HorizontalArrangement1;
    public HorizontalArrangement HorizontalArrangement2;
    public HorizontalArrangement HorizontalArrangement3;
    public HorizontalArrangement HorizontalArrangement4;
    public HorizontalArrangement HorizontalArrangement5;
    public HorizontalArrangement HorizontalArrangement6;
    public HorizontalArrangement HorizontalArrangement7;
    public HorizontalArrangement Line;
    public final ModuleMethod Screen1$Initialize;
    public Label Space0;
    public Label Space1;
    public Label Space2;
    public Label Space3;
    public Label Space4;
    public VerticalArrangement VerticalArrangement1;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public Button btnAbout;
    public final ModuleMethod btnAbout$Click;
    public Button btnFazerChamada;
    public final ModuleMethod btnFazerChamada$Click;
    public Button btnListUser;
    public final ModuleMethod btnListUser$Click;
    public Button btnLogo;
    public final ModuleMethod btnLogo$Click;
    public Button btnconfig;
    public final ModuleMethod btnconfig$Click;
    public Button btnpresenca;
    public final ModuleMethod btnpresenca$Click;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    /* compiled from: Screen1.yail */
    public class frame extends ModuleBody {
        Screen1 $main;

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
                    if (!(obj instanceof Screen1)) {
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
                    if (!(obj instanceof Screen1)) {
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
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case ArithOp.XOR /*15*/:
                    return Screen1.lambda2();
                case SetExp.PROCEDURE /*16*/:
                    this.$main.$define();
                    return Values.empty;
                case Sequence.INT_U8_VALUE /*17*/:
                    return Screen1.lambda3();
                case Sequence.INT_S8_VALUE /*18*/:
                    return this.$main.Screen1$Initialize();
                case Sequence.INT_U16_VALUE /*19*/:
                    return Screen1.lambda4();
                case Sequence.INT_S16_VALUE /*20*/:
                    return Screen1.lambda5();
                case Sequence.INT_U32_VALUE /*21*/:
                    return Screen1.lambda6();
                case Sequence.INT_S32_VALUE /*22*/:
                    return Screen1.lambda7();
                case Sequence.INT_U64_VALUE /*23*/:
                    return this.$main.btnLogo$Click();
                case Sequence.INT_S64_VALUE /*24*/:
                    return Screen1.lambda8();
                case Sequence.FLOAT_VALUE /*25*/:
                    return Screen1.lambda9();
                case Sequence.DOUBLE_VALUE /*26*/:
                    return Screen1.lambda10();
                case Sequence.BOOLEAN_VALUE /*27*/:
                    return Screen1.lambda11();
                case Sequence.TEXT_BYTE_VALUE /*28*/:
                    return Screen1.lambda12();
                case Sequence.CHAR_VALUE /*29*/:
                    return Screen1.lambda13();
                case XDataType.DAY_TIME_DURATION_TYPE_CODE /*30*/:
                    return Screen1.lambda14();
                case Sequence.CDATA_VALUE /*31*/:
                    return Screen1.lambda15();
                case SetExp.SET_IF_UNBOUND /*32*/:
                    return this.$main.btnFazerChamada$Click();
                case Sequence.ELEMENT_VALUE /*33*/:
                    return Screen1.lambda16();
                case Sequence.DOCUMENT_VALUE /*34*/:
                    return Screen1.lambda17();
                case Sequence.ATTRIBUTE_VALUE /*35*/:
                    return Screen1.lambda18();
                case Sequence.COMMENT_VALUE /*36*/:
                    return Screen1.lambda19();
                case Sequence.PROCESSING_INSTRUCTION_VALUE /*37*/:
                    return this.$main.btnListUser$Click();
                case XDataType.STRING_TYPE_CODE /*38*/:
                    return Screen1.lambda20();
                case XDataType.NORMALIZED_STRING_TYPE_CODE /*39*/:
                    return Screen1.lambda21();
                case XDataType.TOKEN_TYPE_CODE /*40*/:
                    return Screen1.lambda22();
                case XDataType.LANGUAGE_TYPE_CODE /*41*/:
                    return Screen1.lambda23();
                case XDataType.NMTOKEN_TYPE_CODE /*42*/:
                    return this.$main.btnpresenca$Click();
                case XDataType.NAME_TYPE_CODE /*43*/:
                    return Screen1.lambda24();
                case XDataType.NCNAME_TYPE_CODE /*44*/:
                    return Screen1.lambda25();
                case XDataType.ID_TYPE_CODE /*45*/:
                    return Screen1.lambda26();
                case XDataType.IDREF_TYPE_CODE /*46*/:
                    return Screen1.lambda27();
                case XDataType.ENTITY_TYPE_CODE /*47*/:
                    return Screen1.lambda28();
                case XDataType.UNTYPED_TYPE_CODE /*48*/:
                    return Screen1.lambda29();
                case 49:
                    return this.$main.btnconfig$Click();
                case 50:
                    return Screen1.lambda30();
                case 51:
                    return Screen1.lambda31();
                case 52:
                    return Screen1.lambda32();
                case 53:
                    return Screen1.lambda33();
                case 54:
                    return this.$main.btnAbout$Click();
                case 55:
                    return Screen1.lambda34();
                case 56:
                    return Screen1.lambda35();
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
                case 52:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 53:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 54:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 55:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 56:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    static {
        Lit158 = (SimpleSymbol) new SimpleSymbol("list").readResolve();
        Lit157 = (SimpleSymbol) new SimpleSymbol("any").readResolve();
        Lit156 = (SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve();
        Lit155 = (SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve();
        Lit154 = (SimpleSymbol) new SimpleSymbol("send-error").readResolve();
        Lit153 = (SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve();
        Lit152 = (SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve();
        Lit151 = (SimpleSymbol) new SimpleSymbol("add-to-components").readResolve();
        Lit150 = (SimpleSymbol) new SimpleSymbol("add-to-events").readResolve();
        Lit149 = (SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve();
        Lit148 = (SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve();
        Lit147 = (SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve();
        Lit146 = (SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve();
        Lit145 = (SimpleSymbol) new SimpleSymbol("android-log-form").readResolve();
        Lit144 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
        Lit143 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
        Lit142 = new FString("com.google.appinventor.components.runtime.Label");
        Lit141 = (SimpleSymbol) new SimpleSymbol("Space4").readResolve();
        Lit140 = new FString("com.google.appinventor.components.runtime.Label");
        Lit139 = new FString("com.google.appinventor.components.runtime.Label");
        Lit138 = (SimpleSymbol) new SimpleSymbol("Space3").readResolve();
        Lit137 = new FString("com.google.appinventor.components.runtime.Label");
        Lit136 = new FString("com.google.appinventor.components.runtime.Label");
        Lit135 = (SimpleSymbol) new SimpleSymbol("Space2").readResolve();
        Lit134 = new FString("com.google.appinventor.components.runtime.Label");
        Lit133 = new FString("com.google.appinventor.components.runtime.Label");
        Lit132 = (SimpleSymbol) new SimpleSymbol("Space1").readResolve();
        Lit131 = new FString("com.google.appinventor.components.runtime.Label");
        Lit130 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit129 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement7").readResolve();
        Lit128 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit127 = (SimpleSymbol) new SimpleSymbol("btnAbout$Click").readResolve();
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit7 = simpleSymbol;
        Lit126 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Screen1.yail", 905292);
        Lit125 = new FString("com.google.appinventor.components.runtime.Button");
        int[] iArr = new int[2];
        iArr[0] = Component.COLOR_PINK;
        Lit124 = IntNum.make(iArr);
        Lit123 = new FString("com.google.appinventor.components.runtime.Button");
        Lit122 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit121 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement6").readResolve();
        Lit120 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit119 = (SimpleSymbol) new SimpleSymbol("btnconfig$Click").readResolve();
        Lit118 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Screen1.yail", 790612);
        Lit117 = new FString("com.google.appinventor.components.runtime.Button");
        iArr = new int[2];
        iArr[0] = Component.COLOR_PINK;
        Lit116 = IntNum.make(iArr);
        Lit115 = new FString("com.google.appinventor.components.runtime.Button");
        Lit114 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit113 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit112 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit111 = IntNum.make(72);
        Lit110 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement5").readResolve();
        Lit109 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit108 = (SimpleSymbol) new SimpleSymbol("btnpresenca$Click").readResolve();
        Lit107 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Screen1.yail", 630870);
        Lit106 = new FString("com.google.appinventor.components.runtime.Button");
        iArr = new int[2];
        iArr[0] = Component.COLOR_PINK;
        Lit105 = IntNum.make(iArr);
        Lit104 = new FString("com.google.appinventor.components.runtime.Button");
        Lit103 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit102 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement4").readResolve();
        Lit101 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit100 = (SimpleSymbol) new SimpleSymbol("btnListUser$Click").readResolve();
        Lit99 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Screen1.yail", 516175);
        Lit98 = new FString("com.google.appinventor.components.runtime.Button");
        iArr = new int[2];
        iArr[0] = -1;
        Lit97 = IntNum.make(iArr);
        iArr = new int[2];
        iArr[0] = Component.COLOR_DKGRAY;
        Lit96 = IntNum.make(iArr);
        Lit95 = new FString("com.google.appinventor.components.runtime.Button");
        Lit94 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit93 = IntNum.make(16);
        Lit92 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement3").readResolve();
        Lit91 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit90 = (SimpleSymbol) new SimpleSymbol("btnFazerChamada$Click").readResolve();
        Lit89 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Screen1.yail", 385102);
        Lit88 = new FString("com.google.appinventor.components.runtime.Button");
        iArr = new int[2];
        iArr[0] = -1;
        Lit87 = IntNum.make(iArr);
        Lit86 = (SimpleSymbol) new SimpleSymbol("Text").readResolve();
        Lit85 = IntNum.make(2);
        Lit84 = (SimpleSymbol) new SimpleSymbol("Shape").readResolve();
        Lit83 = IntNum.make(1);
        Lit82 = (SimpleSymbol) new SimpleSymbol("FontTypeface").readResolve();
        Lit81 = IntNum.make(13);
        Lit80 = (SimpleSymbol) new SimpleSymbol("FontBold").readResolve();
        iArr = new int[2];
        iArr[0] = Component.COLOR_DKGRAY;
        Lit79 = IntNum.make(iArr);
        Lit78 = new FString("com.google.appinventor.components.runtime.Button");
        Lit77 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit76 = IntNum.make((int) LambdaExp.NO_FIELD);
        Lit75 = (SimpleSymbol) new SimpleSymbol("AlignVertical").readResolve();
        Lit74 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve();
        Lit73 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit72 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit71 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve();
        Lit70 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit69 = new FString("com.google.appinventor.components.runtime.Label");
        Lit68 = IntNum.make(-2);
        Lit67 = IntNum.make(15);
        Lit66 = (SimpleSymbol) new SimpleSymbol("FontSize").readResolve();
        Lit65 = (SimpleSymbol) new SimpleSymbol("Space0").readResolve();
        Lit64 = new FString("com.google.appinventor.components.runtime.Label");
        Lit63 = (SimpleSymbol) new SimpleSymbol("Click").readResolve();
        Lit62 = (SimpleSymbol) new SimpleSymbol("btnLogo$Click").readResolve();
        Lit61 = (SimpleSymbol) new SimpleSymbol("StartActivity").readResolve();
        Lit60 = (SimpleSymbol) new SimpleSymbol("DataUri").readResolve();
        Lit59 = (SimpleSymbol) new SimpleSymbol("Action").readResolve();
        Lit58 = (SimpleSymbol) new SimpleSymbol("ActivityStarter1").readResolve();
        Lit57 = new FString("com.google.appinventor.components.runtime.Button");
        Lit56 = (SimpleSymbol) new SimpleSymbol("Image").readResolve();
        Lit55 = (SimpleSymbol) new SimpleSymbol("Width").readResolve();
        Lit54 = IntNum.make(100);
        Lit53 = (SimpleSymbol) new SimpleSymbol("btnLogo").readResolve();
        Lit52 = new FString("com.google.appinventor.components.runtime.Button");
        Lit51 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit50 = IntNum.make(32);
        Lit49 = (SimpleSymbol) new SimpleSymbol("Height").readResolve();
        Lit48 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve();
        Lit47 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit46 = (SimpleSymbol) new SimpleSymbol("Initialize").readResolve();
        Lit45 = (SimpleSymbol) new SimpleSymbol("Screen1$Initialize").readResolve();
        Lit44 = (SimpleSymbol) new SimpleSymbol("$lineColor").readResolve();
        Lit43 = (SimpleSymbol) new SimpleSymbol("Line").readResolve();
        Lit42 = (SimpleSymbol) new SimpleSymbol("TextColor").readResolve();
        Lit41 = (SimpleSymbol) new SimpleSymbol("btnAbout").readResolve();
        Lit40 = (SimpleSymbol) new SimpleSymbol("btnconfig").readResolve();
        Lit39 = (SimpleSymbol) new SimpleSymbol("btnpresenca").readResolve();
        Lit38 = (SimpleSymbol) new SimpleSymbol("btnListUser").readResolve();
        Lit37 = (SimpleSymbol) new SimpleSymbol("$backgroundColor").readResolve();
        Lit36 = (SimpleSymbol) new SimpleSymbol("btnFazerChamada").readResolve();
        Lit35 = (SimpleSymbol) new SimpleSymbol("$fontColor").readResolve();
        Lit34 = (SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve();
        Lit33 = PairWithPosition.make(Lit158, LList.Empty, "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Screen1.yail", 98865);
        Lit32 = PairWithPosition.make(Lit157, PairWithPosition.make(Lit157, PairWithPosition.make(Lit157, LList.Empty, "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Screen1.yail", 98842), "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Screen1.yail", 98838), "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Screen1.yail", 98833);
        Lit31 = IntNum.make(182);
        Lit30 = IntNum.make(216);
        Lit29 = IntNum.make(205);
        Lit28 = PairWithPosition.make(Lit158, LList.Empty, "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Screen1.yail", 98676);
        Lit27 = PairWithPosition.make(Lit157, PairWithPosition.make(Lit157, PairWithPosition.make(Lit157, LList.Empty, "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Screen1.yail", 98653), "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Screen1.yail", 98649), "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Screen1.yail", 98644);
        Lit26 = IntNum.make(229);
        Lit25 = IntNum.make(246);
        Lit24 = IntNum.make(239);
        Lit23 = PairWithPosition.make(Lit158, LList.Empty, "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Screen1.yail", 98487);
        Lit22 = PairWithPosition.make(Lit157, PairWithPosition.make(Lit157, PairWithPosition.make(Lit157, LList.Empty, "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Screen1.yail", 98464), "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Screen1.yail", 98460), "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Screen1.yail", 98455);
        Lit21 = IntNum.make(45);
        Lit20 = IntNum.make(168);
        Lit19 = IntNum.make(91);
        Lit18 = (SimpleSymbol) new SimpleSymbol("VersionName").readResolve();
        Lit17 = IntNum.make(4);
        Lit16 = (SimpleSymbol) new SimpleSymbol("VersionCode").readResolve();
        Lit15 = (SimpleSymbol) new SimpleSymbol("TitleVisible").readResolve();
        Lit14 = (SimpleSymbol) new SimpleSymbol("Title").readResolve();
        Lit13 = (SimpleSymbol) new SimpleSymbol("Sizing").readResolve();
        Lit12 = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve();
        Lit11 = (SimpleSymbol) new SimpleSymbol("Scrollable").readResolve();
        Lit10 = (SimpleSymbol) new SimpleSymbol("OpenScreenAnimation").readResolve();
        Lit9 = (SimpleSymbol) new SimpleSymbol("Icon").readResolve();
        Lit8 = (SimpleSymbol) new SimpleSymbol("CloseScreenAnimation").readResolve();
        Lit6 = (SimpleSymbol) new SimpleSymbol("AppName").readResolve();
        Lit5 = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit4 = IntNum.make(3);
        Lit3 = (SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve();
        Lit2 = (SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve();
        Lit1 = (SimpleSymbol) new SimpleSymbol("getMessage").readResolve();
        Lit0 = (SimpleSymbol) new SimpleSymbol("Screen1").readResolve();
    }

    public Screen1() {
        ModuleInfo.register(this);
        ModuleBody appinventor_ai_efelipecarlos_Caller_Screen1_frame = new frame();
        appinventor_ai_efelipecarlos_Caller_Screen1_frame.$main = this;
        this.android$Mnlog$Mnform = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 1, Lit145, 4097);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 2, Lit146, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 3, Lit147, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 5, Lit148, 4097);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 6, Lit149, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 7, Lit150, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 8, Lit151, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 9, Lit152, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 10, Lit153, 4097);
        this.send$Mnerror = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 11, Lit154, 4097);
        this.process$Mnexception = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 12, "process-exception", 4097);
        this.dispatchEvent = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 13, Lit155, 16388);
        this.lookup$Mnhandler = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 14, Lit156, 8194);
        PropertySet moduleMethod = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 15, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime4768547486110674558.scm:547");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 16, "$define", 0);
        lambda$Fn2 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 17, null, 0);
        this.Screen1$Initialize = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 18, Lit45, 0);
        lambda$Fn3 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 19, null, 0);
        lambda$Fn4 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 20, null, 0);
        lambda$Fn5 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 21, null, 0);
        lambda$Fn6 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 22, null, 0);
        this.btnLogo$Click = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 23, Lit62, 0);
        lambda$Fn7 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 24, null, 0);
        lambda$Fn8 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 25, null, 0);
        lambda$Fn9 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 26, null, 0);
        lambda$Fn10 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 27, null, 0);
        lambda$Fn11 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 28, null, 0);
        lambda$Fn12 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 29, null, 0);
        lambda$Fn13 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 30, null, 0);
        lambda$Fn14 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 31, null, 0);
        this.btnFazerChamada$Click = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 32, Lit90, 0);
        lambda$Fn15 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 33, null, 0);
        lambda$Fn16 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 34, null, 0);
        lambda$Fn17 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 35, null, 0);
        lambda$Fn18 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 36, null, 0);
        this.btnListUser$Click = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 37, Lit100, 0);
        lambda$Fn19 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 38, null, 0);
        lambda$Fn20 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 39, null, 0);
        lambda$Fn21 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 40, null, 0);
        lambda$Fn22 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 41, null, 0);
        this.btnpresenca$Click = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 42, Lit108, 0);
        lambda$Fn23 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 43, null, 0);
        lambda$Fn24 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 44, null, 0);
        lambda$Fn25 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 45, null, 0);
        lambda$Fn26 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 46, null, 0);
        lambda$Fn27 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 47, null, 0);
        lambda$Fn28 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 48, null, 0);
        this.btnconfig$Click = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 49, Lit119, 0);
        lambda$Fn29 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 50, null, 0);
        lambda$Fn30 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 51, null, 0);
        lambda$Fn31 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 52, null, 0);
        lambda$Fn32 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 53, null, 0);
        this.btnAbout$Click = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 54, Lit127, 0);
        lambda$Fn33 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 55, null, 0);
        lambda$Fn34 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Screen1_frame, 56, null, 0);
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
            Screen1 = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            find = require.find("com.google.youngandroid.runtime");
            try {
                ((Runnable) find).run();
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit3, Lit4, Lit5);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit6, "Caller", Lit7);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "fade", Lit7);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit9, "Caller-logotipo.png", Lit7);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "zoom", Lit7);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit11, Boolean.TRUE, Lit12);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit13, "Responsive", Lit7);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "Menu_Principal", Lit7);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit15, Boolean.FALSE, Lit12);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Lit17, Lit5);
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit18, "0.4.9_Beta", Lit7), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn2));
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit45, this.Screen1$Initialize);
                } else {
                    addToFormEnvironment(Lit45, this.Screen1$Initialize);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Screen1", "Initialize");
                } else {
                    addToEvents(Lit0, Lit46);
                }
                this.HorizontalArrangement2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit47, Lit48, lambda$Fn3), $result);
                } else {
                    addToComponents(Lit0, Lit51, Lit48, lambda$Fn4);
                }
                this.btnLogo = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit52, Lit53, lambda$Fn5), $result);
                } else {
                    addToComponents(Lit0, Lit57, Lit53, lambda$Fn6);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit62, this.btnLogo$Click);
                } else {
                    addToFormEnvironment(Lit62, this.btnLogo$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btnLogo", "Click");
                } else {
                    addToEvents(Lit53, Lit63);
                }
                this.Space0 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit64, Lit65, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit0, Lit69, Lit65, lambda$Fn8);
                }
                this.HorizontalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit70, Lit71, lambda$Fn9), $result);
                } else {
                    addToComponents(Lit0, Lit72, Lit71, lambda$Fn10);
                }
                this.VerticalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit73, Lit74, lambda$Fn11), $result);
                } else {
                    addToComponents(Lit0, Lit77, Lit74, lambda$Fn12);
                }
                this.btnFazerChamada = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit74, Lit78, Lit36, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit74, Lit88, Lit36, lambda$Fn14);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit90, this.btnFazerChamada$Click);
                } else {
                    addToFormEnvironment(Lit90, this.btnFazerChamada$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btnFazerChamada", "Click");
                } else {
                    addToEvents(Lit36, Lit63);
                }
                this.HorizontalArrangement3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit74, Lit91, Lit92, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit74, Lit94, Lit92, lambda$Fn16);
                }
                this.btnListUser = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit74, Lit95, Lit38, lambda$Fn17), $result);
                } else {
                    addToComponents(Lit74, Lit98, Lit38, lambda$Fn18);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit100, this.btnListUser$Click);
                } else {
                    addToFormEnvironment(Lit100, this.btnListUser$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btnListUser", "Click");
                } else {
                    addToEvents(Lit38, Lit63);
                }
                this.HorizontalArrangement4 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit74, Lit101, Lit102, lambda$Fn19), $result);
                } else {
                    addToComponents(Lit74, Lit103, Lit102, lambda$Fn20);
                }
                this.btnpresenca = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit74, Lit104, Lit39, lambda$Fn21), $result);
                } else {
                    addToComponents(Lit74, Lit106, Lit39, lambda$Fn22);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit108, this.btnpresenca$Click);
                } else {
                    addToFormEnvironment(Lit108, this.btnpresenca$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btnpresenca", "Click");
                } else {
                    addToEvents(Lit39, Lit63);
                }
                this.HorizontalArrangement5 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit74, Lit109, Lit110, lambda$Fn23), $result);
                } else {
                    addToComponents(Lit74, Lit112, Lit110, lambda$Fn24);
                }
                this.Line = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit74, Lit113, Lit43, lambda$Fn25), $result);
                } else {
                    addToComponents(Lit74, Lit114, Lit43, lambda$Fn26);
                }
                this.btnconfig = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit74, Lit115, Lit40, lambda$Fn27), $result);
                } else {
                    addToComponents(Lit74, Lit117, Lit40, lambda$Fn28);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit119, this.btnconfig$Click);
                } else {
                    addToFormEnvironment(Lit119, this.btnconfig$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btnconfig", "Click");
                } else {
                    addToEvents(Lit40, Lit63);
                }
                this.HorizontalArrangement6 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit74, Lit120, Lit121, lambda$Fn29), $result);
                } else {
                    addToComponents(Lit74, Lit122, Lit121, lambda$Fn30);
                }
                this.btnAbout = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit74, Lit123, Lit41, lambda$Fn31), $result);
                } else {
                    addToComponents(Lit74, Lit125, Lit41, lambda$Fn32);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit127, this.btnAbout$Click);
                } else {
                    addToFormEnvironment(Lit127, this.btnAbout$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btnAbout", "Click");
                } else {
                    addToEvents(Lit41, Lit63);
                }
                this.HorizontalArrangement7 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit128, Lit129, lambda$Fn33), $result);
                } else {
                    addToComponents(Lit0, Lit130, Lit129, lambda$Fn34);
                }
                this.Space1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit131, Lit132, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit133, Lit132, Boolean.FALSE);
                }
                this.Space2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit134, Lit135, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit136, Lit135, Boolean.FALSE);
                }
                this.Space3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit137, Lit138, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit139, Lit138, Boolean.FALSE);
                }
                this.Space4 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit140, Lit141, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit142, Lit141, Boolean.FALSE);
                }
                this.ActivityStarter1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit143, Lit58, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit144, Lit58, Boolean.FALSE);
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
        runtime.setAndCoerceProperty$Ex(Lit0, Lit3, Lit4, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit6, "Caller", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "fade", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit9, "Caller-logotipo.png", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "zoom", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit11, Boolean.TRUE, Lit12);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit13, "Responsive", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "Menu_Principal", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit15, Boolean.FALSE, Lit12);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Lit17, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit18, "0.4.9_Beta", Lit7);
    }

    public Object Screen1$Initialize() {
        Object signalRuntimeError;
        runtime.setThisForm();
        Object $backgroundColor = runtime.callYailPrimitive(runtime.make$Mncolor, LList.list1(runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list3(Lit19, Lit20, Lit21), Lit22, "make a list")), Lit23, "make-color");
        Object $fontColor = runtime.callYailPrimitive(runtime.make$Mncolor, LList.list1(runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list3(Lit24, Lit25, Lit26), Lit27, "make a list")), Lit28, "make-color");
        Object $lineColor = runtime.callYailPrimitive(runtime.make$Mncolor, LList.list1(runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list3(Lit29, Lit30, Lit31), Lit32, "make a list")), Lit33, "make-color");
        SimpleSymbol simpleSymbol = Lit0;
        SimpleSymbol simpleSymbol2 = Lit34;
        if ($fontColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit35), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $fontColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit5);
        simpleSymbol = Lit36;
        simpleSymbol2 = Lit34;
        if ($backgroundColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit37), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $backgroundColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit5);
        simpleSymbol = Lit38;
        simpleSymbol2 = Lit34;
        if ($backgroundColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit37), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $backgroundColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit5);
        simpleSymbol = Lit39;
        simpleSymbol2 = Lit34;
        if ($backgroundColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit37), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $backgroundColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit5);
        simpleSymbol = Lit40;
        simpleSymbol2 = Lit34;
        if ($backgroundColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit37), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $backgroundColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit5);
        simpleSymbol = Lit41;
        simpleSymbol2 = Lit34;
        if ($backgroundColor instanceof Package) {
            $backgroundColor = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit37), " is not bound in the current context"), "Unbound Variable");
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, $backgroundColor, Lit5);
        simpleSymbol = Lit36;
        simpleSymbol2 = Lit42;
        if ($fontColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit35), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $fontColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit5);
        simpleSymbol = Lit38;
        simpleSymbol2 = Lit42;
        if ($fontColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit35), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $fontColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit5);
        simpleSymbol = Lit39;
        simpleSymbol2 = Lit42;
        if ($fontColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit35), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $fontColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit5);
        simpleSymbol = Lit40;
        simpleSymbol2 = Lit42;
        if ($fontColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit35), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $fontColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit5);
        simpleSymbol = Lit41;
        simpleSymbol2 = Lit42;
        if ($fontColor instanceof Package) {
            $fontColor = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit35), " is not bound in the current context"), "Unbound Variable");
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, $fontColor, Lit5);
        simpleSymbol = Lit43;
        simpleSymbol2 = Lit34;
        if ($lineColor instanceof Package) {
            $lineColor = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit44), " is not bound in the current context"), "Unbound Variable");
        }
        return runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, $lineColor, Lit5);
    }

    static Object lambda4() {
        return runtime.setAndCoerceProperty$Ex(Lit48, Lit49, Lit50, Lit5);
    }

    static Object lambda5() {
        return runtime.setAndCoerceProperty$Ex(Lit48, Lit49, Lit50, Lit5);
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit53, Lit49, Lit54, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit55, Lit54, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit53, Lit56, "Caller-logotipo.png", Lit7);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit53, Lit49, Lit54, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit55, Lit54, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit53, Lit56, "Caller-logotipo.png", Lit7);
    }

    public Object btnLogo$Click() {
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit58, Lit59, "android.intent.action.VIEW", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit58, Lit60, "http://m3nin0.github.io/CallerAPP/", Lit7);
        return runtime.callComponentMethod(Lit58, Lit61, LList.Empty, LList.Empty);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit65, Lit66, Lit67, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit65, Lit49, Lit68, Lit5);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit65, Lit66, Lit67, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit65, Lit49, Lit68, Lit5);
    }

    static Object lambda10() {
        return runtime.setAndCoerceProperty$Ex(Lit71, Lit49, Lit50, Lit5);
    }

    static Object lambda11() {
        return runtime.setAndCoerceProperty$Ex(Lit71, Lit49, Lit50, Lit5);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit74, Lit75, Lit4, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit74, Lit55, Lit76, Lit5);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit74, Lit75, Lit4, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit74, Lit55, Lit76, Lit5);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit36, Lit34, Lit79, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit36, Lit80, Boolean.TRUE, Lit12);
        runtime.setAndCoerceProperty$Ex(Lit36, Lit66, Lit81, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit36, Lit82, Lit83, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit36, Lit49, Lit50, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit36, Lit55, Lit68, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit36, Lit84, Lit85, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit36, Lit86, "MAKE ATTENDANCE", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit36, Lit42, Lit87, Lit5);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit36, Lit34, Lit79, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit36, Lit80, Boolean.TRUE, Lit12);
        runtime.setAndCoerceProperty$Ex(Lit36, Lit66, Lit81, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit36, Lit82, Lit83, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit36, Lit49, Lit50, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit36, Lit55, Lit68, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit36, Lit84, Lit85, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit36, Lit86, "MAKE ATTENDANCE", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit36, Lit42, Lit87, Lit5);
    }

    public Object btnFazerChamada$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Chamada"), Lit89, "open another screen");
    }

    static Object lambda16() {
        return runtime.setAndCoerceProperty$Ex(Lit92, Lit49, Lit93, Lit5);
    }

    static Object lambda17() {
        return runtime.setAndCoerceProperty$Ex(Lit92, Lit49, Lit93, Lit5);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit38, Lit34, Lit96, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit80, Boolean.TRUE, Lit12);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit66, Lit81, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit82, Lit83, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit49, Lit50, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit55, Lit68, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit84, Lit85, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit86, "REGISTERED USERS", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit38, Lit42, Lit97, Lit5);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit38, Lit34, Lit96, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit80, Boolean.TRUE, Lit12);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit66, Lit81, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit82, Lit83, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit49, Lit50, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit55, Lit68, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit84, Lit85, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit86, "REGISTERED USERS", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit38, Lit42, Lit97, Lit5);
    }

    public Object btnListUser$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("ListUser"), Lit99, "open another screen");
    }

    static Object lambda20() {
        return runtime.setAndCoerceProperty$Ex(Lit102, Lit49, Lit93, Lit5);
    }

    static Object lambda21() {
        return runtime.setAndCoerceProperty$Ex(Lit102, Lit49, Lit93, Lit5);
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit39, Lit34, Lit105, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit39, Lit80, Boolean.TRUE, Lit12);
        runtime.setAndCoerceProperty$Ex(Lit39, Lit66, Lit81, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit39, Lit49, Lit50, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit39, Lit55, Lit68, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit39, Lit84, Lit85, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit39, Lit86, "ATTENDANCE LIST", Lit7);
    }

    static Object lambda23() {
        runtime.setAndCoerceProperty$Ex(Lit39, Lit34, Lit105, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit39, Lit80, Boolean.TRUE, Lit12);
        runtime.setAndCoerceProperty$Ex(Lit39, Lit66, Lit81, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit39, Lit49, Lit50, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit39, Lit55, Lit68, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit39, Lit84, Lit85, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit39, Lit86, "ATTENDANCE LIST", Lit7);
    }

    public Object btnpresenca$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("UserAttendances"), Lit107, "open another screen");
    }

    static Object lambda24() {
        return runtime.setAndCoerceProperty$Ex(Lit110, Lit49, Lit111, Lit5);
    }

    static Object lambda25() {
        return runtime.setAndCoerceProperty$Ex(Lit110, Lit49, Lit111, Lit5);
    }

    static Object lambda26() {
        runtime.setAndCoerceProperty$Ex(Lit43, Lit49, Lit83, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit43, Lit55, Lit68, Lit5);
    }

    static Object lambda27() {
        runtime.setAndCoerceProperty$Ex(Lit43, Lit49, Lit83, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit43, Lit55, Lit68, Lit5);
    }

    static Object lambda28() {
        runtime.setAndCoerceProperty$Ex(Lit40, Lit34, Lit116, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit40, Lit80, Boolean.TRUE, Lit12);
        runtime.setAndCoerceProperty$Ex(Lit40, Lit66, Lit81, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit40, Lit82, Lit83, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit40, Lit49, Lit50, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit40, Lit55, Lit68, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit40, Lit84, Lit85, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit40, Lit86, "SETTINGS", Lit7);
    }

    static Object lambda29() {
        runtime.setAndCoerceProperty$Ex(Lit40, Lit34, Lit116, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit40, Lit80, Boolean.TRUE, Lit12);
        runtime.setAndCoerceProperty$Ex(Lit40, Lit66, Lit81, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit40, Lit82, Lit83, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit40, Lit49, Lit50, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit40, Lit55, Lit68, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit40, Lit84, Lit85, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit40, Lit86, "SETTINGS", Lit7);
    }

    public Object btnconfig$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Configuracoes"), Lit118, "open another screen");
    }

    static Object lambda30() {
        return runtime.setAndCoerceProperty$Ex(Lit121, Lit49, Lit93, Lit5);
    }

    static Object lambda31() {
        return runtime.setAndCoerceProperty$Ex(Lit121, Lit49, Lit93, Lit5);
    }

    static Object lambda32() {
        runtime.setAndCoerceProperty$Ex(Lit41, Lit34, Lit124, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit80, Boolean.TRUE, Lit12);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit66, Lit81, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit49, Lit50, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit55, Lit68, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit84, Lit85, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit41, Lit86, "ABOUT", Lit7);
    }

    static Object lambda33() {
        runtime.setAndCoerceProperty$Ex(Lit41, Lit34, Lit124, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit80, Boolean.TRUE, Lit12);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit66, Lit81, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit49, Lit50, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit55, Lit68, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit84, Lit85, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit41, Lit86, "ABOUT", Lit7);
    }

    public Object btnAbout$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Sobre"), Lit126, "open another screen");
    }

    static Object lambda34() {
        return runtime.setAndCoerceProperty$Ex(Lit129, Lit49, Lit50, Lit5);
    }

    static Object lambda35() {
        return runtime.setAndCoerceProperty$Ex(Lit129, Lit49, Lit50, Lit5);
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
        Screen1 = this;
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
        Screen1 closureEnv = this;
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
