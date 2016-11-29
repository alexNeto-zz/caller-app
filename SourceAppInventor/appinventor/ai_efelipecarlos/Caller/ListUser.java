package appinventor.ai_efelipecarlos.Caller;

import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.ListView;
import com.google.appinventor.components.runtime.Notifier;
import com.google.appinventor.components.runtime.TinyDB;
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

/* compiled from: ListUser.yail */
public class ListUser extends Form implements Runnable {
    public static ListUser ListUser;
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final SimpleSymbol Lit10;
    static final SimpleSymbol Lit100;
    static final SimpleSymbol Lit101;
    static final SimpleSymbol Lit102;
    static final SimpleSymbol Lit103;
    static final SimpleSymbol Lit104;
    static final SimpleSymbol Lit105;
    static final SimpleSymbol Lit106;
    static final SimpleSymbol Lit107;
    static final SimpleSymbol Lit108;
    static final SimpleSymbol Lit109;
    static final IntNum Lit11;
    static final SimpleSymbol Lit110;
    static final SimpleSymbol Lit111;
    static final SimpleSymbol Lit12;
    static final SimpleSymbol Lit13;
    static final SimpleSymbol Lit14;
    static final SimpleSymbol Lit15;
    static final SimpleSymbol Lit16;
    static final SimpleSymbol Lit17;
    static final IntNum Lit18;
    static final IntNum Lit19;
    static final SimpleSymbol Lit2;
    static final IntNum Lit20;
    static final PairWithPosition Lit21;
    static final PairWithPosition Lit22;
    static final IntNum Lit23;
    static final IntNum Lit24;
    static final IntNum Lit25;
    static final PairWithPosition Lit26;
    static final PairWithPosition Lit27;
    static final SimpleSymbol Lit28;
    static final SimpleSymbol Lit29;
    static final SimpleSymbol Lit3;
    static final SimpleSymbol Lit30;
    static final SimpleSymbol Lit31;
    static final SimpleSymbol Lit32;
    static final SimpleSymbol Lit33;
    static final SimpleSymbol Lit34;
    static final SimpleSymbol Lit35;
    static final SimpleSymbol Lit36;
    static final PairWithPosition Lit37;
    static final SimpleSymbol Lit38;
    static final SimpleSymbol Lit39;
    static final IntNum Lit4;
    static final FString Lit40;
    static final SimpleSymbol Lit41;
    static final FString Lit42;
    static final FString Lit43;
    static final SimpleSymbol Lit44;
    static final IntNum Lit45;
    static final SimpleSymbol Lit46;
    static final IntNum Lit47;
    static final SimpleSymbol Lit48;
    static final IntNum Lit49;
    static final SimpleSymbol Lit5;
    static final FString Lit50;
    static final FString Lit51;
    static final IntNum Lit52;
    static final SimpleSymbol Lit53;
    static final SimpleSymbol Lit54;
    static final IntNum Lit55;
    static final SimpleSymbol Lit56;
    static final IntNum Lit57;
    static final IntNum Lit58;
    static final SimpleSymbol Lit59;
    static final IntNum Lit6;
    static final IntNum Lit60;
    static final SimpleSymbol Lit61;
    static final FString Lit62;
    static final SimpleSymbol Lit63;
    static final SimpleSymbol Lit64;
    static final FString Lit65;
    static final SimpleSymbol Lit66;
    static final FString Lit67;
    static final FString Lit68;
    static final IntNum Lit69;
    static final SimpleSymbol Lit7;
    static final IntNum Lit70;
    static final FString Lit71;
    static final SimpleSymbol Lit72;
    static final SimpleSymbol Lit73;
    static final PairWithPosition Lit74;
    static final SimpleSymbol Lit75;
    static final SimpleSymbol Lit76;
    static final SimpleSymbol Lit77;
    static final SimpleSymbol Lit78;
    static final SimpleSymbol Lit79;
    static final SimpleSymbol Lit8;
    static final SimpleSymbol Lit80;
    static final PairWithPosition Lit81;
    static final PairWithPosition Lit82;
    static final PairWithPosition Lit83;
    static final PairWithPosition Lit84;
    static final SimpleSymbol Lit85;
    static final FString Lit86;
    static final IntNum Lit87;
    static final FString Lit88;
    static final FString Lit89;
    static final SimpleSymbol Lit9;
    static final FString Lit90;
    static final SimpleSymbol Lit91;
    static final PairWithPosition Lit92;
    static final PairWithPosition Lit93;
    static final PairWithPosition Lit94;
    static final SimpleSymbol Lit95;
    static final SimpleSymbol Lit96;
    static final FString Lit97;
    static final FString Lit98;
    static final SimpleSymbol Lit99;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn2 = null;
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
    public Label Label1;
    public final ModuleMethod ListUser$ErrorOccurred;
    public final ModuleMethod ListUser$Initialize;
    public Notifier Notifier1;
    public final ModuleMethod Notifier1$AfterChoosing;
    public TinyDB TinyDB1;
    public ListView UserList;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public Button btnListUser;
    public final ModuleMethod btnListUser$Click;
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
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    /* compiled from: ListUser.yail */
    public class frame0 extends ModuleBody {
        Object $alunos;
        final ModuleMethod lambda$Fn12;

        public frame0() {
            this.lambda$Fn12 = new ModuleMethod(this, 1, null, 4097);
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            return moduleMethod.selector == 1 ? lambda13(obj) : super.apply1(moduleMethod, obj);
        }

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            if (moduleMethod.selector != 1) {
                return super.match1(moduleMethod, obj, callContext);
            }
            callContext.value1 = obj;
            callContext.proc = moduleMethod;
            callContext.pc = 1;
            return 0;
        }

        Object lambda13(Object $aluno) {
            Object signalRuntimeError;
            Object signalRuntimeError2;
            ModuleMethod moduleMethod = runtime.yail$Mnlist$Mnadd$Mnto$Mnlist$Ex;
            if (this.$alunos instanceof Package) {
                signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(ListUser.Lit79), " is not bound in the current context"), "Unbound Variable");
            } else {
                signalRuntimeError = this.$alunos;
            }
            ModuleMethod moduleMethod2 = strings.string$Mnappend;
            String str = "RA:";
            ModuleMethod moduleMethod3 = runtime.yail$Mnlist$Mnget$Mnitem;
            if ($aluno instanceof Package) {
                signalRuntimeError2 = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(ListUser.Lit80), " is not bound in the current context"), "Unbound Variable");
            } else {
                signalRuntimeError2 = $aluno;
            }
            Object callYailPrimitive = runtime.callYailPrimitive(moduleMethod3, LList.list2(signalRuntimeError2, ListUser.Lit60), ListUser.Lit81, "select list item");
            String str2 = "              Nome:";
            ModuleMethod moduleMethod4 = runtime.yail$Mnlist$Mnget$Mnitem;
            if ($aluno instanceof Package) {
                $aluno = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(ListUser.Lit80), " is not bound in the current context"), "Unbound Variable");
            }
            return runtime.callYailPrimitive(moduleMethod, LList.list2(signalRuntimeError, runtime.callYailPrimitive(moduleMethod2, LList.list4(str, callYailPrimitive, str2, runtime.callYailPrimitive(moduleMethod4, LList.list2($aluno, ListUser.Lit6), ListUser.Lit82, "select list item")), ListUser.Lit83, "join")), ListUser.Lit84, "add items to list");
        }
    }

    /* compiled from: ListUser.yail */
    public class frame extends ModuleBody {
        ListUser $main;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case SetExp.DEFINING_FLAG /*2*/:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case SetExp.GLOBAL_FLAG /*4*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case ArithOp.QUOTIENT /*6*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
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
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case ArithOp.AND /*13*/:
                    if (!(obj instanceof ListUser)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case Sequence.DOCUMENT_VALUE /*34*/:
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
                case XDataType.ANY_ATOMIC_TYPE_CODE /*3*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case SetExp.GLOBAL_FLAG /*4*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case ArithOp.QUOTIENT_EXACT /*7*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case SetExp.PREFER_BINDING2 /*8*/:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case ArithOp.ASHIFT_LEFT /*10*/:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case ArithOp.XOR /*15*/:
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
                case ArithOp.ASHIFT_GENERAL /*9*/:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case ArithOp.IOR /*14*/:
                    if (!(obj instanceof ListUser)) {
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
                case Sequence.INT_U32_VALUE /*21*/:
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
                case SetExp.DEFINING_FLAG /*2*/:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case SetExp.GLOBAL_FLAG /*4*/:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "lookup-in-form-environment", 1, obj);
                    }
                case ArithOp.QUOTIENT /*6*/:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "is-bound-in-form-environment", 1, obj);
                    }
                case ArithOp.ASHIFT_RIGHT /*11*/:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case ArithOp.LSHIFT_RIGHT /*12*/:
                    this.$main.sendError(obj);
                    return Values.empty;
                case ArithOp.AND /*13*/:
                    this.$main.processException(obj);
                    return Values.empty;
                case Sequence.DOCUMENT_VALUE /*34*/:
                    return this.$main.Notifier1$AfterChoosing(obj);
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            switch (moduleMethod.selector) {
                case ArithOp.ASHIFT_GENERAL /*9*/:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case ArithOp.IOR /*14*/:
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
                case Sequence.INT_U32_VALUE /*21*/:
                    return this.$main.ListUser$ErrorOccurred(obj, obj2, obj3, obj4);
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case XDataType.ANY_ATOMIC_TYPE_CODE /*3*/:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case SetExp.GLOBAL_FLAG /*4*/:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case ArithOp.QUOTIENT_EXACT /*7*/:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e22) {
                        throw new WrongType(e22, "add-to-global-var-environment", 1, obj);
                    }
                case SetExp.PREFER_BINDING2 /*8*/:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case ArithOp.ASHIFT_LEFT /*10*/:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case ArithOp.XOR /*15*/:
                    return this.$main.lookupHandler(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case SetExp.PROCEDURE /*16*/:
                    return ListUser.lambda2();
                case Sequence.INT_U8_VALUE /*17*/:
                    this.$main.$define();
                    return Values.empty;
                case Sequence.INT_S8_VALUE /*18*/:
                    return ListUser.lambda3();
                case Sequence.INT_U16_VALUE /*19*/:
                    return ListUser.lambda4();
                case Sequence.INT_S16_VALUE /*20*/:
                    return this.$main.ListUser$Initialize();
                case Sequence.INT_S32_VALUE /*22*/:
                    return ListUser.lambda5();
                case Sequence.INT_U64_VALUE /*23*/:
                    return ListUser.lambda6();
                case Sequence.INT_S64_VALUE /*24*/:
                    return ListUser.lambda7();
                case Sequence.FLOAT_VALUE /*25*/:
                    return ListUser.lambda8();
                case Sequence.DOUBLE_VALUE /*26*/:
                    return this.$main.btnReturn$Click();
                case Sequence.BOOLEAN_VALUE /*27*/:
                    return ListUser.lambda9();
                case Sequence.TEXT_BYTE_VALUE /*28*/:
                    return ListUser.lambda10();
                case Sequence.CHAR_VALUE /*29*/:
                    return ListUser.lambda11();
                case XDataType.DAY_TIME_DURATION_TYPE_CODE /*30*/:
                    return ListUser.lambda12();
                case Sequence.CDATA_VALUE /*31*/:
                    return this.$main.btnListUser$Click();
                case SetExp.SET_IF_UNBOUND /*32*/:
                    return ListUser.lambda14();
                case Sequence.ELEMENT_VALUE /*33*/:
                    return ListUser.lambda15();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
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
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    static {
        Lit111 = (SimpleSymbol) new SimpleSymbol("any").readResolve();
        Lit110 = (SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve();
        Lit109 = (SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve();
        Lit108 = (SimpleSymbol) new SimpleSymbol("send-error").readResolve();
        Lit107 = (SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve();
        Lit106 = (SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve();
        Lit105 = (SimpleSymbol) new SimpleSymbol("add-to-components").readResolve();
        Lit104 = (SimpleSymbol) new SimpleSymbol("add-to-events").readResolve();
        Lit103 = (SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve();
        Lit102 = (SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve();
        Lit101 = (SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve();
        Lit100 = (SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve();
        Lit99 = (SimpleSymbol) new SimpleSymbol("android-log-form").readResolve();
        Lit98 = new FString("com.google.appinventor.components.runtime.TinyDB");
        Lit97 = new FString("com.google.appinventor.components.runtime.TinyDB");
        Lit96 = (SimpleSymbol) new SimpleSymbol("AfterChoosing").readResolve();
        Lit95 = (SimpleSymbol) new SimpleSymbol("Notifier1$AfterChoosing").readResolve();
        Lit94 = PairWithPosition.make(Lit111, PairWithPosition.make(Lit111, LList.Empty, "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/ListUser.yail", 455008), "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/ListUser.yail", 455003);
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit9 = simpleSymbol;
        Lit93 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/ListUser.yail", 454861);
        Lit92 = PairWithPosition.make(Lit111, PairWithPosition.make(Lit111, LList.Empty, "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/ListUser.yail", 454767), "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/ListUser.yail", 454762);
        Lit91 = (SimpleSymbol) new SimpleSymbol("$choice").readResolve();
        Lit90 = new FString("com.google.appinventor.components.runtime.Notifier");
        Lit89 = new FString("com.google.appinventor.components.runtime.Notifier");
        Lit88 = new FString("com.google.appinventor.components.runtime.ListView");
        Lit87 = IntNum.make((int) Component.COLOR_NONE);
        Lit86 = new FString("com.google.appinventor.components.runtime.ListView");
        Lit85 = (SimpleSymbol) new SimpleSymbol("btnListUser$Click").readResolve();
        simpleSymbol = (SimpleSymbol) new SimpleSymbol("list").readResolve();
        Lit77 = simpleSymbol;
        Lit84 = PairWithPosition.make(simpleSymbol, PairWithPosition.make(Lit111, LList.Empty, "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/ListUser.yail", 381891), "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/ListUser.yail", 381885);
        Lit83 = PairWithPosition.make(Lit9, PairWithPosition.make(Lit9, PairWithPosition.make(Lit9, PairWithPosition.make(Lit9, LList.Empty, "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/ListUser.yail", 381867), "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/ListUser.yail", 381862), "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/ListUser.yail", 381857), "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/ListUser.yail", 381851);
        SimpleSymbol simpleSymbol2 = Lit77;
        simpleSymbol = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit7 = simpleSymbol;
        Lit82 = PairWithPosition.make(simpleSymbol2, PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/ListUser.yail", 381820), "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/ListUser.yail", 381814);
        Lit81 = PairWithPosition.make(Lit77, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/ListUser.yail", 381677), "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/ListUser.yail", 381671);
        Lit80 = (SimpleSymbol) new SimpleSymbol("$aluno").readResolve();
        Lit79 = (SimpleSymbol) new SimpleSymbol("$alunos").readResolve();
        Lit78 = (SimpleSymbol) new SimpleSymbol("$names").readResolve();
        Lit76 = (SimpleSymbol) new SimpleSymbol("Elements").readResolve();
        Lit75 = (SimpleSymbol) new SimpleSymbol("UserList").readResolve();
        Lit74 = PairWithPosition.make(Lit9, PairWithPosition.make(Lit111, LList.Empty, "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/ListUser.yail", 381030), "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/ListUser.yail", 381024);
        Lit73 = (SimpleSymbol) new SimpleSymbol("GetValue").readResolve();
        Lit72 = (SimpleSymbol) new SimpleSymbol("TinyDB1").readResolve();
        Lit71 = new FString("com.google.appinventor.components.runtime.Button");
        Lit70 = IntNum.make(-1090);
        int[] iArr = new int[2];
        iArr[0] = Component.COLOR_PINK;
        Lit69 = IntNum.make(iArr);
        Lit68 = new FString("com.google.appinventor.components.runtime.Button");
        Lit67 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit66 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve();
        Lit65 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit64 = (SimpleSymbol) new SimpleSymbol("Click").readResolve();
        Lit63 = (SimpleSymbol) new SimpleSymbol("btnReturn$Click").readResolve();
        Lit62 = new FString("com.google.appinventor.components.runtime.Button");
        Lit61 = (SimpleSymbol) new SimpleSymbol("Text").readResolve();
        Lit60 = IntNum.make(2);
        Lit59 = (SimpleSymbol) new SimpleSymbol("Shape").readResolve();
        Lit58 = IntNum.make((int) DateTime.TIMEZONE_MASK);
        Lit57 = IntNum.make(1);
        Lit56 = (SimpleSymbol) new SimpleSymbol("FontTypeface").readResolve();
        Lit55 = IntNum.make(13);
        Lit54 = (SimpleSymbol) new SimpleSymbol("FontSize").readResolve();
        Lit53 = (SimpleSymbol) new SimpleSymbol("FontBold").readResolve();
        iArr = new int[2];
        iArr[0] = Component.COLOR_PINK;
        Lit52 = IntNum.make(iArr);
        Lit51 = new FString("com.google.appinventor.components.runtime.Button");
        Lit50 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit49 = IntNum.make(-2);
        Lit48 = (SimpleSymbol) new SimpleSymbol("Width").readResolve();
        Lit47 = IntNum.make(32);
        Lit46 = (SimpleSymbol) new SimpleSymbol("Height").readResolve();
        Lit45 = IntNum.make((int) Component.COLOR_NONE);
        Lit44 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve();
        Lit43 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit42 = new FString("com.google.appinventor.components.runtime.Label");
        Lit41 = (SimpleSymbol) new SimpleSymbol("Label1").readResolve();
        Lit40 = new FString("com.google.appinventor.components.runtime.Label");
        Lit39 = (SimpleSymbol) new SimpleSymbol("ErrorOccurred").readResolve();
        Lit38 = (SimpleSymbol) new SimpleSymbol("ListUser$ErrorOccurred").readResolve();
        simpleSymbol2 = Lit9;
        SimpleSymbol simpleSymbol3 = Lit9;
        SimpleSymbol simpleSymbol4 = Lit9;
        SimpleSymbol simpleSymbol5 = Lit9;
        simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve();
        Lit17 = simpleSymbol;
        Lit37 = PairWithPosition.make(simpleSymbol2, PairWithPosition.make(simpleSymbol3, PairWithPosition.make(simpleSymbol4, PairWithPosition.make(simpleSymbol5, PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/ListUser.yail", 98489), "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/ListUser.yail", 98484), "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/ListUser.yail", 98479), "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/ListUser.yail", 98474), "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/ListUser.yail", 98468);
        Lit36 = (SimpleSymbol) new SimpleSymbol("ShowChooseDialog").readResolve();
        Lit35 = (SimpleSymbol) new SimpleSymbol("Notifier1").readResolve();
        Lit34 = (SimpleSymbol) new SimpleSymbol("Initialize").readResolve();
        Lit33 = (SimpleSymbol) new SimpleSymbol("ListUser$Initialize").readResolve();
        Lit32 = (SimpleSymbol) new SimpleSymbol("TextColor").readResolve();
        Lit31 = (SimpleSymbol) new SimpleSymbol("btnListUser").readResolve();
        Lit30 = (SimpleSymbol) new SimpleSymbol("$backgroundColor").readResolve();
        Lit29 = (SimpleSymbol) new SimpleSymbol("btnReturn").readResolve();
        Lit28 = (SimpleSymbol) new SimpleSymbol("$fontColor").readResolve();
        Lit27 = PairWithPosition.make(Lit77, LList.Empty, "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/ListUser.yail", 90484);
        Lit26 = PairWithPosition.make(Lit111, PairWithPosition.make(Lit111, PairWithPosition.make(Lit111, LList.Empty, "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/ListUser.yail", 90461), "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/ListUser.yail", 90457), "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/ListUser.yail", 90452);
        Lit25 = IntNum.make(229);
        Lit24 = IntNum.make(246);
        Lit23 = IntNum.make(239);
        Lit22 = PairWithPosition.make(Lit77, LList.Empty, "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/ListUser.yail", 90295);
        Lit21 = PairWithPosition.make(Lit111, PairWithPosition.make(Lit111, PairWithPosition.make(Lit111, LList.Empty, "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/ListUser.yail", 90272), "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/ListUser.yail", 90268), "/tmp/1480436647759_0.8027524091519717-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/ListUser.yail", 90263);
        Lit20 = IntNum.make(45);
        Lit19 = IntNum.make(168);
        Lit18 = IntNum.make(91);
        Lit16 = (SimpleSymbol) new SimpleSymbol("TitleVisible").readResolve();
        Lit15 = (SimpleSymbol) new SimpleSymbol("Title").readResolve();
        Lit14 = (SimpleSymbol) new SimpleSymbol("Sizing").readResolve();
        Lit13 = (SimpleSymbol) new SimpleSymbol("OpenScreenAnimation").readResolve();
        Lit12 = (SimpleSymbol) new SimpleSymbol("CloseScreenAnimation").readResolve();
        iArr = new int[2];
        iArr[0] = Component.COLOR_LTGRAY;
        Lit11 = IntNum.make(iArr);
        Lit10 = (SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve();
        Lit8 = (SimpleSymbol) new SimpleSymbol("AppName").readResolve();
        Lit6 = IntNum.make(3);
        Lit5 = (SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve();
        Lit4 = IntNum.make(0);
        Lit3 = (SimpleSymbol) new SimpleSymbol("g$alunos").readResolve();
        Lit2 = (SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve();
        Lit1 = (SimpleSymbol) new SimpleSymbol("getMessage").readResolve();
        Lit0 = (SimpleSymbol) new SimpleSymbol("ListUser").readResolve();
    }

    public ListUser() {
        ModuleInfo.register(this);
        ModuleBody appinventor_ai_efelipecarlos_Caller_ListUser_frame = new frame();
        appinventor_ai_efelipecarlos_Caller_ListUser_frame.$main = this;
        this.android$Mnlog$Mnform = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 2, Lit99, 4097);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 3, Lit100, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 4, Lit101, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 6, Lit102, 4097);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 7, Lit103, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 8, Lit104, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 9, Lit105, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 10, Lit106, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 11, Lit107, 4097);
        this.send$Mnerror = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 12, Lit108, 4097);
        this.process$Mnexception = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 13, "process-exception", 4097);
        this.dispatchEvent = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 14, Lit109, 16388);
        this.lookup$Mnhandler = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 15, Lit110, 8194);
        PropertySet moduleMethod = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 16, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime4768547486110674558.scm:547");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 17, "$define", 0);
        lambda$Fn2 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 18, null, 0);
        lambda$Fn3 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 19, null, 0);
        this.ListUser$Initialize = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 20, Lit33, 0);
        this.ListUser$ErrorOccurred = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 21, Lit38, 16388);
        lambda$Fn4 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 22, null, 0);
        lambda$Fn5 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 23, null, 0);
        lambda$Fn6 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 24, null, 0);
        lambda$Fn7 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 25, null, 0);
        this.btnReturn$Click = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 26, Lit63, 0);
        lambda$Fn8 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 27, null, 0);
        lambda$Fn9 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 28, null, 0);
        lambda$Fn10 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 29, null, 0);
        lambda$Fn11 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 30, null, 0);
        this.btnListUser$Click = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 31, Lit85, 0);
        lambda$Fn13 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 32, null, 0);
        lambda$Fn14 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 33, null, 0);
        this.Notifier1$AfterChoosing = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_ListUser_frame, 34, Lit95, 4097);
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
            ListUser = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            find = require.find("com.google.youngandroid.runtime");
            try {
                ((Runnable) find).run();
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit3, Lit4), $result);
                } else {
                    addToGlobalVars(Lit3, lambda$Fn2);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Lit6, Lit7);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "IBMP_V4_3", Lit9);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit10, Lit11, Lit7);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit12, "fade", Lit9);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit13, "zoom", Lit9);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "Responsive", Lit9);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit15, "ListUser", Lit9);
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Boolean.FALSE, Lit17), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn3));
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit33, this.ListUser$Initialize);
                } else {
                    addToFormEnvironment(Lit33, this.ListUser$Initialize);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ListUser", "Initialize");
                } else {
                    addToEvents(Lit0, Lit34);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit38, this.ListUser$ErrorOccurred);
                } else {
                    addToFormEnvironment(Lit38, this.ListUser$ErrorOccurred);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ListUser", "ErrorOccurred");
                } else {
                    addToEvents(Lit0, Lit39);
                }
                this.Label1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit40, Lit41, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit42, Lit41, Boolean.FALSE);
                }
                this.HorizontalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit43, Lit44, lambda$Fn4), $result);
                } else {
                    addToComponents(Lit0, Lit50, Lit44, lambda$Fn5);
                }
                this.btnReturn = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit44, Lit51, Lit29, lambda$Fn6), $result);
                } else {
                    addToComponents(Lit44, Lit62, Lit29, lambda$Fn7);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit63, this.btnReturn$Click);
                } else {
                    addToFormEnvironment(Lit63, this.btnReturn$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btnReturn", "Click");
                } else {
                    addToEvents(Lit29, Lit64);
                }
                this.HorizontalArrangement2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit65, Lit66, lambda$Fn8), $result);
                } else {
                    addToComponents(Lit0, Lit67, Lit66, lambda$Fn9);
                }
                this.btnListUser = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit68, Lit31, lambda$Fn10), $result);
                } else {
                    addToComponents(Lit0, Lit71, Lit31, lambda$Fn11);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit85, this.btnListUser$Click);
                } else {
                    addToFormEnvironment(Lit85, this.btnListUser$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btnListUser", "Click");
                } else {
                    addToEvents(Lit31, Lit64);
                }
                this.UserList = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit86, Lit75, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit0, Lit88, Lit75, lambda$Fn14);
                }
                this.Notifier1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit89, Lit35, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit90, Lit35, Boolean.FALSE);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit95, this.Notifier1$AfterChoosing);
                } else {
                    addToFormEnvironment(Lit95, this.Notifier1$AfterChoosing);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Notifier1", "AfterChoosing");
                } else {
                    addToEvents(Lit35, Lit96);
                }
                this.TinyDB1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit97, Lit72, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit98, Lit72, Boolean.FALSE);
                }
                runtime.initRuntime();
            } catch (ClassCastException e) {
                throw new WrongType(e, "java.lang.Runnable.run()", 1, find);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "java.lang.Runnable.run()", 1, find);
        }
    }

    static IntNum lambda3() {
        return Lit4;
    }

    static Object lambda4() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Lit6, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "IBMP_V4_3", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit10, Lit11, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit12, "fade", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit13, "zoom", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "Responsive", Lit9);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit15, "ListUser", Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Boolean.FALSE, Lit17);
    }

    public Object ListUser$Initialize() {
        Object signalRuntimeError;
        runtime.setThisForm();
        Object $backgroundColor = runtime.callYailPrimitive(runtime.make$Mncolor, LList.list1(runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list3(Lit18, Lit19, Lit20), Lit21, "make a list")), Lit22, "make-color");
        Object $fontColor = runtime.callYailPrimitive(runtime.make$Mncolor, LList.list1(runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list3(Lit23, Lit24, Lit25), Lit26, "make a list")), Lit27, "make-color");
        SimpleSymbol simpleSymbol = Lit0;
        SimpleSymbol simpleSymbol2 = Lit10;
        if ($fontColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit28), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $fontColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit7);
        simpleSymbol = Lit29;
        simpleSymbol2 = Lit10;
        if ($backgroundColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit30), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $backgroundColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit7);
        simpleSymbol = Lit31;
        simpleSymbol2 = Lit10;
        if ($backgroundColor instanceof Package) {
            $backgroundColor = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit30), " is not bound in the current context"), "Unbound Variable");
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, $backgroundColor, Lit7);
        simpleSymbol = Lit29;
        simpleSymbol2 = Lit32;
        if ($fontColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit28), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $fontColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit7);
        simpleSymbol = Lit31;
        simpleSymbol2 = Lit32;
        if ($fontColor instanceof Package) {
            $fontColor = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit28), " is not bound in the current context"), "Unbound Variable");
        }
        return runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, $fontColor, Lit7);
    }

    public Object ListUser$ErrorOccurred(Object $component, Object $functionName, Object $errorNumber, Object $message) {
        runtime.sanitizeComponentData($component);
        runtime.sanitizeComponentData($functionName);
        runtime.sanitizeComponentData($errorNumber);
        runtime.sanitizeComponentData($message);
        runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit35;
        SimpleSymbol simpleSymbol2 = Lit36;
        Pair list1 = LList.list1("Sem usu\u00e1rios cadastrados!");
        LList.chain4(list1, "Opa", "Cadastrar agora", "Deixar para depois", Boolean.TRUE);
        return runtime.callComponentMethod(simpleSymbol, simpleSymbol2, list1, Lit37);
    }

    static Object lambda5() {
        runtime.setAndCoerceProperty$Ex(Lit44, Lit10, Lit45, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit46, Lit47, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit44, Lit48, Lit49, Lit7);
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit44, Lit10, Lit45, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit46, Lit47, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit44, Lit48, Lit49, Lit7);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit29, Lit10, Lit52, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit53, Boolean.TRUE, Lit17);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit54, Lit55, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit56, Lit57, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit46, Lit47, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit48, Lit58, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit59, Lit60, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit29, Lit61, "RETURN", Lit9);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit29, Lit10, Lit52, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit53, Boolean.TRUE, Lit17);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit54, Lit55, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit56, Lit57, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit46, Lit47, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit48, Lit58, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit59, Lit60, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit29, Lit61, "RETURN", Lit9);
    }

    public Object btnReturn$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.close$Mnscreen, LList.Empty, LList.Empty, "close screen");
    }

    static Object lambda10() {
        return runtime.setAndCoerceProperty$Ex(Lit66, Lit46, Lit47, Lit7);
    }

    static Object lambda9() {
        return runtime.setAndCoerceProperty$Ex(Lit66, Lit46, Lit47, Lit7);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit31, Lit10, Lit69, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit31, Lit53, Boolean.TRUE, Lit17);
        runtime.setAndCoerceProperty$Ex(Lit31, Lit54, Lit55, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit31, Lit56, Lit57, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit31, Lit46, Lit47, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit31, Lit48, Lit70, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit31, Lit59, Lit60, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit31, Lit61, "LIST REGISTERED USERS", Lit9);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit31, Lit10, Lit69, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit31, Lit53, Boolean.TRUE, Lit17);
        runtime.setAndCoerceProperty$Ex(Lit31, Lit54, Lit55, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit31, Lit56, Lit57, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit31, Lit46, Lit47, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit31, Lit48, Lit70, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit31, Lit59, Lit60, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit31, Lit61, "LIST REGISTERED USERS", Lit9);
    }

    public Object btnListUser$Click() {
        Object signalRuntimeError;
        frame0 appinventor_ai_efelipecarlos_Caller_ListUser_frame0 = new frame0();
        runtime.setThisForm();
        Object $names = runtime.callComponentMethod(Lit72, Lit73, LList.list2("cards", ElementType.MATCH_ANY_LOCALNAME), Lit74);
        runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list");
        runtime.setAndCoerceProperty$Ex(Lit75, Lit76, runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list"), Lit77);
        Symbol symbol = Lit3;
        if ($names instanceof Package) {
            $names = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit78), " is not bound in the current context"), "Unbound Variable");
        }
        runtime.addGlobalVarToCurrentFormEnvironment(symbol, $names);
        appinventor_ai_efelipecarlos_Caller_ListUser_frame0.$alunos = runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list");
        runtime.yailForEach(appinventor_ai_efelipecarlos_Caller_ListUser_frame0.lambda$Fn12, runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St));
        SimpleSymbol simpleSymbol = Lit75;
        SimpleSymbol simpleSymbol2 = Lit76;
        if (appinventor_ai_efelipecarlos_Caller_ListUser_frame0.$alunos instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit79), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = appinventor_ai_efelipecarlos_Caller_ListUser_frame0.$alunos;
        }
        return runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit77);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit75, Lit10, Lit87, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit75, Lit46, Lit49, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit75, Lit48, Lit49, Lit7);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit75, Lit10, Lit87, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit75, Lit46, Lit49, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit75, Lit48, Lit49, Lit7);
    }

    public Object Notifier1$AfterChoosing(Object $choice) {
        Object signalRuntimeError;
        $choice = runtime.sanitizeComponentData($choice);
        runtime.setThisForm();
        ModuleMethod moduleMethod = runtime.yail$Mnequal$Qu;
        if ($choice instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit91), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $choice;
        }
        if (runtime.callYailPrimitive(moduleMethod, LList.list2(signalRuntimeError, "Cadastrar agora"), Lit92, "=") != Boolean.FALSE) {
            return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Cadastrar"), Lit93, "open another screen");
        }
        moduleMethod = runtime.yail$Mnequal$Qu;
        if ($choice instanceof Package) {
            $choice = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit91), " is not bound in the current context"), "Unbound Variable");
        }
        return runtime.callYailPrimitive(moduleMethod, LList.list2($choice, "Deixar para depois"), Lit94, "=") != Boolean.FALSE ? runtime.callYailPrimitive(runtime.close$Mnscreen, LList.Empty, LList.Empty, "close screen") : Values.empty;
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
        ListUser = this;
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
        ListUser closureEnv = this;
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
