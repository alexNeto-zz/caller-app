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

/* compiled from: UserAttendances.yail */
public class UserAttendances extends Form implements Runnable {
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final SimpleSymbol Lit10;
    static final SimpleSymbol Lit100;
    static final PairWithPosition Lit101;
    static final PairWithPosition Lit102;
    static final PairWithPosition Lit103;
    static final PairWithPosition Lit104;
    static final SimpleSymbol Lit105;
    static final SimpleSymbol Lit106;
    static final SimpleSymbol Lit107;
    static final SimpleSymbol Lit108;
    static final SimpleSymbol Lit109;
    static final SimpleSymbol Lit11;
    static final SimpleSymbol Lit110;
    static final SimpleSymbol Lit111;
    static final SimpleSymbol Lit112;
    static final SimpleSymbol Lit113;
    static final SimpleSymbol Lit114;
    static final SimpleSymbol Lit115;
    static final SimpleSymbol Lit116;
    static final SimpleSymbol Lit117;
    static final SimpleSymbol Lit118;
    static final SimpleSymbol Lit119;
    static final SimpleSymbol Lit12;
    static final SimpleSymbol Lit13;
    static final SimpleSymbol Lit14;
    static final SimpleSymbol Lit15;
    static final IntNum Lit16;
    static final IntNum Lit17;
    static final IntNum Lit18;
    static final PairWithPosition Lit19;
    static final SimpleSymbol Lit2;
    static final PairWithPosition Lit20;
    static final IntNum Lit21;
    static final IntNum Lit22;
    static final IntNum Lit23;
    static final PairWithPosition Lit24;
    static final PairWithPosition Lit25;
    static final SimpleSymbol Lit26;
    static final SimpleSymbol Lit27;
    static final SimpleSymbol Lit28;
    static final SimpleSymbol Lit29;
    static final SimpleSymbol Lit3;
    static final SimpleSymbol Lit30;
    static final SimpleSymbol Lit31;
    static final SimpleSymbol Lit32;
    static final SimpleSymbol Lit33;
    static final SimpleSymbol Lit34;
    static final PairWithPosition Lit35;
    static final SimpleSymbol Lit36;
    static final SimpleSymbol Lit37;
    static final FString Lit38;
    static final SimpleSymbol Lit39;
    static final IntNum Lit4;
    static final FString Lit40;
    static final FString Lit41;
    static final SimpleSymbol Lit42;
    static final IntNum Lit43;
    static final FString Lit44;
    static final FString Lit45;
    static final IntNum Lit46;
    static final SimpleSymbol Lit47;
    static final SimpleSymbol Lit48;
    static final IntNum Lit49;
    static final SimpleSymbol Lit5;
    static final SimpleSymbol Lit50;
    static final IntNum Lit51;
    static final SimpleSymbol Lit52;
    static final IntNum Lit53;
    static final SimpleSymbol Lit54;
    static final IntNum Lit55;
    static final SimpleSymbol Lit56;
    static final IntNum Lit57;
    static final SimpleSymbol Lit58;
    static final FString Lit59;
    static final SimpleSymbol Lit6;
    static final SimpleSymbol Lit60;
    static final SimpleSymbol Lit61;
    static final FString Lit62;
    static final SimpleSymbol Lit63;
    static final IntNum Lit64;
    static final FString Lit65;
    static final FString Lit66;
    static final SimpleSymbol Lit67;
    static final SimpleSymbol Lit68;
    static final IntNum Lit69;
    static final SimpleSymbol Lit7;
    static final IntNum Lit70;
    static final IntNum Lit71;
    static final FString Lit72;
    static final FString Lit73;
    static final IntNum Lit74;
    static final IntNum Lit75;
    static final FString Lit76;
    static final SimpleSymbol Lit77;
    static final SimpleSymbol Lit78;
    static final PairWithPosition Lit79;
    static final IntNum Lit8;
    static final SimpleSymbol Lit80;
    static final SimpleSymbol Lit81;
    static final SimpleSymbol Lit82;
    static final SimpleSymbol Lit83;
    static final SimpleSymbol Lit84;
    static final SimpleSymbol Lit85;
    static final PairWithPosition Lit86;
    static final PairWithPosition Lit87;
    static final IntNum Lit88;
    static final PairWithPosition Lit89;
    static final SimpleSymbol Lit9;
    static final PairWithPosition Lit90;
    static final PairWithPosition Lit91;
    static final SimpleSymbol Lit92;
    static final FString Lit93;
    static final IntNum Lit94;
    static final FString Lit95;
    static final FString Lit96;
    static final FString Lit97;
    static final FString Lit98;
    static final FString Lit99;
    public static UserAttendances UserAttendances;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
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
    public HorizontalArrangement HorizontalArrangement3;
    public Label Label1;
    public Notifier Notifier1;
    public final ModuleMethod Notifier1$AfterChoosing;
    public TinyDB TinyDB1;
    public final ModuleMethod UserAttendances$ErrorOccurred;
    public final ModuleMethod UserAttendances$Initialize;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public Button btnListarPresencas;
    public final ModuleMethod btnListarPresencas$Click;
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
    public ListView listAttendances;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    /* compiled from: UserAttendances.yail */
    public class frame0 extends ModuleBody {
        Object $alunos;
        final ModuleMethod lambda$Fn14;

        public frame0() {
            this.lambda$Fn14 = new ModuleMethod(this, 1, null, 4097);
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            return moduleMethod.selector == 1 ? lambda15(obj) : super.apply1(moduleMethod, obj);
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

        Object lambda15(Object $aluno) {
            Object signalRuntimeError;
            Object signalRuntimeError2;
            ModuleMethod moduleMethod = runtime.yail$Mnlist$Mnadd$Mnto$Mnlist$Ex;
            if (this.$alunos instanceof Package) {
                signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(UserAttendances.Lit84), " is not bound in the current context"), "Unbound Variable");
            } else {
                signalRuntimeError = this.$alunos;
            }
            ModuleMethod moduleMethod2 = strings.string$Mnappend;
            Pair list1 = LList.list1("RA:");
            ModuleMethod moduleMethod3 = runtime.yail$Mnlist$Mnget$Mnitem;
            if ($aluno instanceof Package) {
                signalRuntimeError2 = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(UserAttendances.Lit85), " is not bound in the current context"), "Unbound Variable");
            } else {
                signalRuntimeError2 = $aluno;
            }
            Object callYailPrimitive = runtime.callYailPrimitive(moduleMethod3, LList.list2(signalRuntimeError2, UserAttendances.Lit57), UserAttendances.Lit86, "select list item");
            String str = "              Nome:";
            ModuleMethod moduleMethod4 = runtime.yail$Mnlist$Mnget$Mnitem;
            if ($aluno instanceof Package) {
                signalRuntimeError2 = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(UserAttendances.Lit85), " is not bound in the current context"), "Unbound Variable");
            } else {
                signalRuntimeError2 = $aluno;
            }
            Pair chain4 = LList.chain4(list1, callYailPrimitive, str, runtime.callYailPrimitive(moduleMethod4, LList.list2(signalRuntimeError2, UserAttendances.Lit69), UserAttendances.Lit87, "select list item"), "             Data:");
            ModuleMethod moduleMethod5 = runtime.yail$Mnlist$Mnget$Mnitem;
            if ($aluno instanceof Package) {
                $aluno = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(UserAttendances.Lit85), " is not bound in the current context"), "Unbound Variable");
            }
            LList.chain1(chain4, runtime.callYailPrimitive(moduleMethod5, LList.list2($aluno, UserAttendances.Lit88), UserAttendances.Lit89, "select list item"));
            return runtime.callYailPrimitive(moduleMethod, LList.list2(signalRuntimeError, runtime.callYailPrimitive(moduleMethod2, list1, UserAttendances.Lit90, "join")), UserAttendances.Lit91, "add items to list");
        }
    }

    /* compiled from: UserAttendances.yail */
    public class frame extends ModuleBody {
        UserAttendances $main;

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
                    if (!(obj instanceof UserAttendances)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case Sequence.COMMENT_VALUE /*36*/:
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
                    if (!(obj instanceof UserAttendances)) {
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
                case Sequence.COMMENT_VALUE /*36*/:
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
                    return this.$main.UserAttendances$ErrorOccurred(obj, obj2, obj3, obj4);
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
                    return UserAttendances.lambda2();
                case Sequence.INT_U8_VALUE /*17*/:
                    this.$main.$define();
                    return Values.empty;
                case Sequence.INT_S8_VALUE /*18*/:
                    return UserAttendances.lambda3();
                case Sequence.INT_U16_VALUE /*19*/:
                    return UserAttendances.lambda4();
                case Sequence.INT_S16_VALUE /*20*/:
                    return this.$main.UserAttendances$Initialize();
                case Sequence.INT_S32_VALUE /*22*/:
                    return UserAttendances.lambda5();
                case Sequence.INT_U64_VALUE /*23*/:
                    return UserAttendances.lambda6();
                case Sequence.INT_S64_VALUE /*24*/:
                    return UserAttendances.lambda7();
                case Sequence.FLOAT_VALUE /*25*/:
                    return UserAttendances.lambda8();
                case Sequence.DOUBLE_VALUE /*26*/:
                    return this.$main.btnReturn$Click();
                case Sequence.BOOLEAN_VALUE /*27*/:
                    return UserAttendances.lambda9();
                case Sequence.TEXT_BYTE_VALUE /*28*/:
                    return UserAttendances.lambda10();
                case Sequence.CHAR_VALUE /*29*/:
                    return UserAttendances.lambda11();
                case XDataType.DAY_TIME_DURATION_TYPE_CODE /*30*/:
                    return UserAttendances.lambda12();
                case Sequence.CDATA_VALUE /*31*/:
                    return UserAttendances.lambda13();
                case SetExp.SET_IF_UNBOUND /*32*/:
                    return UserAttendances.lambda14();
                case Sequence.ELEMENT_VALUE /*33*/:
                    return this.$main.btnListarPresencas$Click();
                case Sequence.DOCUMENT_VALUE /*34*/:
                    return UserAttendances.lambda16();
                case Sequence.ATTRIBUTE_VALUE /*35*/:
                    return UserAttendances.lambda17();
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
                case Sequence.DOCUMENT_VALUE /*34*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.ATTRIBUTE_VALUE /*35*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    static {
        Lit119 = (SimpleSymbol) new SimpleSymbol("any").readResolve();
        Lit118 = (SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve();
        Lit117 = (SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve();
        Lit116 = (SimpleSymbol) new SimpleSymbol("send-error").readResolve();
        Lit115 = (SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve();
        Lit114 = (SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve();
        Lit113 = (SimpleSymbol) new SimpleSymbol("add-to-components").readResolve();
        Lit112 = (SimpleSymbol) new SimpleSymbol("add-to-events").readResolve();
        Lit111 = (SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve();
        Lit110 = (SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve();
        Lit109 = (SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve();
        Lit108 = (SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve();
        Lit107 = (SimpleSymbol) new SimpleSymbol("android-log-form").readResolve();
        Lit106 = (SimpleSymbol) new SimpleSymbol("AfterChoosing").readResolve();
        Lit105 = (SimpleSymbol) new SimpleSymbol("Notifier1$AfterChoosing").readResolve();
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit6 = simpleSymbol;
        Lit104 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 508352);
        Lit103 = PairWithPosition.make(Lit119, PairWithPosition.make(Lit119, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 508258), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 508253);
        Lit102 = PairWithPosition.make(Lit6, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 508105);
        Lit101 = PairWithPosition.make(Lit119, PairWithPosition.make(Lit119, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 508013), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 508008);
        Lit100 = (SimpleSymbol) new SimpleSymbol("$choice").readResolve();
        Lit99 = new FString("com.google.appinventor.components.runtime.Notifier");
        Lit98 = new FString("com.google.appinventor.components.runtime.Notifier");
        Lit97 = new FString("com.google.appinventor.components.runtime.TinyDB");
        Lit96 = new FString("com.google.appinventor.components.runtime.TinyDB");
        Lit95 = new FString("com.google.appinventor.components.runtime.ListView");
        Lit94 = IntNum.make((int) Component.COLOR_NONE);
        Lit93 = new FString("com.google.appinventor.components.runtime.ListView");
        Lit92 = (SimpleSymbol) new SimpleSymbol("btnListarPresencas$Click").readResolve();
        simpleSymbol = (SimpleSymbol) new SimpleSymbol("list").readResolve();
        Lit82 = simpleSymbol;
        Lit91 = PairWithPosition.make(simpleSymbol, PairWithPosition.make(Lit119, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 414822), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 414816);
        Lit90 = PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, PairWithPosition.make(Lit6, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 414798), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 414793), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 414788), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 414783), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 414778), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 414772);
        SimpleSymbol simpleSymbol2 = Lit82;
        simpleSymbol = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit9 = simpleSymbol;
        Lit89 = PairWithPosition.make(simpleSymbol2, PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 414741), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 414735);
        Lit88 = IntNum.make(4);
        Lit87 = PairWithPosition.make(Lit82, PairWithPosition.make(Lit9, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 414599), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 414593);
        Lit86 = PairWithPosition.make(Lit82, PairWithPosition.make(Lit9, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 414456), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 414450);
        Lit85 = (SimpleSymbol) new SimpleSymbol("$aluno").readResolve();
        Lit84 = (SimpleSymbol) new SimpleSymbol("$alunos").readResolve();
        Lit83 = (SimpleSymbol) new SimpleSymbol("$names").readResolve();
        Lit81 = (SimpleSymbol) new SimpleSymbol("Elements").readResolve();
        Lit80 = (SimpleSymbol) new SimpleSymbol("listAttendances").readResolve();
        Lit79 = PairWithPosition.make(Lit6, PairWithPosition.make(Lit119, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 413802), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 413796);
        Lit78 = (SimpleSymbol) new SimpleSymbol("GetValue").readResolve();
        Lit77 = (SimpleSymbol) new SimpleSymbol("TinyDB1").readResolve();
        Lit76 = new FString("com.google.appinventor.components.runtime.Button");
        Lit75 = IntNum.make((int) FullScreenVideoUtil.FULLSCREEN_VIDEO_ACTION_DURATION);
        int[] iArr = new int[2];
        iArr[0] = Component.COLOR_PINK;
        Lit74 = IntNum.make(iArr);
        Lit73 = new FString("com.google.appinventor.components.runtime.Button");
        Lit72 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit71 = IntNum.make(-2);
        Lit70 = IntNum.make((int) Component.COLOR_NONE);
        Lit69 = IntNum.make(3);
        Lit68 = (SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve();
        Lit67 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve();
        Lit66 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit65 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit64 = IntNum.make((int) Component.COLOR_NONE);
        Lit63 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement3").readResolve();
        Lit62 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit61 = (SimpleSymbol) new SimpleSymbol("Click").readResolve();
        Lit60 = (SimpleSymbol) new SimpleSymbol("btnReturn$Click").readResolve();
        Lit59 = new FString("com.google.appinventor.components.runtime.Button");
        Lit58 = (SimpleSymbol) new SimpleSymbol("Text").readResolve();
        Lit57 = IntNum.make(2);
        Lit56 = (SimpleSymbol) new SimpleSymbol("Shape").readResolve();
        Lit55 = IntNum.make((int) DateTime.TIMEZONE_MASK);
        Lit54 = (SimpleSymbol) new SimpleSymbol("Width").readResolve();
        Lit53 = IntNum.make(32);
        Lit52 = (SimpleSymbol) new SimpleSymbol("Height").readResolve();
        Lit51 = IntNum.make(1);
        Lit50 = (SimpleSymbol) new SimpleSymbol("FontTypeface").readResolve();
        Lit49 = IntNum.make(13);
        Lit48 = (SimpleSymbol) new SimpleSymbol("FontSize").readResolve();
        Lit47 = (SimpleSymbol) new SimpleSymbol("FontBold").readResolve();
        iArr = new int[2];
        iArr[0] = Component.COLOR_PINK;
        Lit46 = IntNum.make(iArr);
        Lit45 = new FString("com.google.appinventor.components.runtime.Button");
        Lit44 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit43 = IntNum.make((int) Component.COLOR_NONE);
        Lit42 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve();
        Lit41 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit40 = new FString("com.google.appinventor.components.runtime.Label");
        Lit39 = (SimpleSymbol) new SimpleSymbol("Label1").readResolve();
        Lit38 = new FString("com.google.appinventor.components.runtime.Label");
        Lit37 = (SimpleSymbol) new SimpleSymbol("ErrorOccurred").readResolve();
        Lit36 = (SimpleSymbol) new SimpleSymbol("UserAttendances$ErrorOccurred").readResolve();
        simpleSymbol2 = Lit6;
        SimpleSymbol simpleSymbol3 = Lit6;
        SimpleSymbol simpleSymbol4 = Lit6;
        SimpleSymbol simpleSymbol5 = Lit6;
        simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve();
        Lit15 = simpleSymbol;
        Lit35 = PairWithPosition.make(simpleSymbol2, PairWithPosition.make(simpleSymbol3, PairWithPosition.make(simpleSymbol4, PairWithPosition.make(simpleSymbol5, PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 94470), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 94465), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 94460), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 94455), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 94449);
        Lit34 = (SimpleSymbol) new SimpleSymbol("ShowChooseDialog").readResolve();
        Lit33 = (SimpleSymbol) new SimpleSymbol("Notifier1").readResolve();
        Lit32 = (SimpleSymbol) new SimpleSymbol("Initialize").readResolve();
        Lit31 = (SimpleSymbol) new SimpleSymbol("UserAttendances$Initialize").readResolve();
        Lit30 = (SimpleSymbol) new SimpleSymbol("TextColor").readResolve();
        Lit29 = (SimpleSymbol) new SimpleSymbol("btnListarPresencas").readResolve();
        Lit28 = (SimpleSymbol) new SimpleSymbol("$backgroundColor").readResolve();
        Lit27 = (SimpleSymbol) new SimpleSymbol("btnReturn").readResolve();
        Lit26 = (SimpleSymbol) new SimpleSymbol("$fontColor").readResolve();
        Lit25 = PairWithPosition.make(Lit82, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 86388);
        Lit24 = PairWithPosition.make(Lit119, PairWithPosition.make(Lit119, PairWithPosition.make(Lit119, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 86365), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 86361), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 86356);
        Lit23 = IntNum.make(229);
        Lit22 = IntNum.make(246);
        Lit21 = IntNum.make(239);
        Lit20 = PairWithPosition.make(Lit82, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 86199);
        Lit19 = PairWithPosition.make(Lit119, PairWithPosition.make(Lit119, PairWithPosition.make(Lit119, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 86176), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 86172), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/UserAttendances.yail", 86167);
        Lit18 = IntNum.make(45);
        Lit17 = IntNum.make(168);
        Lit16 = IntNum.make(91);
        Lit14 = (SimpleSymbol) new SimpleSymbol("TitleVisible").readResolve();
        Lit13 = (SimpleSymbol) new SimpleSymbol("Title").readResolve();
        Lit12 = (SimpleSymbol) new SimpleSymbol("Sizing").readResolve();
        Lit11 = (SimpleSymbol) new SimpleSymbol("OpenScreenAnimation").readResolve();
        Lit10 = (SimpleSymbol) new SimpleSymbol("CloseScreenAnimation").readResolve();
        iArr = new int[2];
        iArr[0] = Component.COLOR_LTGRAY;
        Lit8 = IntNum.make(iArr);
        Lit7 = (SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve();
        Lit5 = (SimpleSymbol) new SimpleSymbol("AppName").readResolve();
        Lit4 = IntNum.make(0);
        Lit3 = (SimpleSymbol) new SimpleSymbol("g$alunos").readResolve();
        Lit2 = (SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve();
        Lit1 = (SimpleSymbol) new SimpleSymbol("getMessage").readResolve();
        Lit0 = (SimpleSymbol) new SimpleSymbol("UserAttendances").readResolve();
    }

    public UserAttendances() {
        ModuleInfo.register(this);
        ModuleBody appinventor_ai_efelipecarlos_Caller_UserAttendances_frame = new frame();
        appinventor_ai_efelipecarlos_Caller_UserAttendances_frame.$main = this;
        this.android$Mnlog$Mnform = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 2, Lit107, 4097);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 3, Lit108, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 4, Lit109, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 6, Lit110, 4097);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 7, Lit111, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 8, Lit112, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 9, Lit113, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 10, Lit114, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 11, Lit115, 4097);
        this.send$Mnerror = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 12, Lit116, 4097);
        this.process$Mnexception = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 13, "process-exception", 4097);
        this.dispatchEvent = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 14, Lit117, 16388);
        this.lookup$Mnhandler = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 15, Lit118, 8194);
        PropertySet moduleMethod = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 16, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime3960804766349238341.scm:547");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 17, "$define", 0);
        lambda$Fn2 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 18, null, 0);
        lambda$Fn3 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 19, null, 0);
        this.UserAttendances$Initialize = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 20, Lit31, 0);
        this.UserAttendances$ErrorOccurred = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 21, Lit36, 16388);
        lambda$Fn4 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 22, null, 0);
        lambda$Fn5 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 23, null, 0);
        lambda$Fn6 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 24, null, 0);
        lambda$Fn7 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 25, null, 0);
        this.btnReturn$Click = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 26, Lit60, 0);
        lambda$Fn8 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 27, null, 0);
        lambda$Fn9 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 28, null, 0);
        lambda$Fn10 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 29, null, 0);
        lambda$Fn11 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 30, null, 0);
        lambda$Fn12 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 31, null, 0);
        lambda$Fn13 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 32, null, 0);
        this.btnListarPresencas$Click = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 33, Lit92, 0);
        lambda$Fn15 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 34, null, 0);
        lambda$Fn16 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 35, null, 0);
        this.Notifier1$AfterChoosing = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame, 36, Lit105, 4097);
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
            UserAttendances = null;
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
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit5, "IBMP_V4_4", Lit6);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit7, Lit8, Lit9);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "fade", Lit6);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit11, "zoom", Lit6);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit12, "Responsive", Lit6);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit13, "UserAttendances", Lit6);
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit14, Boolean.FALSE, Lit15), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn3));
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit31, this.UserAttendances$Initialize);
                } else {
                    addToFormEnvironment(Lit31, this.UserAttendances$Initialize);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "UserAttendances", "Initialize");
                } else {
                    addToEvents(Lit0, Lit32);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit36, this.UserAttendances$ErrorOccurred);
                } else {
                    addToFormEnvironment(Lit36, this.UserAttendances$ErrorOccurred);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "UserAttendances", "ErrorOccurred");
                } else {
                    addToEvents(Lit0, Lit37);
                }
                this.Label1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit38, Lit39, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit40, Lit39, Boolean.FALSE);
                }
                this.HorizontalArrangement2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit41, Lit42, lambda$Fn4), $result);
                } else {
                    addToComponents(Lit0, Lit44, Lit42, lambda$Fn5);
                }
                this.btnReturn = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit42, Lit45, Lit27, lambda$Fn6), $result);
                } else {
                    addToComponents(Lit42, Lit59, Lit27, lambda$Fn7);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit60, this.btnReturn$Click);
                } else {
                    addToFormEnvironment(Lit60, this.btnReturn$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btnReturn", "Click");
                } else {
                    addToEvents(Lit27, Lit61);
                }
                this.HorizontalArrangement3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit62, Lit63, lambda$Fn8), $result);
                } else {
                    addToComponents(Lit0, Lit65, Lit63, lambda$Fn9);
                }
                this.HorizontalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit66, Lit67, lambda$Fn10), $result);
                } else {
                    addToComponents(Lit0, Lit72, Lit67, lambda$Fn11);
                }
                this.btnListarPresencas = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit67, Lit73, Lit29, lambda$Fn12), $result);
                } else {
                    addToComponents(Lit67, Lit76, Lit29, lambda$Fn13);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit92, this.btnListarPresencas$Click);
                } else {
                    addToFormEnvironment(Lit92, this.btnListarPresencas$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btnListarPresencas", "Click");
                } else {
                    addToEvents(Lit29, Lit61);
                }
                this.listAttendances = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit93, Lit80, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit0, Lit95, Lit80, lambda$Fn16);
                }
                this.TinyDB1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit96, Lit77, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit97, Lit77, Boolean.FALSE);
                }
                this.Notifier1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit98, Lit33, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit99, Lit33, Boolean.FALSE);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit105, this.Notifier1$AfterChoosing);
                } else {
                    addToFormEnvironment(Lit105, this.Notifier1$AfterChoosing);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Notifier1", "AfterChoosing");
                } else {
                    addToEvents(Lit33, Lit106);
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
        runtime.setAndCoerceProperty$Ex(Lit0, Lit5, "IBMP_V4_4", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit7, Lit8, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "fade", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit11, "zoom", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit12, "Responsive", Lit6);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit13, "UserAttendances", Lit6);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit14, Boolean.FALSE, Lit15);
    }

    public Object UserAttendances$Initialize() {
        Object signalRuntimeError;
        runtime.setThisForm();
        Object $backgroundColor = runtime.callYailPrimitive(runtime.make$Mncolor, LList.list1(runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list3(Lit16, Lit17, Lit18), Lit19, "make a list")), Lit20, "make-color");
        Object $fontColor = runtime.callYailPrimitive(runtime.make$Mncolor, LList.list1(runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list3(Lit21, Lit22, Lit23), Lit24, "make a list")), Lit25, "make-color");
        SimpleSymbol simpleSymbol = Lit0;
        SimpleSymbol simpleSymbol2 = Lit7;
        if ($fontColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit26), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $fontColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit9);
        simpleSymbol = Lit27;
        simpleSymbol2 = Lit7;
        if ($backgroundColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit28), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $backgroundColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit9);
        simpleSymbol = Lit29;
        simpleSymbol2 = Lit7;
        if ($backgroundColor instanceof Package) {
            $backgroundColor = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit28), " is not bound in the current context"), "Unbound Variable");
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, $backgroundColor, Lit9);
        simpleSymbol = Lit27;
        simpleSymbol2 = Lit30;
        if ($fontColor instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit26), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $fontColor;
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit9);
        simpleSymbol = Lit29;
        simpleSymbol2 = Lit30;
        if ($fontColor instanceof Package) {
            $fontColor = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit26), " is not bound in the current context"), "Unbound Variable");
        }
        return runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, $fontColor, Lit9);
    }

    public Object UserAttendances$ErrorOccurred(Object $component, Object $functionName, Object $errorNumber, Object $message) {
        runtime.sanitizeComponentData($component);
        runtime.sanitizeComponentData($functionName);
        runtime.sanitizeComponentData($errorNumber);
        runtime.sanitizeComponentData($message);
        runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit33;
        SimpleSymbol simpleSymbol2 = Lit34;
        Pair list1 = LList.list1("Lista de chamadas vazia!\nFa\u00e7a a chamada,\n caso necessite cadastrar v\u00e1 para tela de cadastro");
        LList.chain4(list1, "Opa", "Fazer chamada", "Ir para tela de Cadastro", Boolean.TRUE);
        return runtime.callComponentMethod(simpleSymbol, simpleSymbol2, list1, Lit35);
    }

    static Object lambda5() {
        return runtime.setAndCoerceProperty$Ex(Lit42, Lit7, Lit43, Lit9);
    }

    static Object lambda6() {
        return runtime.setAndCoerceProperty$Ex(Lit42, Lit7, Lit43, Lit9);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit27, Lit7, Lit46, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit27, Lit47, Boolean.TRUE, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit27, Lit48, Lit49, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit27, Lit50, Lit51, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit27, Lit52, Lit53, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit27, Lit54, Lit55, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit27, Lit56, Lit57, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit27, Lit58, "RETURN", Lit6);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit27, Lit7, Lit46, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit27, Lit47, Boolean.TRUE, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit27, Lit48, Lit49, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit27, Lit50, Lit51, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit27, Lit52, Lit53, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit27, Lit54, Lit55, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit27, Lit56, Lit57, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit27, Lit58, "RETURN", Lit6);
    }

    public Object btnReturn$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.close$Mnscreen, LList.Empty, LList.Empty, "close screen");
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit63, Lit7, Lit64, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit63, Lit52, Lit53, Lit9);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit63, Lit7, Lit64, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit63, Lit52, Lit53, Lit9);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit67, Lit68, Lit69, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit67, Lit7, Lit70, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit67, Lit54, Lit71, Lit9);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit67, Lit68, Lit69, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit67, Lit7, Lit70, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit67, Lit54, Lit71, Lit9);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit29, Lit7, Lit74, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit47, Boolean.TRUE, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit48, Lit49, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit50, Lit51, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit52, Lit53, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit54, Lit75, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit56, Lit57, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit29, Lit58, "LIST ATTENDANCES", Lit6);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit29, Lit7, Lit74, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit47, Boolean.TRUE, Lit15);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit48, Lit49, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit50, Lit51, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit52, Lit53, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit54, Lit75, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit29, Lit56, Lit57, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit29, Lit58, "LIST ATTENDANCES", Lit6);
    }

    public Object btnListarPresencas$Click() {
        Object signalRuntimeError;
        frame0 appinventor_ai_efelipecarlos_Caller_UserAttendances_frame0 = new frame0();
        runtime.setThisForm();
        Object $names = runtime.callComponentMethod(Lit77, Lit78, LList.list2("presencas", ElementType.MATCH_ANY_LOCALNAME), Lit79);
        runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list");
        runtime.setAndCoerceProperty$Ex(Lit80, Lit81, runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list"), Lit82);
        Symbol symbol = Lit3;
        if ($names instanceof Package) {
            $names = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit83), " is not bound in the current context"), "Unbound Variable");
        }
        runtime.addGlobalVarToCurrentFormEnvironment(symbol, $names);
        appinventor_ai_efelipecarlos_Caller_UserAttendances_frame0.$alunos = runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list");
        runtime.yailForEach(appinventor_ai_efelipecarlos_Caller_UserAttendances_frame0.lambda$Fn14, runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St));
        SimpleSymbol simpleSymbol = Lit80;
        SimpleSymbol simpleSymbol2 = Lit81;
        if (appinventor_ai_efelipecarlos_Caller_UserAttendances_frame0.$alunos instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit84), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = appinventor_ai_efelipecarlos_Caller_UserAttendances_frame0.$alunos;
        }
        return runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, signalRuntimeError, Lit82);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit80, Lit7, Lit94, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit52, Lit71, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit80, Lit54, Lit71, Lit9);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit80, Lit7, Lit94, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit80, Lit52, Lit71, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit80, Lit54, Lit71, Lit9);
    }

    public Object Notifier1$AfterChoosing(Object $choice) {
        Object signalRuntimeError;
        $choice = runtime.sanitizeComponentData($choice);
        runtime.setThisForm();
        ModuleMethod moduleMethod = runtime.yail$Mnequal$Qu;
        if ($choice instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit100), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $choice;
        }
        if (runtime.callYailPrimitive(moduleMethod, LList.list2(signalRuntimeError, "Fazer chamada"), Lit101, "=") != Boolean.FALSE) {
            return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Chamada"), Lit102, "open another screen");
        }
        moduleMethod = runtime.yail$Mnequal$Qu;
        if ($choice instanceof Package) {
            $choice = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit100), " is not bound in the current context"), "Unbound Variable");
        }
        return runtime.callYailPrimitive(moduleMethod, LList.list2($choice, "Ir para tela de Cadastro"), Lit103, "=") != Boolean.FALSE ? runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("Cadastrar"), Lit104, "open another screen") : Values.empty;
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
        UserAttendances = this;
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
        UserAttendances closureEnv = this;
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
