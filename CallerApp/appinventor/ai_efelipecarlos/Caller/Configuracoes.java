package appinventor.ai_efelipecarlos.Caller;

import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Notifier;
import com.google.appinventor.components.runtime.TinyDB;
import com.google.appinventor.components.runtime.TinyWebDB;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.FullScreenVideoUtil;
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

/* compiled from: Configuracoes.yail */
public class Configuracoes extends Form implements Runnable {
    public static Configuracoes Configuracoes;
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final PairWithPosition Lit10;
    static final IntNum Lit100;
    static final FString Lit101;
    static final SimpleSymbol Lit102;
    static final PairWithPosition Lit103;
    static final SimpleSymbol Lit104;
    static final FString Lit105;
    static final SimpleSymbol Lit106;
    static final IntNum Lit107;
    static final FString Lit108;
    static final FString Lit109;
    static final PairWithPosition Lit11;
    static final IntNum Lit110;
    static final FString Lit111;
    static final PairWithPosition Lit112;
    static final SimpleSymbol Lit113;
    static final FString Lit114;
    static final SimpleSymbol Lit115;
    static final FString Lit116;
    static final FString Lit117;
    static final IntNum Lit118;
    static final FString Lit119;
    static final SimpleSymbol Lit12;
    static final PairWithPosition Lit120;
    static final SimpleSymbol Lit121;
    static final FString Lit122;
    static final SimpleSymbol Lit123;
    static final FString Lit124;
    static final FString Lit125;
    static final SimpleSymbol Lit126;
    static final FString Lit127;
    static final FString Lit128;
    static final FString Lit129;
    static final PairWithPosition Lit13;
    static final FString Lit130;
    static final FString Lit131;
    static final SimpleSymbol Lit132;
    static final PairWithPosition Lit133;
    static final PairWithPosition Lit134;
    static final PairWithPosition Lit135;
    static final SimpleSymbol Lit136;
    static final SimpleSymbol Lit137;
    static final FString Lit138;
    static final FString Lit139;
    static final PairWithPosition Lit14;
    static final SimpleSymbol Lit140;
    static final PairWithPosition Lit141;
    static final SimpleSymbol Lit142;
    static final SimpleSymbol Lit143;
    static final SimpleSymbol Lit144;
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
    static final SimpleSymbol Lit16;
    static final PairWithPosition Lit17;
    static final PairWithPosition Lit18;
    static final PairWithPosition Lit19;
    static final SimpleSymbol Lit2;
    static final PairWithPosition Lit20;
    static final PairWithPosition Lit21;
    static final PairWithPosition Lit22;
    static final PairWithPosition Lit23;
    static final SimpleSymbol Lit24;
    static final IntNum Lit25;
    static final SimpleSymbol Lit26;
    static final SimpleSymbol Lit27;
    static final SimpleSymbol Lit28;
    static final SimpleSymbol Lit29;
    static final SimpleSymbol Lit3;
    static final IntNum Lit30;
    static final SimpleSymbol Lit31;
    static final SimpleSymbol Lit32;
    static final SimpleSymbol Lit33;
    static final SimpleSymbol Lit34;
    static final SimpleSymbol Lit35;
    static final SimpleSymbol Lit36;
    static final SimpleSymbol Lit37;
    static final IntNum Lit38;
    static final IntNum Lit39;
    static final SimpleSymbol Lit4;
    static final IntNum Lit40;
    static final PairWithPosition Lit41;
    static final PairWithPosition Lit42;
    static final IntNum Lit43;
    static final IntNum Lit44;
    static final IntNum Lit45;
    static final PairWithPosition Lit46;
    static final PairWithPosition Lit47;
    static final SimpleSymbol Lit48;
    static final SimpleSymbol Lit49;
    static final SimpleSymbol Lit5;
    static final SimpleSymbol Lit50;
    static final SimpleSymbol Lit51;
    static final SimpleSymbol Lit52;
    static final SimpleSymbol Lit53;
    static final SimpleSymbol Lit54;
    static final SimpleSymbol Lit55;
    static final SimpleSymbol Lit56;
    static final PairWithPosition Lit57;
    static final SimpleSymbol Lit58;
    static final SimpleSymbol Lit59;
    static final SimpleSymbol Lit6;
    static final FString Lit60;
    static final SimpleSymbol Lit61;
    static final FString Lit62;
    static final FString Lit63;
    static final SimpleSymbol Lit64;
    static final IntNum Lit65;
    static final SimpleSymbol Lit66;
    static final IntNum Lit67;
    static final SimpleSymbol Lit68;
    static final IntNum Lit69;
    static final SimpleSymbol Lit7;
    static final FString Lit70;
    static final FString Lit71;
    static final IntNum Lit72;
    static final SimpleSymbol Lit73;
    static final SimpleSymbol Lit74;
    static final IntNum Lit75;
    static final SimpleSymbol Lit76;
    static final IntNum Lit77;
    static final IntNum Lit78;
    static final SimpleSymbol Lit79;
    static final PairWithPosition Lit8;
    static final IntNum Lit80;
    static final SimpleSymbol Lit81;
    static final FString Lit82;
    static final SimpleSymbol Lit83;
    static final SimpleSymbol Lit84;
    static final FString Lit85;
    static final SimpleSymbol Lit86;
    static final FString Lit87;
    static final FString Lit88;
    static final SimpleSymbol Lit89;
    static final SimpleSymbol Lit9;
    static final FString Lit90;
    static final FString Lit91;
    static final SimpleSymbol Lit92;
    static final FString Lit93;
    static final FString Lit94;
    static final SimpleSymbol Lit95;
    static final IntNum Lit96;
    static final FString Lit97;
    static final FString Lit98;
    static final IntNum Lit99;
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
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public final ModuleMethod Configuracoes$ErrorOccurred;
    public final ModuleMethod Configuracoes$Initialize;
    public HorizontalArrangement HorizontalArrangement1;
    public HorizontalArrangement HorizontalArrangement2;
    public HorizontalArrangement HorizontalArrangement3;
    public HorizontalArrangement HorizontalArrangement4;
    public Label Label1;
    public Notifier Notifier1;
    public final ModuleMethod Notifier1$AfterChoosing;
    public Label Space0;
    public Label Space1;
    public Label Space2;
    public Label Space3;
    public Button SyncDB;
    public final ModuleMethod SyncDB$Click;
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
    public Button btnCadastro;
    public final ModuleMethod btnCadastro$Click;
    public Button btnEraseDB;
    public final ModuleMethod btnEraseDB$Click;
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

    /* compiled from: Configuracoes.yail */
    public class frame extends ModuleBody {
        Configuracoes $main;

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case ArithOp.XOR /*15*/:
                    return Configuracoes.lambda2();
                case SetExp.PROCEDURE /*16*/:
                    this.$main.$define();
                    return Values.empty;
                case Sequence.INT_U8_VALUE /*17*/:
                    return Configuracoes.lambda3();
                case Sequence.INT_S8_VALUE /*18*/:
                    return Configuracoes.lambda5();
                case Sequence.INT_U16_VALUE /*19*/:
                    return Configuracoes.lambda4();
                case Sequence.INT_S16_VALUE /*20*/:
                    return Configuracoes.lambda6();
                case Sequence.INT_U32_VALUE /*21*/:
                    return this.$main.Configuracoes$Initialize();
                case Sequence.INT_U64_VALUE /*23*/:
                    return Configuracoes.lambda7();
                case Sequence.INT_S64_VALUE /*24*/:
                    return Configuracoes.lambda8();
                case Sequence.FLOAT_VALUE /*25*/:
                    return Configuracoes.lambda9();
                case Sequence.DOUBLE_VALUE /*26*/:
                    return Configuracoes.lambda10();
                case Sequence.BOOLEAN_VALUE /*27*/:
                    return this.$main.btnBack$Click();
                case Sequence.TEXT_BYTE_VALUE /*28*/:
                    return Configuracoes.lambda11();
                case Sequence.CHAR_VALUE /*29*/:
                    return Configuracoes.lambda12();
                case XDataType.DAY_TIME_DURATION_TYPE_CODE /*30*/:
                    return Configuracoes.lambda13();
                case Sequence.CDATA_VALUE /*31*/:
                    return Configuracoes.lambda14();
                case SetExp.SET_IF_UNBOUND /*32*/:
                    return Configuracoes.lambda15();
                case Sequence.ELEMENT_VALUE /*33*/:
                    return Configuracoes.lambda16();
                case Sequence.DOCUMENT_VALUE /*34*/:
                    return this.$main.SyncDB$Click();
                case Sequence.ATTRIBUTE_VALUE /*35*/:
                    return Configuracoes.lambda17();
                case Sequence.COMMENT_VALUE /*36*/:
                    return Configuracoes.lambda18();
                case Sequence.PROCESSING_INSTRUCTION_VALUE /*37*/:
                    return Configuracoes.lambda19();
                case XDataType.STRING_TYPE_CODE /*38*/:
                    return Configuracoes.lambda20();
                case XDataType.NORMALIZED_STRING_TYPE_CODE /*39*/:
                    return this.$main.btnEraseDB$Click();
                case XDataType.TOKEN_TYPE_CODE /*40*/:
                    return Configuracoes.lambda21();
                case XDataType.LANGUAGE_TYPE_CODE /*41*/:
                    return Configuracoes.lambda22();
                case XDataType.NMTOKEN_TYPE_CODE /*42*/:
                    return Configuracoes.lambda23();
                case XDataType.NAME_TYPE_CODE /*43*/:
                    return Configuracoes.lambda24();
                case XDataType.NCNAME_TYPE_CODE /*44*/:
                    return this.$main.btnCadastro$Click();
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
                    if (!(obj instanceof Configuracoes)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case XDataType.ID_TYPE_CODE /*45*/:
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
                case XDataType.IDREF_TYPE_CODE /*46*/:
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
                    if (!(obj instanceof Configuracoes)) {
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
                case Sequence.INT_S32_VALUE /*22*/:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
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
                case XDataType.ID_TYPE_CODE /*45*/:
                    return this.$main.Notifier1$AfterChoosing(obj);
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
                case Sequence.INT_S32_VALUE /*22*/:
                    return this.$main.Configuracoes$ErrorOccurred(obj, obj2, obj3, obj4);
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
                case XDataType.IDREF_TYPE_CODE /*46*/:
                    return this.$main.TinyWebDB1$GotValue(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }
    }

    static {
        Lit157 = (SimpleSymbol) new SimpleSymbol("list").readResolve();
        Lit156 = (SimpleSymbol) new SimpleSymbol("any").readResolve();
        Lit155 = (SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve();
        Lit154 = (SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve();
        Lit153 = (SimpleSymbol) new SimpleSymbol("send-error").readResolve();
        Lit152 = (SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve();
        Lit151 = (SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve();
        Lit150 = (SimpleSymbol) new SimpleSymbol("add-to-components").readResolve();
        Lit149 = (SimpleSymbol) new SimpleSymbol("add-to-events").readResolve();
        Lit148 = (SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve();
        Lit147 = (SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve();
        Lit146 = (SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve();
        Lit145 = (SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve();
        Lit144 = (SimpleSymbol) new SimpleSymbol("android-log-form").readResolve();
        Lit143 = (SimpleSymbol) new SimpleSymbol("GotValue").readResolve();
        Lit142 = (SimpleSymbol) new SimpleSymbol("TinyWebDB1$GotValue").readResolve();
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit28 = simpleSymbol;
        Lit141 = PairWithPosition.make(simpleSymbol, PairWithPosition.make(Lit156, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 802934), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 802928);
        Lit140 = (SimpleSymbol) new SimpleSymbol("$valueFromWebDB").readResolve();
        Lit139 = new FString("com.google.appinventor.components.runtime.TinyWebDB");
        Lit138 = new FString("com.google.appinventor.components.runtime.TinyWebDB");
        Lit137 = (SimpleSymbol) new SimpleSymbol("AfterChoosing").readResolve();
        Lit136 = (SimpleSymbol) new SimpleSymbol("Notifier1$AfterChoosing").readResolve();
        Lit135 = PairWithPosition.make(Lit28, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 774491);
        Lit134 = PairWithPosition.make(Lit156, PairWithPosition.make(Lit156, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 774391), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 774386);
        Lit133 = PairWithPosition.make(Lit156, PairWithPosition.make(Lit156, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 774254), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 774249);
        Lit132 = (SimpleSymbol) new SimpleSymbol("$choice").readResolve();
        Lit131 = new FString("com.google.appinventor.components.runtime.Notifier");
        Lit130 = new FString("com.google.appinventor.components.runtime.Notifier");
        Lit129 = new FString("com.google.appinventor.components.runtime.TinyDB");
        Lit128 = new FString("com.google.appinventor.components.runtime.TinyDB");
        Lit127 = new FString("com.google.appinventor.components.runtime.Label");
        Lit126 = (SimpleSymbol) new SimpleSymbol("Space3").readResolve();
        Lit125 = new FString("com.google.appinventor.components.runtime.Label");
        Lit124 = new FString("com.google.appinventor.components.runtime.Label");
        Lit123 = (SimpleSymbol) new SimpleSymbol("Space2").readResolve();
        Lit122 = new FString("com.google.appinventor.components.runtime.Label");
        Lit121 = (SimpleSymbol) new SimpleSymbol("btnCadastro$Click").readResolve();
        Lit120 = PairWithPosition.make(Lit28, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 684112);
        Lit119 = new FString("com.google.appinventor.components.runtime.Button");
        int[] iArr = new int[2];
        iArr[0] = Component.COLOR_PINK;
        Lit118 = IntNum.make(iArr);
        Lit117 = new FString("com.google.appinventor.components.runtime.Button");
        Lit116 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit115 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement4").readResolve();
        Lit114 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit113 = (SimpleSymbol) new SimpleSymbol("btnEraseDB$Click").readResolve();
        SimpleSymbol simpleSymbol2 = Lit28;
        SimpleSymbol simpleSymbol3 = Lit28;
        SimpleSymbol simpleSymbol4 = Lit28;
        SimpleSymbol simpleSymbol5 = Lit28;
        simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve();
        Lit34 = simpleSymbol;
        Lit112 = PairWithPosition.make(simpleSymbol2, PairWithPosition.make(simpleSymbol3, PairWithPosition.make(simpleSymbol4, PairWithPosition.make(simpleSymbol5, PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 569515), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 569510), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 569505), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 569500), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 569494);
        Lit111 = new FString("com.google.appinventor.components.runtime.Button");
        iArr = new int[2];
        iArr[0] = Component.COLOR_PINK;
        Lit110 = IntNum.make(iArr);
        Lit109 = new FString("com.google.appinventor.components.runtime.Button");
        Lit108 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit107 = IntNum.make(16);
        Lit106 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve();
        Lit105 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit104 = (SimpleSymbol) new SimpleSymbol("SyncDB$Click").readResolve();
        Lit103 = PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, PairWithPosition.make(Lit34, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 454875), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 454870), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 454865), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 454860), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 454854);
        Lit102 = (SimpleSymbol) new SimpleSymbol("ShowChooseDialog").readResolve();
        Lit101 = new FString("com.google.appinventor.components.runtime.Button");
        Lit100 = IntNum.make((int) FullScreenVideoUtil.FULLSCREEN_VIDEO_ACTION_DURATION);
        iArr = new int[2];
        iArr[0] = Component.COLOR_PINK;
        Lit99 = IntNum.make(iArr);
        Lit98 = new FString("com.google.appinventor.components.runtime.Button");
        Lit97 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit96 = IntNum.make(-1080);
        Lit95 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve();
        Lit94 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit93 = new FString("com.google.appinventor.components.runtime.Label");
        Lit92 = (SimpleSymbol) new SimpleSymbol("Space1").readResolve();
        Lit91 = new FString("com.google.appinventor.components.runtime.Label");
        Lit90 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit89 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement3").readResolve();
        Lit88 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit87 = new FString("com.google.appinventor.components.runtime.Label");
        Lit86 = (SimpleSymbol) new SimpleSymbol("Space0").readResolve();
        Lit85 = new FString("com.google.appinventor.components.runtime.Label");
        Lit84 = (SimpleSymbol) new SimpleSymbol("Click").readResolve();
        Lit83 = (SimpleSymbol) new SimpleSymbol("btnBack$Click").readResolve();
        Lit82 = new FString("com.google.appinventor.components.runtime.Button");
        Lit81 = (SimpleSymbol) new SimpleSymbol("Text").readResolve();
        Lit80 = IntNum.make(2);
        Lit79 = (SimpleSymbol) new SimpleSymbol("Shape").readResolve();
        Lit78 = IntNum.make((int) DateTime.TIMEZONE_MASK);
        Lit77 = IntNum.make(1);
        Lit76 = (SimpleSymbol) new SimpleSymbol("FontTypeface").readResolve();
        Lit75 = IntNum.make(13);
        Lit74 = (SimpleSymbol) new SimpleSymbol("FontSize").readResolve();
        Lit73 = (SimpleSymbol) new SimpleSymbol("FontBold").readResolve();
        iArr = new int[2];
        iArr[0] = Component.COLOR_PINK;
        Lit72 = IntNum.make(iArr);
        Lit71 = new FString("com.google.appinventor.components.runtime.Button");
        Lit70 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit69 = IntNum.make(-2);
        Lit68 = (SimpleSymbol) new SimpleSymbol("Width").readResolve();
        Lit67 = IntNum.make(32);
        Lit66 = (SimpleSymbol) new SimpleSymbol("Height").readResolve();
        Lit65 = IntNum.make((int) Component.COLOR_NONE);
        Lit64 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve();
        Lit63 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit62 = new FString("com.google.appinventor.components.runtime.Label");
        Lit61 = (SimpleSymbol) new SimpleSymbol("Label1").readResolve();
        Lit60 = new FString("com.google.appinventor.components.runtime.Label");
        Lit59 = (SimpleSymbol) new SimpleSymbol("ErrorOccurred").readResolve();
        Lit58 = (SimpleSymbol) new SimpleSymbol("Configuracoes$ErrorOccurred").readResolve();
        Lit57 = PairWithPosition.make(Lit28, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 102486);
        Lit56 = (SimpleSymbol) new SimpleSymbol("Initialize").readResolve();
        Lit55 = (SimpleSymbol) new SimpleSymbol("Configuracoes$Initialize").readResolve();
        Lit54 = (SimpleSymbol) new SimpleSymbol("TextColor").readResolve();
        Lit53 = (SimpleSymbol) new SimpleSymbol("btnCadastro").readResolve();
        Lit52 = (SimpleSymbol) new SimpleSymbol("btnEraseDB").readResolve();
        Lit51 = (SimpleSymbol) new SimpleSymbol("SyncDB").readResolve();
        Lit50 = (SimpleSymbol) new SimpleSymbol("$backgroundColor").readResolve();
        Lit49 = (SimpleSymbol) new SimpleSymbol("btnBack").readResolve();
        Lit48 = (SimpleSymbol) new SimpleSymbol("$fontColor").readResolve();
        Lit47 = PairWithPosition.make(Lit157, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 94580);
        Lit46 = PairWithPosition.make(Lit156, PairWithPosition.make(Lit156, PairWithPosition.make(Lit156, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 94557), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 94553), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 94548);
        Lit45 = IntNum.make(229);
        Lit44 = IntNum.make(246);
        Lit43 = IntNum.make(239);
        Lit42 = PairWithPosition.make(Lit157, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 94391);
        Lit41 = PairWithPosition.make(Lit156, PairWithPosition.make(Lit156, PairWithPosition.make(Lit156, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 94368), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 94364), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 94359);
        Lit40 = IntNum.make(45);
        Lit39 = IntNum.make(168);
        Lit38 = IntNum.make(91);
        Lit37 = (SimpleSymbol) new SimpleSymbol("TitleVisible").readResolve();
        Lit36 = (SimpleSymbol) new SimpleSymbol("Title").readResolve();
        Lit35 = (SimpleSymbol) new SimpleSymbol("Sizing").readResolve();
        Lit33 = (SimpleSymbol) new SimpleSymbol("Scrollable").readResolve();
        Lit32 = (SimpleSymbol) new SimpleSymbol("OpenScreenAnimation").readResolve();
        Lit31 = (SimpleSymbol) new SimpleSymbol("CloseScreenAnimation").readResolve();
        iArr = new int[2];
        iArr[0] = Component.COLOR_LTGRAY;
        Lit30 = IntNum.make(iArr);
        Lit29 = (SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve();
        Lit27 = (SimpleSymbol) new SimpleSymbol("AppName").readResolve();
        Lit26 = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit25 = IntNum.make(3);
        Lit24 = (SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve();
        Lit23 = PairWithPosition.make(Lit28, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 33521);
        Lit22 = PairWithPosition.make(Lit28, PairWithPosition.make(Lit156, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 33429), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 33423);
        Lit21 = PairWithPosition.make(Lit28, PairWithPosition.make(Lit156, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 33415), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 33409);
        Lit20 = PairWithPosition.make(Lit28, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 33239);
        Lit19 = PairWithPosition.make(Lit156, PairWithPosition.make(Lit156, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 33145), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 33140);
        Lit18 = PairWithPosition.make(Lit28, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 32930);
        Lit17 = PairWithPosition.make(Lit28, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 33521);
        Lit16 = (SimpleSymbol) new SimpleSymbol("ShowAlert").readResolve();
        Lit15 = (SimpleSymbol) new SimpleSymbol("Notifier1").readResolve();
        Lit14 = PairWithPosition.make(Lit28, PairWithPosition.make(Lit156, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 33429), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 33423);
        Lit13 = PairWithPosition.make(Lit28, PairWithPosition.make(Lit156, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 33415), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 33409);
        Lit12 = (SimpleSymbol) new SimpleSymbol("StoreValue").readResolve();
        Lit11 = PairWithPosition.make(Lit28, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 33239);
        Lit10 = PairWithPosition.make(Lit156, PairWithPosition.make(Lit156, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 33145), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 33140);
        Lit9 = (SimpleSymbol) new SimpleSymbol("GetTags").readResolve();
        Lit8 = PairWithPosition.make(Lit28, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Configuracoes.yail", 32930);
        Lit7 = (SimpleSymbol) new SimpleSymbol("GetValue").readResolve();
        Lit6 = (SimpleSymbol) new SimpleSymbol("TinyWebDB1").readResolve();
        Lit5 = (SimpleSymbol) new SimpleSymbol("ClearAll").readResolve();
        Lit4 = (SimpleSymbol) new SimpleSymbol("TinyDB1").readResolve();
        Lit3 = (SimpleSymbol) new SimpleSymbol("p$forceDB").readResolve();
        Lit2 = (SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve();
        Lit1 = (SimpleSymbol) new SimpleSymbol("getMessage").readResolve();
        Lit0 = (SimpleSymbol) new SimpleSymbol("Configuracoes").readResolve();
    }

    public Configuracoes() {
        ModuleInfo.register(this);
        ModuleBody appinventor_ai_efelipecarlos_Caller_Configuracoes_frame = new frame();
        appinventor_ai_efelipecarlos_Caller_Configuracoes_frame.$main = this;
        this.android$Mnlog$Mnform = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 1, Lit144, 4097);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 2, Lit145, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 3, Lit146, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 5, Lit147, 4097);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 6, Lit148, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 7, Lit149, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 8, Lit150, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 9, Lit151, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 10, Lit152, 4097);
        this.send$Mnerror = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 11, Lit153, 4097);
        this.process$Mnexception = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 12, "process-exception", 4097);
        this.dispatchEvent = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 13, Lit154, 16388);
        this.lookup$Mnhandler = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 14, Lit155, 8194);
        PropertySet moduleMethod = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 15, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime3960804766349238341.scm:547");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 16, "$define", 0);
        lambda$Fn2 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 17, null, 0);
        lambda$Fn4 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 18, null, 0);
        lambda$Fn3 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 19, null, 0);
        lambda$Fn5 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 20, null, 0);
        this.Configuracoes$Initialize = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 21, Lit55, 0);
        this.Configuracoes$ErrorOccurred = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 22, Lit58, 16388);
        lambda$Fn6 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 23, null, 0);
        lambda$Fn7 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 24, null, 0);
        lambda$Fn8 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 25, null, 0);
        lambda$Fn9 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 26, null, 0);
        this.btnBack$Click = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 27, Lit83, 0);
        lambda$Fn10 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 28, null, 0);
        lambda$Fn11 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 29, null, 0);
        lambda$Fn12 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 30, null, 0);
        lambda$Fn13 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 31, null, 0);
        lambda$Fn14 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 32, null, 0);
        lambda$Fn15 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 33, null, 0);
        this.SyncDB$Click = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 34, Lit104, 0);
        lambda$Fn16 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 35, null, 0);
        lambda$Fn17 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 36, null, 0);
        lambda$Fn18 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 37, null, 0);
        lambda$Fn19 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 38, null, 0);
        this.btnEraseDB$Click = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 39, Lit113, 0);
        lambda$Fn20 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 40, null, 0);
        lambda$Fn21 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 41, null, 0);
        lambda$Fn22 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 42, null, 0);
        lambda$Fn23 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 43, null, 0);
        this.btnCadastro$Click = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 44, Lit121, 0);
        this.Notifier1$AfterChoosing = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 45, Lit136, 4097);
        this.TinyWebDB1$GotValue = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Configuracoes_frame, 46, Lit142, 8194);
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
            Configuracoes = null;
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
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit24, Lit25, Lit26);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit27, "RFID_V3_2", Lit28);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit29, Lit30, Lit26);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit31, "fade", Lit28);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit32, "zoom", Lit28);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit33, Boolean.TRUE, Lit34);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit35, "Responsive", Lit28);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit36, "Configuracoes", Lit28);
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit37, Boolean.FALSE, Lit34), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn5));
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit55, this.Configuracoes$Initialize);
                } else {
                    addToFormEnvironment(Lit55, this.Configuracoes$Initialize);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Configuracoes", "Initialize");
                } else {
                    addToEvents(Lit0, Lit56);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit58, this.Configuracoes$ErrorOccurred);
                } else {
                    addToFormEnvironment(Lit58, this.Configuracoes$ErrorOccurred);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Configuracoes", "ErrorOccurred");
                } else {
                    addToEvents(Lit0, Lit59);
                }
                this.Label1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit60, Lit61, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit62, Lit61, Boolean.FALSE);
                }
                this.HorizontalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit63, Lit64, lambda$Fn6), $result);
                } else {
                    addToComponents(Lit0, Lit70, Lit64, lambda$Fn7);
                }
                this.btnBack = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit64, Lit71, Lit49, lambda$Fn8), $result);
                } else {
                    addToComponents(Lit64, Lit82, Lit49, lambda$Fn9);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit83, this.btnBack$Click);
                } else {
                    addToFormEnvironment(Lit83, this.btnBack$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btnBack", "Click");
                } else {
                    addToEvents(Lit49, Lit84);
                }
                this.Space0 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit85, Lit86, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit87, Lit86, Boolean.FALSE);
                }
                this.HorizontalArrangement3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit88, Lit89, lambda$Fn10), $result);
                } else {
                    addToComponents(Lit0, Lit90, Lit89, lambda$Fn11);
                }
                this.Space1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit91, Lit92, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit93, Lit92, Boolean.FALSE);
                }
                this.VerticalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit94, Lit95, lambda$Fn12), $result);
                } else {
                    addToComponents(Lit0, Lit97, Lit95, lambda$Fn13);
                }
                this.SyncDB = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit95, Lit98, Lit51, lambda$Fn14), $result);
                } else {
                    addToComponents(Lit95, Lit101, Lit51, lambda$Fn15);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit104, this.SyncDB$Click);
                } else {
                    addToFormEnvironment(Lit104, this.SyncDB$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "SyncDB", "Click");
                } else {
                    addToEvents(Lit51, Lit84);
                }
                this.HorizontalArrangement2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit95, Lit105, Lit106, lambda$Fn16), $result);
                } else {
                    addToComponents(Lit95, Lit108, Lit106, lambda$Fn17);
                }
                this.btnEraseDB = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit95, Lit109, Lit52, lambda$Fn18), $result);
                } else {
                    addToComponents(Lit95, Lit111, Lit52, lambda$Fn19);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit113, this.btnEraseDB$Click);
                } else {
                    addToFormEnvironment(Lit113, this.btnEraseDB$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btnEraseDB", "Click");
                } else {
                    addToEvents(Lit52, Lit84);
                }
                this.HorizontalArrangement4 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit95, Lit114, Lit115, lambda$Fn20), $result);
                } else {
                    addToComponents(Lit95, Lit116, Lit115, lambda$Fn21);
                }
                this.btnCadastro = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit95, Lit117, Lit53, lambda$Fn22), $result);
                } else {
                    addToComponents(Lit95, Lit119, Lit53, lambda$Fn23);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit121, this.btnCadastro$Click);
                } else {
                    addToFormEnvironment(Lit121, this.btnCadastro$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btnCadastro", "Click");
                } else {
                    addToEvents(Lit53, Lit84);
                }
                this.Space2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit122, Lit123, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit124, Lit123, Boolean.FALSE);
                }
                this.Space3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit125, Lit126, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit127, Lit126, Boolean.FALSE);
                }
                this.TinyDB1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit128, Lit4, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit129, Lit4, Boolean.FALSE);
                }
                this.Notifier1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit130, Lit15, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit131, Lit15, Boolean.FALSE);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit136, this.Notifier1$AfterChoosing);
                } else {
                    addToFormEnvironment(Lit136, this.Notifier1$AfterChoosing);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Notifier1", "AfterChoosing");
                } else {
                    addToEvents(Lit15, Lit137);
                }
                this.TinyWebDB1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit138, Lit6, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit139, Lit6, Boolean.FALSE);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit142, this.TinyWebDB1$GotValue);
                } else {
                    addToFormEnvironment(Lit142, this.TinyWebDB1$GotValue);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "TinyWebDB1", "GotValue");
                } else {
                    addToEvents(Lit6, Lit143);
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
        runtime.callComponentMethod(Lit4, Lit5, LList.Empty, LList.Empty);
        runtime.callComponentMethod(Lit6, Lit7, LList.list1("users"), Lit8);
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.callComponentMethod(Lit4, Lit9, LList.Empty, LList.Empty), runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list")), Lit10, "=") != Boolean.FALSE) {
            runtime.callComponentMethod(Lit6, Lit7, LList.list1("users"), Lit11);
        } else {
            runtime.callComponentMethod(Lit6, Lit12, LList.list2("users", runtime.callComponentMethod(Lit4, Lit7, LList.list2("cards", ElementType.MATCH_ANY_LOCALNAME), Lit13)), Lit14);
        }
        return runtime.callComponentMethod(Lit15, Lit16, LList.list1("Sync successful"), Lit17);
    }

    static Procedure lambda4() {
        return lambda$Fn4;
    }

    static Object lambda5() {
        runtime.callComponentMethod(Lit4, Lit5, LList.Empty, LList.Empty);
        runtime.callComponentMethod(Lit6, Lit7, LList.list1("users"), Lit18);
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.callComponentMethod(Lit4, Lit9, LList.Empty, LList.Empty), runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list")), Lit19, "=") != Boolean.FALSE) {
            runtime.callComponentMethod(Lit6, Lit7, LList.list1("users"), Lit20);
        } else {
            runtime.callComponentMethod(Lit6, Lit12, LList.list2("users", runtime.callComponentMethod(Lit4, Lit7, LList.list2("cards", ElementType.MATCH_ANY_LOCALNAME), Lit21)), Lit22);
        }
        return runtime.callComponentMethod(Lit15, Lit16, LList.list1("Sync successful"), Lit23);
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit24, Lit25, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit27, "RFID_V3_2", Lit28);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit29, Lit30, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit31, "fade", Lit28);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit32, "zoom", Lit28);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit33, Boolean.TRUE, Lit34);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit35, "Responsive", Lit28);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit36, "Configuracoes", Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit37, Boolean.FALSE, Lit34);
    }

    public Object Configuracoes$Initialize() {
        Object signalRuntimeError;
        runtime.setThisForm();
        Object $backgroundColor = runtime.callYailPrimitive(runtime.make$Mncolor, LList.list1(runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list3(Lit38, Lit39, Lit40), Lit41, "make a list")), Lit42, "make-color");
        Object $fontColor = runtime.callYailPrimitive(runtime.make$Mncolor, LList.list1(runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list3(Lit43, Lit44, Lit45), Lit46, "make a list")), Lit47, "make-color");
        SimpleSymbol simpleSymbol = Lit0;
        SimpleSymbol simpleSymbol2 = Lit29;
        if ($fontColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit48), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $fontColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit26);
        simpleSymbol = Lit49;
        simpleSymbol2 = Lit29;
        if ($backgroundColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit50), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $backgroundColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit26);
        simpleSymbol = Lit51;
        simpleSymbol2 = Lit29;
        if ($backgroundColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit50), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $backgroundColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit26);
        simpleSymbol = Lit52;
        simpleSymbol2 = Lit29;
        if ($backgroundColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit50), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $backgroundColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit26);
        simpleSymbol = Lit53;
        simpleSymbol2 = Lit29;
        if ($backgroundColor instanceof Package) {
            $backgroundColor = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit50), " is not bound in the current context"), "Unbound Variable");
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, $backgroundColor, Lit26);
        simpleSymbol = Lit49;
        simpleSymbol2 = Lit54;
        if ($fontColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit48), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $fontColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit26);
        simpleSymbol = Lit51;
        simpleSymbol2 = Lit54;
        if ($fontColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit48), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $fontColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit26);
        simpleSymbol = Lit52;
        simpleSymbol2 = Lit54;
        if ($fontColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit48), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $fontColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit26);
        simpleSymbol = Lit53;
        simpleSymbol2 = Lit54;
        if ($fontColor instanceof Package) {
            $fontColor = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit48), " is not bound in the current context"), "Unbound Variable");
        }
        return runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, $fontColor, Lit26);
    }

    public Object Configuracoes$ErrorOccurred(Object $component, Object $functionName, Object $errorNumber, Object $message) {
        runtime.sanitizeComponentData($component);
        runtime.sanitizeComponentData($functionName);
        runtime.sanitizeComponentData($errorNumber);
        runtime.sanitizeComponentData($message);
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit15, Lit16, LList.list1("Sync Failed"), Lit57);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit64, Lit29, Lit65, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit64, Lit66, Lit67, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit64, Lit68, Lit69, Lit26);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit64, Lit29, Lit65, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit64, Lit66, Lit67, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit64, Lit68, Lit69, Lit26);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit49, Lit29, Lit72, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit73, Boolean.TRUE, Lit34);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit74, Lit75, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit76, Lit77, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit66, Lit67, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit68, Lit78, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit79, Lit80, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit49, Lit81, "RETURN", Lit28);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit49, Lit29, Lit72, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit73, Boolean.TRUE, Lit34);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit74, Lit75, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit76, Lit77, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit66, Lit67, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit68, Lit78, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit79, Lit80, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit49, Lit81, "RETURN", Lit28);
    }

    public Object btnBack$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.close$Mnscreen, LList.Empty, LList.Empty, "close screen");
    }

    static Object lambda11() {
        return runtime.setAndCoerceProperty$Ex(Lit89, Lit66, Lit67, Lit26);
    }

    static Object lambda12() {
        return runtime.setAndCoerceProperty$Ex(Lit89, Lit66, Lit67, Lit26);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit95, Lit24, Lit25, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit95, Lit68, Lit96, Lit26);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit95, Lit24, Lit25, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit95, Lit68, Lit96, Lit26);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit51, Lit29, Lit99, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit73, Boolean.TRUE, Lit34);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit74, Lit75, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit66, Lit67, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit68, Lit100, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit79, Lit80, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit51, Lit81, "FORCE SYNC WITH DATABASE", Lit28);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit51, Lit29, Lit99, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit73, Boolean.TRUE, Lit34);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit74, Lit75, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit66, Lit67, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit68, Lit100, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit51, Lit79, Lit80, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit51, Lit81, "FORCE SYNC WITH DATABASE", Lit28);
    }

    public Object SyncDB$Click() {
        runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit15;
        SimpleSymbol simpleSymbol2 = Lit102;
        Pair list1 = LList.list1("Forcing synchronization will cause your most recent local files to be deleted.");
        LList.chain4(list1, "Notice", "Yes, I'm aware", "No", Boolean.FALSE);
        return runtime.callComponentMethod(simpleSymbol, simpleSymbol2, list1, Lit103);
    }

    static Object lambda17() {
        return runtime.setAndCoerceProperty$Ex(Lit106, Lit66, Lit107, Lit26);
    }

    static Object lambda18() {
        return runtime.setAndCoerceProperty$Ex(Lit106, Lit66, Lit107, Lit26);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit52, Lit29, Lit110, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit52, Lit73, Boolean.TRUE, Lit34);
        runtime.setAndCoerceProperty$Ex(Lit52, Lit74, Lit75, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit52, Lit66, Lit67, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit52, Lit68, Lit100, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit52, Lit79, Lit80, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit52, Lit81, "DELETE LOCAL DB", Lit28);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit52, Lit29, Lit110, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit52, Lit73, Boolean.TRUE, Lit34);
        runtime.setAndCoerceProperty$Ex(Lit52, Lit74, Lit75, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit52, Lit66, Lit67, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit52, Lit68, Lit100, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit52, Lit79, Lit80, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit52, Lit81, "DELETE LOCAL DB", Lit28);
    }

    public Object btnEraseDB$Click() {
        runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit15;
        SimpleSymbol simpleSymbol2 = Lit102;
        Pair list1 = LList.list1("Are you sure you want to exclude the DB?");
        LList.chain4(list1, "Warning", "Yes", "No", Boolean.FALSE);
        return runtime.callComponentMethod(simpleSymbol, simpleSymbol2, list1, Lit112);
    }

    static Object lambda21() {
        return runtime.setAndCoerceProperty$Ex(Lit115, Lit66, Lit107, Lit26);
    }

    static Object lambda22() {
        return runtime.setAndCoerceProperty$Ex(Lit115, Lit66, Lit107, Lit26);
    }

    static Object lambda23() {
        runtime.setAndCoerceProperty$Ex(Lit53, Lit29, Lit118, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit73, Boolean.TRUE, Lit34);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit74, Lit75, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit66, Lit67, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit68, Lit100, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit79, Lit80, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit53, Lit81, "REGISTER CARD", Lit28);
    }

    static Object lambda24() {
        runtime.setAndCoerceProperty$Ex(Lit53, Lit29, Lit118, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit73, Boolean.TRUE, Lit34);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit74, Lit75, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit66, Lit67, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit68, Lit100, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit53, Lit79, Lit80, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit53, Lit81, "REGISTER CARD", Lit28);
    }

    public Object btnCadastro$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Cadastrar"), Lit120, "open another screen");
    }

    public Object Notifier1$AfterChoosing(Object $choice) {
        Object signalRuntimeError;
        $choice = runtime.sanitizeComponentData($choice);
        runtime.setThisForm();
        ModuleMethod moduleMethod = runtime.yail$Mnequal$Qu;
        if ($choice instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit132), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $choice;
        }
        if (runtime.callYailPrimitive(moduleMethod, LList.list2(signalRuntimeError, "Yes, I'm aware"), Lit133, "=") != Boolean.FALSE) {
            Scheme.applyToArgs.apply1(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St));
        }
        moduleMethod = runtime.yail$Mnequal$Qu;
        if ($choice instanceof Package) {
            $choice = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit132), " is not bound in the current context"), "Unbound Variable");
        }
        if (runtime.callYailPrimitive(moduleMethod, LList.list2($choice, "Yes"), Lit134, "=") == Boolean.FALSE) {
            return Values.empty;
        }
        runtime.callComponentMethod(Lit15, Lit16, LList.list1("DB excluded"), Lit135);
        return runtime.callComponentMethod(Lit4, Lit5, LList.Empty, LList.Empty);
    }

    public Object TinyWebDB1$GotValue(Object $tagFromWebDB, Object $valueFromWebDB) {
        runtime.sanitizeComponentData($tagFromWebDB);
        $valueFromWebDB = runtime.sanitizeComponentData($valueFromWebDB);
        runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit4;
        SimpleSymbol simpleSymbol2 = Lit12;
        String str = "cards";
        if ($valueFromWebDB instanceof Package) {
            $valueFromWebDB = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit140), " is not bound in the current context"), "Unbound Variable");
        }
        return runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list2(str, $valueFromWebDB), Lit141);
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
        Configuracoes = this;
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
        Configuracoes closureEnv = this;
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
