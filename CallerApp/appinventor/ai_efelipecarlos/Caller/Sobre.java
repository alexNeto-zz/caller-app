package appinventor.ai_efelipecarlos.Caller;

import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
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

/* compiled from: Sobre.yail */
public class Sobre extends Form implements Runnable {
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final SimpleSymbol Lit10;
    static final SimpleSymbol Lit100;
    static final SimpleSymbol Lit101;
    static final SimpleSymbol Lit102;
    static final SimpleSymbol Lit103;
    static final SimpleSymbol Lit11;
    static final SimpleSymbol Lit12;
    static final SimpleSymbol Lit13;
    static final SimpleSymbol Lit14;
    static final SimpleSymbol Lit15;
    static final SimpleSymbol Lit16;
    static final IntNum Lit17;
    static final IntNum Lit18;
    static final IntNum Lit19;
    static final SimpleSymbol Lit2;
    static final PairWithPosition Lit20;
    static final PairWithPosition Lit21;
    static final IntNum Lit22;
    static final IntNum Lit23;
    static final IntNum Lit24;
    static final PairWithPosition Lit25;
    static final PairWithPosition Lit26;
    static final SimpleSymbol Lit27;
    static final SimpleSymbol Lit28;
    static final SimpleSymbol Lit29;
    static final SimpleSymbol Lit3;
    static final SimpleSymbol Lit30;
    static final SimpleSymbol Lit31;
    static final SimpleSymbol Lit32;
    static final SimpleSymbol Lit33;
    static final SimpleSymbol Lit34;
    static final SimpleSymbol Lit35;
    static final FString Lit36;
    static final SimpleSymbol Lit37;
    static final FString Lit38;
    static final FString Lit39;
    static final IntNum Lit4;
    static final SimpleSymbol Lit40;
    static final IntNum Lit41;
    static final SimpleSymbol Lit42;
    static final IntNum Lit43;
    static final SimpleSymbol Lit44;
    static final IntNum Lit45;
    static final FString Lit46;
    static final FString Lit47;
    static final IntNum Lit48;
    static final SimpleSymbol Lit49;
    static final SimpleSymbol Lit5;
    static final SimpleSymbol Lit50;
    static final IntNum Lit51;
    static final SimpleSymbol Lit52;
    static final IntNum Lit53;
    static final IntNum Lit54;
    static final SimpleSymbol Lit55;
    static final IntNum Lit56;
    static final SimpleSymbol Lit57;
    static final FString Lit58;
    static final SimpleSymbol Lit59;
    static final SimpleSymbol Lit6;
    static final SimpleSymbol Lit60;
    static final FString Lit61;
    static final SimpleSymbol Lit62;
    static final FString Lit63;
    static final FString Lit64;
    static final SimpleSymbol Lit65;
    static final IntNum Lit66;
    static final SimpleSymbol Lit67;
    static final FString Lit68;
    static final FString Lit69;
    static final SimpleSymbol Lit7;
    static final SimpleSymbol Lit70;
    static final IntNum Lit71;
    static final FString Lit72;
    static final FString Lit73;
    static final IntNum Lit74;
    static final IntNum Lit75;
    static final FString Lit76;
    static final FString Lit77;
    static final SimpleSymbol Lit78;
    static final IntNum Lit79;
    static final SimpleSymbol Lit8;
    static final FString Lit80;
    static final FString Lit81;
    static final IntNum Lit82;
    static final FString Lit83;
    static final FString Lit84;
    static final SimpleSymbol Lit85;
    static final FString Lit86;
    static final FString Lit87;
    static final SimpleSymbol Lit88;
    static final FString Lit89;
    static final IntNum Lit9;
    static final SimpleSymbol Lit90;
    static final SimpleSymbol Lit91;
    static final SimpleSymbol Lit92;
    static final SimpleSymbol Lit93;
    static final SimpleSymbol Lit94;
    static final SimpleSymbol Lit95;
    static final SimpleSymbol Lit96;
    static final SimpleSymbol Lit97;
    static final SimpleSymbol Lit98;
    static final SimpleSymbol Lit99;
    public static Sobre Sobre;
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
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public HorizontalArrangement HorizontalArrangement1;
    public HorizontalArrangement HorizontalArrangement2;
    public HorizontalArrangement HorizontalArrangement3;
    public HorizontalArrangement HorizontalArrangement4;
    public Label Label1;
    public Label Label2;
    public final ModuleMethod Sobre$Initialize;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public Button btnLogo;
    public Button btnReturn;
    public final ModuleMethod btnReturn$Click;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public Label lblFFA;
    public Label lbldevby;
    public Label lbllinha;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    /* compiled from: Sobre.yail */
    public class frame extends ModuleBody {
        Sobre $main;

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
                    if (!(obj instanceof Sobre)) {
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
                    if (!(obj instanceof Sobre)) {
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
                    return Sobre.lambda2();
                case SetExp.PROCEDURE /*16*/:
                    this.$main.$define();
                    return Values.empty;
                case Sequence.INT_U8_VALUE /*17*/:
                    return Sobre.lambda3();
                case Sequence.INT_S8_VALUE /*18*/:
                    return this.$main.Sobre$Initialize();
                case Sequence.INT_U16_VALUE /*19*/:
                    return Sobre.lambda4();
                case Sequence.INT_S16_VALUE /*20*/:
                    return Sobre.lambda5();
                case Sequence.INT_U32_VALUE /*21*/:
                    return Sobre.lambda6();
                case Sequence.INT_S32_VALUE /*22*/:
                    return Sobre.lambda7();
                case Sequence.INT_U64_VALUE /*23*/:
                    return this.$main.btnReturn$Click();
                case Sequence.INT_S64_VALUE /*24*/:
                    return Sobre.lambda8();
                case Sequence.FLOAT_VALUE /*25*/:
                    return Sobre.lambda9();
                case Sequence.DOUBLE_VALUE /*26*/:
                    return Sobre.lambda10();
                case Sequence.BOOLEAN_VALUE /*27*/:
                    return Sobre.lambda11();
                case Sequence.TEXT_BYTE_VALUE /*28*/:
                    return Sobre.lambda12();
                case Sequence.CHAR_VALUE /*29*/:
                    return Sobre.lambda13();
                case XDataType.DAY_TIME_DURATION_TYPE_CODE /*30*/:
                    return Sobre.lambda14();
                case Sequence.CDATA_VALUE /*31*/:
                    return Sobre.lambda15();
                case SetExp.SET_IF_UNBOUND /*32*/:
                    return Sobre.lambda16();
                case Sequence.ELEMENT_VALUE /*33*/:
                    return Sobre.lambda17();
                case Sequence.DOCUMENT_VALUE /*34*/:
                    return Sobre.lambda18();
                case Sequence.ATTRIBUTE_VALUE /*35*/:
                    return Sobre.lambda19();
                case Sequence.COMMENT_VALUE /*36*/:
                    return Sobre.lambda20();
                case Sequence.PROCESSING_INSTRUCTION_VALUE /*37*/:
                    return Sobre.lambda21();
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
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    static {
        Lit103 = (SimpleSymbol) new SimpleSymbol("list").readResolve();
        Lit102 = (SimpleSymbol) new SimpleSymbol("any").readResolve();
        Lit101 = (SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve();
        Lit100 = (SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve();
        Lit99 = (SimpleSymbol) new SimpleSymbol("send-error").readResolve();
        Lit98 = (SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve();
        Lit97 = (SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve();
        Lit96 = (SimpleSymbol) new SimpleSymbol("add-to-components").readResolve();
        Lit95 = (SimpleSymbol) new SimpleSymbol("add-to-events").readResolve();
        Lit94 = (SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve();
        Lit93 = (SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve();
        Lit92 = (SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve();
        Lit91 = (SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve();
        Lit90 = (SimpleSymbol) new SimpleSymbol("android-log-form").readResolve();
        Lit89 = new FString("com.google.appinventor.components.runtime.Label");
        Lit88 = (SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve();
        Lit87 = new FString("com.google.appinventor.components.runtime.Label");
        Lit86 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit85 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement3").readResolve();
        Lit84 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit83 = new FString("com.google.appinventor.components.runtime.Label");
        Lit82 = IntNum.make(21);
        Lit81 = new FString("com.google.appinventor.components.runtime.Label");
        Lit80 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit79 = IntNum.make(80);
        Lit78 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve();
        Lit77 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit76 = new FString("com.google.appinventor.components.runtime.Label");
        Lit75 = IntNum.make(260);
        int[] iArr = new int[2];
        iArr[0] = Component.COLOR_GRAY;
        Lit74 = IntNum.make(iArr);
        Lit73 = new FString("com.google.appinventor.components.runtime.Label");
        Lit72 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit71 = IntNum.make(40);
        Lit70 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement4").readResolve();
        Lit69 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit68 = new FString("com.google.appinventor.components.runtime.Button");
        Lit67 = (SimpleSymbol) new SimpleSymbol("Image").readResolve();
        Lit66 = IntNum.make(100);
        Lit65 = (SimpleSymbol) new SimpleSymbol("btnLogo").readResolve();
        Lit64 = new FString("com.google.appinventor.components.runtime.Button");
        Lit63 = new FString("com.google.appinventor.components.runtime.Label");
        Lit62 = (SimpleSymbol) new SimpleSymbol("Label1").readResolve();
        Lit61 = new FString("com.google.appinventor.components.runtime.Label");
        Lit60 = (SimpleSymbol) new SimpleSymbol("Click").readResolve();
        Lit59 = (SimpleSymbol) new SimpleSymbol("btnReturn$Click").readResolve();
        Lit58 = new FString("com.google.appinventor.components.runtime.Button");
        Lit57 = (SimpleSymbol) new SimpleSymbol("Text").readResolve();
        Lit56 = IntNum.make(2);
        Lit55 = (SimpleSymbol) new SimpleSymbol("Shape").readResolve();
        Lit54 = IntNum.make((int) DateTime.TIMEZONE_MASK);
        Lit53 = IntNum.make(1);
        Lit52 = (SimpleSymbol) new SimpleSymbol("FontTypeface").readResolve();
        Lit51 = IntNum.make(13);
        Lit50 = (SimpleSymbol) new SimpleSymbol("FontSize").readResolve();
        Lit49 = (SimpleSymbol) new SimpleSymbol("FontBold").readResolve();
        iArr = new int[2];
        iArr[0] = Component.COLOR_PINK;
        Lit48 = IntNum.make(iArr);
        Lit47 = new FString("com.google.appinventor.components.runtime.Button");
        Lit46 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit45 = IntNum.make(-2);
        Lit44 = (SimpleSymbol) new SimpleSymbol("Width").readResolve();
        Lit43 = IntNum.make(32);
        Lit42 = (SimpleSymbol) new SimpleSymbol("Height").readResolve();
        Lit41 = IntNum.make((int) Component.COLOR_NONE);
        Lit40 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve();
        Lit39 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit38 = new FString("com.google.appinventor.components.runtime.Label");
        Lit37 = (SimpleSymbol) new SimpleSymbol("Label2").readResolve();
        Lit36 = new FString("com.google.appinventor.components.runtime.Label");
        Lit35 = (SimpleSymbol) new SimpleSymbol("Initialize").readResolve();
        Lit34 = (SimpleSymbol) new SimpleSymbol("Sobre$Initialize").readResolve();
        Lit33 = (SimpleSymbol) new SimpleSymbol("lblFFA").readResolve();
        Lit32 = (SimpleSymbol) new SimpleSymbol("lbldevby").readResolve();
        Lit31 = (SimpleSymbol) new SimpleSymbol("lbllinha").readResolve();
        Lit30 = (SimpleSymbol) new SimpleSymbol("TextColor").readResolve();
        Lit29 = (SimpleSymbol) new SimpleSymbol("$backgroundColor").readResolve();
        Lit28 = (SimpleSymbol) new SimpleSymbol("btnReturn").readResolve();
        Lit27 = (SimpleSymbol) new SimpleSymbol("$fontColor").readResolve();
        Lit26 = PairWithPosition.make(Lit103, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Sobre.yail", 90484);
        Lit25 = PairWithPosition.make(Lit102, PairWithPosition.make(Lit102, PairWithPosition.make(Lit102, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Sobre.yail", 90461), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Sobre.yail", 90457), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Sobre.yail", 90452);
        Lit24 = IntNum.make(229);
        Lit23 = IntNum.make(246);
        Lit22 = IntNum.make(239);
        Lit21 = PairWithPosition.make(Lit103, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Sobre.yail", 90295);
        Lit20 = PairWithPosition.make(Lit102, PairWithPosition.make(Lit102, PairWithPosition.make(Lit102, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Sobre.yail", 90272), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Sobre.yail", 90268), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Sobre.yail", 90263);
        Lit19 = IntNum.make(45);
        Lit18 = IntNum.make(168);
        Lit17 = IntNum.make(91);
        Lit16 = (SimpleSymbol) new SimpleSymbol("TitleVisible").readResolve();
        Lit15 = (SimpleSymbol) new SimpleSymbol("Title").readResolve();
        Lit14 = (SimpleSymbol) new SimpleSymbol("Sizing").readResolve();
        Lit13 = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve();
        Lit12 = (SimpleSymbol) new SimpleSymbol("Scrollable").readResolve();
        Lit11 = (SimpleSymbol) new SimpleSymbol("OpenScreenAnimation").readResolve();
        Lit10 = (SimpleSymbol) new SimpleSymbol("CloseScreenAnimation").readResolve();
        iArr = new int[2];
        iArr[0] = Component.COLOR_LTGRAY;
        Lit9 = IntNum.make(iArr);
        Lit8 = (SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve();
        Lit7 = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit6 = (SimpleSymbol) new SimpleSymbol("AppName").readResolve();
        Lit5 = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit4 = IntNum.make(3);
        Lit3 = (SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve();
        Lit2 = (SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve();
        Lit1 = (SimpleSymbol) new SimpleSymbol("getMessage").readResolve();
        Lit0 = (SimpleSymbol) new SimpleSymbol("Sobre").readResolve();
    }

    public Sobre() {
        ModuleInfo.register(this);
        ModuleBody appinventor_ai_efelipecarlos_Caller_Sobre_frame = new frame();
        appinventor_ai_efelipecarlos_Caller_Sobre_frame.$main = this;
        this.android$Mnlog$Mnform = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 1, Lit90, 4097);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 2, Lit91, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 3, Lit92, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 5, Lit93, 4097);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 6, Lit94, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 7, Lit95, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 8, Lit96, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 9, Lit97, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 10, Lit98, 4097);
        this.send$Mnerror = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 11, Lit99, 4097);
        this.process$Mnexception = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 12, "process-exception", 4097);
        this.dispatchEvent = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 13, Lit100, 16388);
        this.lookup$Mnhandler = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 14, Lit101, 8194);
        PropertySet moduleMethod = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 15, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime3960804766349238341.scm:547");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 16, "$define", 0);
        lambda$Fn2 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 17, null, 0);
        this.Sobre$Initialize = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 18, Lit34, 0);
        lambda$Fn3 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 19, null, 0);
        lambda$Fn4 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 20, null, 0);
        lambda$Fn5 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 21, null, 0);
        lambda$Fn6 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 22, null, 0);
        this.btnReturn$Click = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 23, Lit59, 0);
        lambda$Fn7 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 24, null, 0);
        lambda$Fn8 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 25, null, 0);
        lambda$Fn9 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 26, null, 0);
        lambda$Fn10 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 27, null, 0);
        lambda$Fn11 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 28, null, 0);
        lambda$Fn12 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 29, null, 0);
        lambda$Fn13 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 30, null, 0);
        lambda$Fn14 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 31, null, 0);
        lambda$Fn15 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 32, null, 0);
        lambda$Fn16 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 33, null, 0);
        lambda$Fn17 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 34, null, 0);
        lambda$Fn18 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 35, null, 0);
        lambda$Fn19 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 36, null, 0);
        lambda$Fn20 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Sobre_frame, 37, null, 0);
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
            Sobre = null;
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
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit6, "IBMP_V4_4", Lit7);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit8, Lit9, Lit5);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "fade", Lit7);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit11, "zoom", Lit7);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit12, Boolean.TRUE, Lit13);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "Responsive", Lit7);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit15, "Sobre", Lit7);
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Boolean.FALSE, Lit13), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn2));
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit34, this.Sobre$Initialize);
                } else {
                    addToFormEnvironment(Lit34, this.Sobre$Initialize);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Sobre", "Initialize");
                } else {
                    addToEvents(Lit0, Lit35);
                }
                this.Label2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit36, Lit37, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit38, Lit37, Boolean.FALSE);
                }
                this.HorizontalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit39, Lit40, lambda$Fn3), $result);
                } else {
                    addToComponents(Lit0, Lit46, Lit40, lambda$Fn4);
                }
                this.btnReturn = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit40, Lit47, Lit28, lambda$Fn5), $result);
                } else {
                    addToComponents(Lit40, Lit58, Lit28, lambda$Fn6);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit59, this.btnReturn$Click);
                } else {
                    addToFormEnvironment(Lit59, this.btnReturn$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btnReturn", "Click");
                } else {
                    addToEvents(Lit28, Lit60);
                }
                this.Label1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit61, Lit62, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit63, Lit62, Boolean.FALSE);
                }
                this.btnLogo = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit64, Lit65, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit0, Lit68, Lit65, lambda$Fn8);
                }
                this.HorizontalArrangement4 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit69, Lit70, lambda$Fn9), $result);
                } else {
                    addToComponents(Lit0, Lit72, Lit70, lambda$Fn10);
                }
                this.lbllinha = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit73, Lit31, lambda$Fn11), $result);
                } else {
                    addToComponents(Lit0, Lit76, Lit31, lambda$Fn12);
                }
                this.HorizontalArrangement2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit77, Lit78, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit0, Lit80, Lit78, lambda$Fn14);
                }
                this.lbldevby = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit81, Lit32, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit0, Lit83, Lit32, lambda$Fn16);
                }
                this.HorizontalArrangement3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit84, Lit85, lambda$Fn17), $result);
                } else {
                    addToComponents(Lit0, Lit86, Lit85, lambda$Fn18);
                }
                this.lblFFA = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit87, Lit33, lambda$Fn19), $result);
                } else {
                    addToComponents(Lit0, Lit89, Lit33, lambda$Fn20);
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
        runtime.setAndCoerceProperty$Ex(Lit0, Lit6, "IBMP_V4_4", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit8, Lit9, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "fade", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit11, "zoom", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit12, Boolean.TRUE, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "Responsive", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit15, "Sobre", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Boolean.FALSE, Lit13);
    }

    public Object Sobre$Initialize() {
        Object signalRuntimeError;
        runtime.setThisForm();
        Object $backgroundColor = runtime.callYailPrimitive(runtime.make$Mncolor, LList.list1(runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list3(Lit17, Lit18, Lit19), Lit20, "make a list")), Lit21, "make-color");
        Object $fontColor = runtime.callYailPrimitive(runtime.make$Mncolor, LList.list1(runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list3(Lit22, Lit23, Lit24), Lit25, "make a list")), Lit26, "make-color");
        SimpleSymbol simpleSymbol = Lit0;
        SimpleSymbol simpleSymbol2 = Lit8;
        if ($fontColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit27), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $fontColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit5);
        simpleSymbol = Lit28;
        simpleSymbol2 = Lit8;
        if ($backgroundColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit29), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $backgroundColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit5);
        simpleSymbol = Lit28;
        simpleSymbol2 = Lit30;
        if ($fontColor instanceof Package) {
            $fontColor = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit27), " is not bound in the current context"), "Unbound Variable");
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, $fontColor, Lit5);
        simpleSymbol = Lit31;
        simpleSymbol2 = Lit8;
        if ($backgroundColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit29), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $backgroundColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit5);
        simpleSymbol = Lit32;
        simpleSymbol2 = Lit30;
        if ($backgroundColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit29), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $backgroundColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit5);
        simpleSymbol = Lit33;
        simpleSymbol2 = Lit30;
        if ($backgroundColor instanceof Package) {
            $backgroundColor = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit29), " is not bound in the current context"), "Unbound Variable");
        }
        return runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, $backgroundColor, Lit5);
    }

    static Object lambda4() {
        runtime.setAndCoerceProperty$Ex(Lit40, Lit8, Lit41, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit40, Lit42, Lit43, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit40, Lit44, Lit45, Lit5);
    }

    static Object lambda5() {
        runtime.setAndCoerceProperty$Ex(Lit40, Lit8, Lit41, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit40, Lit42, Lit43, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit40, Lit44, Lit45, Lit5);
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit28, Lit8, Lit48, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit49, Boolean.TRUE, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit50, Lit51, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit52, Lit53, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit42, Lit43, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit44, Lit54, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit55, Lit56, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit28, Lit57, "RETURN", Lit7);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit28, Lit8, Lit48, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit49, Boolean.TRUE, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit50, Lit51, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit52, Lit53, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit42, Lit43, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit44, Lit54, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit55, Lit56, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit28, Lit57, "RETURN", Lit7);
    }

    public Object btnReturn$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.close$Mnscreen, LList.Empty, LList.Empty, "close screen");
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit65, Lit42, Lit66, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit65, Lit44, Lit66, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit65, Lit67, "Caller-logotipo.png", Lit7);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit65, Lit42, Lit66, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit65, Lit44, Lit66, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit65, Lit67, "Caller-logotipo.png", Lit7);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit70, Lit42, Lit71, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit70, Lit44, Lit71, Lit5);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit70, Lit42, Lit71, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit70, Lit44, Lit71, Lit5);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit31, Lit8, Lit74, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit31, Lit42, Lit53, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit31, Lit44, Lit75, Lit5);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit31, Lit8, Lit74, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit31, Lit42, Lit53, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit31, Lit44, Lit75, Lit5);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit78, Lit42, Lit71, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit78, Lit44, Lit79, Lit5);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit78, Lit42, Lit71, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit78, Lit44, Lit79, Lit5);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit32, Lit50, Lit82, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit32, Lit52, Lit53, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit32, Lit57, "Developed by", Lit7);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit32, Lit50, Lit82, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit32, Lit52, Lit53, Lit5);
        return runtime.setAndCoerceProperty$Ex(Lit32, Lit57, "Developed by", Lit7);
    }

    static Object lambda18() {
        return runtime.setAndCoerceProperty$Ex(Lit85, Lit42, Lit71, Lit5);
    }

    static Object lambda19() {
        return runtime.setAndCoerceProperty$Ex(Lit85, Lit42, Lit71, Lit5);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit33, Lit50, Lit71, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit33, Lit52, Lit53, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit33, Lit44, Lit45, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit33, Lit57, "FFA TEAM", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit33, Lit88, Lit53, Lit5);
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit33, Lit50, Lit71, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit33, Lit52, Lit53, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit33, Lit44, Lit45, Lit5);
        runtime.setAndCoerceProperty$Ex(Lit33, Lit57, "FFA TEAM", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit33, Lit88, Lit53, Lit5);
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
        Sobre = this;
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
        Sobre closureEnv = this;
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
