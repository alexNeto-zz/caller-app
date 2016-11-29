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
import com.google.appinventor.components.runtime.ListView;
import com.google.appinventor.components.runtime.Notifier;
import com.google.appinventor.components.runtime.Sharing;
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
import gnu.text.PrettyWriter;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;

/* compiled from: Chamada.yail */
public class Chamada extends Form implements Runnable {
    public static Chamada Chamada;
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final SimpleSymbol Lit10;
    static final IntNum Lit100;
    static final FString Lit101;
    static final SimpleSymbol Lit102;
    static final SimpleSymbol Lit103;
    static final SimpleSymbol Lit104;
    static final SimpleSymbol Lit105;
    static final SimpleSymbol Lit106;
    static final SimpleSymbol Lit107;
    static final PairWithPosition Lit108;
    static final SimpleSymbol Lit109;
    static final PairWithPosition Lit11;
    static final SimpleSymbol Lit110;
    static final SimpleSymbol Lit111;
    static final SimpleSymbol Lit112;
    static final SimpleSymbol Lit113;
    static final SimpleSymbol Lit114;
    static final FString Lit115;
    static final FString Lit116;
    static final SimpleSymbol Lit117;
    static final SimpleSymbol Lit118;
    static final FString Lit119;
    static final PairWithPosition Lit12;
    static final FString Lit120;
    static final SimpleSymbol Lit121;
    static final SimpleSymbol Lit122;
    static final SimpleSymbol Lit123;
    static final SimpleSymbol Lit124;
    static final SimpleSymbol Lit125;
    static final PairWithPosition Lit126;
    static final SimpleSymbol Lit127;
    static final SimpleSymbol Lit128;
    static final FString Lit129;
    static final PairWithPosition Lit13;
    static final SimpleSymbol Lit130;
    static final IntNum Lit131;
    static final IntNum Lit132;
    static final FString Lit133;
    static final FString Lit134;
    static final SimpleSymbol Lit135;
    static final IntNum Lit136;
    static final FString Lit137;
    static final FString Lit138;
    static final IntNum Lit139;
    static final SimpleSymbol Lit14;
    static final FString Lit140;
    static final SimpleSymbol Lit141;
    static final FString Lit142;
    static final IntNum Lit143;
    static final FString Lit144;
    static final FString Lit145;
    static final SimpleSymbol Lit146;
    static final IntNum Lit147;
    static final FString Lit148;
    static final FString Lit149;
    static final IntNum Lit15;
    static final IntNum Lit150;
    static final FString Lit151;
    static final PairWithPosition Lit152;
    static final SimpleSymbol Lit153;
    static final SimpleSymbol Lit154;
    static final IntNum Lit155;
    static final SimpleSymbol Lit156;
    static final SimpleSymbol Lit157;
    static final PairWithPosition Lit158;
    static final PairWithPosition Lit159;
    static final PairWithPosition Lit16;
    static final SimpleSymbol Lit160;
    static final PairWithPosition Lit161;
    static final SimpleSymbol Lit162;
    static final PairWithPosition Lit163;
    static final SimpleSymbol Lit164;
    static final PairWithPosition Lit165;
    static final SimpleSymbol Lit166;
    static final FString Lit167;
    static final FString Lit168;
    static final PairWithPosition Lit169;
    static final SimpleSymbol Lit17;
    static final SimpleSymbol Lit170;
    static final SimpleSymbol Lit171;
    static final PairWithPosition Lit172;
    static final PairWithPosition Lit173;
    static final PairWithPosition Lit174;
    static final PairWithPosition Lit175;
    static final PairWithPosition Lit176;
    static final SimpleSymbol Lit177;
    static final SimpleSymbol Lit178;
    static final PairWithPosition Lit179;
    static final PairWithPosition Lit18;
    static final SimpleSymbol Lit180;
    static final FString Lit181;
    static final SimpleSymbol Lit182;
    static final IntNum Lit183;
    static final FString Lit184;
    static final FString Lit185;
    static final FString Lit186;
    static final FString Lit187;
    static final FString Lit188;
    static final FString Lit189;
    static final SimpleSymbol Lit19;
    static final FString Lit190;
    static final FString Lit191;
    static final FString Lit192;
    static final SimpleSymbol Lit193;
    static final SimpleSymbol Lit194;
    static final PairWithPosition Lit195;
    static final SimpleSymbol Lit196;
    static final PairWithPosition Lit197;
    static final SimpleSymbol Lit198;
    static final SimpleSymbol Lit199;
    static final SimpleSymbol Lit2;
    static final PairWithPosition Lit20;
    static final PairWithPosition Lit200;
    static final PairWithPosition Lit201;
    static final SimpleSymbol Lit202;
    static final SimpleSymbol Lit203;
    static final FString Lit204;
    static final FString Lit205;
    static final FString Lit206;
    static final FString Lit207;
    static final SimpleSymbol Lit208;
    static final SimpleSymbol Lit209;
    static final PairWithPosition Lit21;
    static final SimpleSymbol Lit210;
    static final SimpleSymbol Lit211;
    static final SimpleSymbol Lit212;
    static final SimpleSymbol Lit213;
    static final SimpleSymbol Lit214;
    static final SimpleSymbol Lit215;
    static final SimpleSymbol Lit216;
    static final SimpleSymbol Lit217;
    static final SimpleSymbol Lit218;
    static final SimpleSymbol Lit219;
    static final SimpleSymbol Lit22;
    static final SimpleSymbol Lit220;
    static final SimpleSymbol Lit23;
    static final SimpleSymbol Lit24;
    static final IntNum Lit25;
    static final SimpleSymbol Lit26;
    static final SimpleSymbol Lit27;
    static final SimpleSymbol Lit28;
    static final SimpleSymbol Lit29;
    static final SimpleSymbol Lit3;
    static final SimpleSymbol Lit30;
    static final SimpleSymbol Lit31;
    static final SimpleSymbol Lit32;
    static final IntNum Lit33;
    static final IntNum Lit34;
    static final IntNum Lit35;
    static final PairWithPosition Lit36;
    static final PairWithPosition Lit37;
    static final IntNum Lit38;
    static final IntNum Lit39;
    static final IntNum Lit4;
    static final IntNum Lit40;
    static final PairWithPosition Lit41;
    static final PairWithPosition Lit42;
    static final SimpleSymbol Lit43;
    static final SimpleSymbol Lit44;
    static final SimpleSymbol Lit45;
    static final SimpleSymbol Lit46;
    static final SimpleSymbol Lit47;
    static final SimpleSymbol Lit48;
    static final SimpleSymbol Lit49;
    static final SimpleSymbol Lit5;
    static final SimpleSymbol Lit50;
    static final SimpleSymbol Lit51;
    static final SimpleSymbol Lit52;
    static final SimpleSymbol Lit53;
    static final PairWithPosition Lit54;
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
    static final SimpleSymbol Lit78;
    static final IntNum Lit79;
    static final IntNum Lit8;
    static final SimpleSymbol Lit80;
    static final FString Lit81;
    static final SimpleSymbol Lit82;
    static final SimpleSymbol Lit83;
    static final FString Lit84;
    static final SimpleSymbol Lit85;
    static final IntNum Lit86;
    static final FString Lit87;
    static final FString Lit88;
    static final SimpleSymbol Lit89;
    static final PairWithPosition Lit9;
    static final SimpleSymbol Lit90;
    static final IntNum Lit91;
    static final FString Lit92;
    static final FString Lit93;
    static final SimpleSymbol Lit94;
    static final IntNum Lit95;
    static final FString Lit96;
    static final FString Lit97;
    static final IntNum Lit98;
    static final IntNum Lit99;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
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
    static final ModuleMethod lambda$Fn35 = null;
    static final ModuleMethod lambda$Fn36 = null;
    static final ModuleMethod lambda$Fn37 = null;
    static final ModuleMethod lambda$Fn38 = null;
    static final ModuleMethod lambda$Fn39 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn40 = null;
    static final ModuleMethod lambda$Fn41 = null;
    static final ModuleMethod lambda$Fn42 = null;
    static final ModuleMethod lambda$Fn44 = null;
    static final ModuleMethod lambda$Fn45 = null;
    static final ModuleMethod lambda$Fn47 = null;
    static final ModuleMethod lambda$Fn48 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public BluetoothClient BluetoothClient1;
    public final ModuleMethod Chamada$Initialize;
    public Clock Clock1;
    public final ModuleMethod Clock1$Timer;
    public HorizontalArrangement HorizontalArrangement1;
    public HorizontalArrangement HorizontalArrangement2;
    public HorizontalArrangement HorizontalArrangement3;
    public HorizontalArrangement HorizontalArrangement4;
    public HorizontalArrangement HorizontalArrangement5;
    public HorizontalArrangement HorizontalArrangement6;
    public HorizontalArrangement HorizontalArrangement7;
    public Label Label1;
    public ListPicker Lista;
    public final ModuleMethod Lista$AfterPicking;
    public final ModuleMethod Lista$BeforePicking;
    public Notifier Notifier1;
    public Sharing Sharing1;
    public TinyDB TinyDB1;
    public TinyWebDB TinyWebDB1;
    public VerticalArrangement VerticalArrangement1;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public Button btnRestartAttendance;
    public final ModuleMethod btnRestartAttendance$Click;
    public Button btnReturn;
    public final ModuleMethod btnReturn$Click;
    public Button btnSharing;
    public final ModuleMethod btnSharing$Click;
    public Button btnSubmit;
    public final ModuleMethod btnSubmit$Click;
    public Button btndesligaChamada;
    public final ModuleMethod btndesligaChamada$Click;
    public Button btnligarChamada;
    public final ModuleMethod btnligarChamada$Click;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public ListView listaChamada;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    /* compiled from: Chamada.yail */
    public class frame0 extends ModuleBody {
        Object $rfid;
        final ModuleMethod lambda$Fn5;

        public frame0() {
            this.lambda$Fn5 = new ModuleMethod(this, 1, null, 4097);
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            return moduleMethod.selector == 1 ? lambda6(obj) : super.apply1(moduleMethod, obj);
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

        Object lambda6(Object $cartaoAluno) {
            Object signalRuntimeError;
            ModuleMethod moduleMethod = runtime.yail$Mnequal$Qu;
            ModuleMethod moduleMethod2 = runtime.yail$Mnlist$Mnget$Mnitem;
            if ($cartaoAluno instanceof Package) {
                signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Chamada.Lit7), " is not bound in the current context"), "Unbound Variable");
            } else {
                signalRuntimeError = $cartaoAluno;
            }
            Object callYailPrimitive = runtime.callYailPrimitive(moduleMethod2, LList.list2(signalRuntimeError, Chamada.Lit8), Chamada.Lit9, "select list item");
            if (this.$rfid instanceof Package) {
                signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Chamada.Lit10), " is not bound in the current context"), "Unbound Variable");
            } else {
                signalRuntimeError = this.$rfid;
            }
            if (runtime.callYailPrimitive(moduleMethod, LList.list2(callYailPrimitive, signalRuntimeError), Chamada.Lit11, "=") == Boolean.FALSE) {
                return Values.empty;
            }
            Symbol symbol = Chamada.Lit3;
            if ($cartaoAluno instanceof Package) {
                $cartaoAluno = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Chamada.Lit7), " is not bound in the current context"), "Unbound Variable");
            }
            return runtime.addGlobalVarToCurrentFormEnvironment(symbol, $cartaoAluno);
        }
    }

    /* compiled from: Chamada.yail */
    public class frame1 extends ModuleBody {
        Object $rfid;
        final ModuleMethod lambda$Fn8;

        public frame1() {
            this.lambda$Fn8 = new ModuleMethod(this, 2, null, 4097);
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            return moduleMethod.selector == 2 ? lambda9(obj) : super.apply1(moduleMethod, obj);
        }

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            if (moduleMethod.selector != 2) {
                return super.match1(moduleMethod, obj, callContext);
            }
            callContext.value1 = obj;
            callContext.proc = moduleMethod;
            callContext.pc = 1;
            return 0;
        }

        Object lambda9(Object $cartaoAluno) {
            Object signalRuntimeError;
            ModuleMethod moduleMethod = runtime.yail$Mnequal$Qu;
            ModuleMethod moduleMethod2 = runtime.yail$Mnlist$Mnget$Mnitem;
            if ($cartaoAluno instanceof Package) {
                signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Chamada.Lit7), " is not bound in the current context"), "Unbound Variable");
            } else {
                signalRuntimeError = $cartaoAluno;
            }
            Object callYailPrimitive = runtime.callYailPrimitive(moduleMethod2, LList.list2(signalRuntimeError, Chamada.Lit8), Chamada.Lit12, "select list item");
            if (this.$rfid instanceof Package) {
                signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Chamada.Lit10), " is not bound in the current context"), "Unbound Variable");
            } else {
                signalRuntimeError = this.$rfid;
            }
            if (runtime.callYailPrimitive(moduleMethod, LList.list2(callYailPrimitive, signalRuntimeError), Chamada.Lit13, "=") == Boolean.FALSE) {
                return Values.empty;
            }
            Symbol symbol = Chamada.Lit3;
            if ($cartaoAluno instanceof Package) {
                $cartaoAluno = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Chamada.Lit7), " is not bound in the current context"), "Unbound Variable");
            }
            return runtime.addGlobalVarToCurrentFormEnvironment(symbol, $cartaoAluno);
        }
    }

    /* compiled from: Chamada.yail */
    public class frame2 extends ModuleBody {
        Object $alunoEncontrado;
        Object $nomeAluno;
        final ModuleMethod lambda$Fn10;

        public frame2() {
            this.lambda$Fn10 = new ModuleMethod(this, 3, null, 4097);
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            if (moduleMethod.selector != 3) {
                return super.apply1(moduleMethod, obj);
            }
            lambda11(obj);
            return Values.empty;
        }

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            if (moduleMethod.selector != 3) {
                return super.match1(moduleMethod, obj, callContext);
            }
            callContext.value1 = obj;
            callContext.proc = moduleMethod;
            callContext.pc = 1;
            return 0;
        }

        void lambda11(Object $cartaoAluno) {
            Object signalRuntimeError;
            ModuleMethod moduleMethod = runtime.yail$Mnequal$Qu;
            ModuleMethod moduleMethod2 = runtime.yail$Mnlist$Mnget$Mnitem;
            if ($cartaoAluno instanceof Package) {
                signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Chamada.Lit7), " is not bound in the current context"), "Unbound Variable");
            } else {
                signalRuntimeError = $cartaoAluno;
            }
            Object callYailPrimitive = runtime.callYailPrimitive(moduleMethod2, LList.list2(signalRuntimeError, Chamada.Lit15), Chamada.Lit16, "select list item");
            if (this.$nomeAluno instanceof Package) {
                signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Chamada.Lit17), " is not bound in the current context"), "Unbound Variable");
            } else {
                signalRuntimeError = this.$nomeAluno;
            }
            if (runtime.callYailPrimitive(moduleMethod, LList.list2(callYailPrimitive, signalRuntimeError), Chamada.Lit18, "=") != Boolean.FALSE) {
                if ($cartaoAluno instanceof Package) {
                    $cartaoAluno = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Chamada.Lit7), " is not bound in the current context"), "Unbound Variable");
                }
                this.$alunoEncontrado = $cartaoAluno;
            }
        }
    }

    /* compiled from: Chamada.yail */
    public class frame3 extends ModuleBody {
        Object $alunoEncontrado;
        Object $nomeAluno;
        final ModuleMethod lambda$Fn13;

        public frame3() {
            this.lambda$Fn13 = new ModuleMethod(this, 4, null, 4097);
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            if (moduleMethod.selector != 4) {
                return super.apply1(moduleMethod, obj);
            }
            lambda14(obj);
            return Values.empty;
        }

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            if (moduleMethod.selector != 4) {
                return super.match1(moduleMethod, obj, callContext);
            }
            callContext.value1 = obj;
            callContext.proc = moduleMethod;
            callContext.pc = 1;
            return 0;
        }

        void lambda14(Object $cartaoAluno) {
            Object signalRuntimeError;
            ModuleMethod moduleMethod = runtime.yail$Mnequal$Qu;
            ModuleMethod moduleMethod2 = runtime.yail$Mnlist$Mnget$Mnitem;
            if ($cartaoAluno instanceof Package) {
                signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Chamada.Lit7), " is not bound in the current context"), "Unbound Variable");
            } else {
                signalRuntimeError = $cartaoAluno;
            }
            Object callYailPrimitive = runtime.callYailPrimitive(moduleMethod2, LList.list2(signalRuntimeError, Chamada.Lit15), Chamada.Lit20, "select list item");
            if (this.$nomeAluno instanceof Package) {
                signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Chamada.Lit17), " is not bound in the current context"), "Unbound Variable");
            } else {
                signalRuntimeError = this.$nomeAluno;
            }
            if (runtime.callYailPrimitive(moduleMethod, LList.list2(callYailPrimitive, signalRuntimeError), Chamada.Lit21, "=") != Boolean.FALSE) {
                if ($cartaoAluno instanceof Package) {
                    $cartaoAluno = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Chamada.Lit7), " is not bound in the current context"), "Unbound Variable");
                }
                this.$alunoEncontrado = $cartaoAluno;
            }
        }
    }

    /* compiled from: Chamada.yail */
    public class frame4 extends ModuleBody {
        Object $presencasCadastradas;
        final ModuleMethod lambda$Fn43;

        public frame4() {
            this.lambda$Fn43 = new ModuleMethod(this, 5, null, 4097);
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            return moduleMethod.selector == 5 ? lambda44(obj) : super.apply1(moduleMethod, obj);
        }

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            if (moduleMethod.selector != 5) {
                return super.match1(moduleMethod, obj, callContext);
            }
            callContext.value1 = obj;
            callContext.proc = moduleMethod;
            callContext.pc = 1;
            return 0;
        }

        Object lambda44(Object $item) {
            Object signalRuntimeError;
            Object signalRuntimeError2;
            Procedure procedure = Scheme.applyToArgs;
            Object lookupGlobalVarInCurrentFormEnvironment = runtime.lookupGlobalVarInCurrentFormEnvironment(Chamada.Lit14, runtime.$Stthe$Mnnull$Mnvalue$St);
            if ($item instanceof Package) {
                $item = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Chamada.Lit153), " is not bound in the current context"), "Unbound Variable");
            }
            Object $objAluno = procedure.apply2(lookupGlobalVarInCurrentFormEnvironment, $item);
            ModuleMethod moduleMethod = runtime.yail$Mnlist$Mninsert$Mnitem$Ex;
            if ($objAluno instanceof Package) {
                signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Chamada.Lit154), " is not bound in the current context"), "Unbound Variable");
            } else {
                signalRuntimeError = $objAluno;
            }
            runtime.callYailPrimitive(moduleMethod, LList.list3(signalRuntimeError, Chamada.Lit155, runtime.callComponentMethod(Chamada.Lit104, Chamada.Lit156, LList.list2(runtime.callComponentMethod(Chamada.Lit104, Chamada.Lit157, LList.Empty, LList.Empty), "hh:mm - dd/MM/yyyy"), Chamada.Lit158)), Chamada.Lit159, "insert list item");
            ModuleMethod moduleMethod2 = runtime.yail$Mnlist$Mnadd$Mnto$Mnlist$Ex;
            if (this.$presencasCadastradas instanceof Package) {
                signalRuntimeError2 = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Chamada.Lit160), " is not bound in the current context"), "Unbound Variable");
            } else {
                signalRuntimeError2 = this.$presencasCadastradas;
            }
            if ($objAluno instanceof Package) {
                $objAluno = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Chamada.Lit154), " is not bound in the current context"), "Unbound Variable");
            }
            return runtime.callYailPrimitive(moduleMethod2, LList.list2(signalRuntimeError2, $objAluno), Chamada.Lit161, "add items to list");
        }
    }

    /* compiled from: Chamada.yail */
    public class frame5 extends ModuleBody {
        Object $alunos;
        final ModuleMethod lambda$Fn46;

        public frame5() {
            this.lambda$Fn46 = new ModuleMethod(this, 6, null, 4097);
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            return moduleMethod.selector == 6 ? lambda47(obj) : super.apply1(moduleMethod, obj);
        }

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            if (moduleMethod.selector != 6) {
                return super.match1(moduleMethod, obj, callContext);
            }
            callContext.value1 = obj;
            callContext.proc = moduleMethod;
            callContext.pc = 1;
            return 0;
        }

        Object lambda47(Object $aluno) {
            Object signalRuntimeError;
            Object signalRuntimeError2;
            ModuleMethod moduleMethod = runtime.yail$Mnlist$Mnadd$Mnto$Mnlist$Ex;
            if (this.$alunos instanceof Package) {
                signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Chamada.Lit170), " is not bound in the current context"), "Unbound Variable");
            } else {
                signalRuntimeError = this.$alunos;
            }
            ModuleMethod moduleMethod2 = strings.string$Mnappend;
            Pair list1 = LList.list1("RA:");
            ModuleMethod moduleMethod3 = runtime.yail$Mnlist$Mnget$Mnitem;
            if ($aluno instanceof Package) {
                signalRuntimeError2 = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Chamada.Lit171), " is not bound in the current context"), "Unbound Variable");
            } else {
                signalRuntimeError2 = $aluno;
            }
            Object callYailPrimitive = runtime.callYailPrimitive(moduleMethod3, LList.list2(signalRuntimeError2, Chamada.Lit79), Chamada.Lit172, "select list item");
            String str = "              Nome:";
            ModuleMethod moduleMethod4 = runtime.yail$Mnlist$Mnget$Mnitem;
            if ($aluno instanceof Package) {
                signalRuntimeError2 = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Chamada.Lit171), " is not bound in the current context"), "Unbound Variable");
            } else {
                signalRuntimeError2 = $aluno;
            }
            Pair chain4 = LList.chain4(list1, callYailPrimitive, str, runtime.callYailPrimitive(moduleMethod4, LList.list2(signalRuntimeError2, Chamada.Lit15), Chamada.Lit173, "select list item"), "              Data:");
            ModuleMethod moduleMethod5 = runtime.yail$Mnlist$Mnget$Mnitem;
            if ($aluno instanceof Package) {
                $aluno = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Chamada.Lit171), " is not bound in the current context"), "Unbound Variable");
            }
            LList.chain1(chain4, runtime.callYailPrimitive(moduleMethod5, LList.list2($aluno, Chamada.Lit155), Chamada.Lit174, "select list item"));
            return runtime.callYailPrimitive(moduleMethod, LList.list2(signalRuntimeError, runtime.callYailPrimitive(moduleMethod2, list1, Chamada.Lit175, "join")), Chamada.Lit176, "add items to list");
        }
    }

    /* compiled from: Chamada.yail */
    public class frame extends ModuleBody {
        Chamada $main;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case ArithOp.QUOTIENT_EXACT /*7*/:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case ArithOp.ASHIFT_GENERAL /*9*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case ArithOp.ASHIFT_RIGHT /*11*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case SetExp.PROCEDURE /*16*/:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case Sequence.INT_U8_VALUE /*17*/:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case Sequence.INT_S8_VALUE /*18*/:
                    if (!(obj instanceof Chamada)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case Sequence.FLOAT_VALUE /*25*/:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case Sequence.DOUBLE_VALUE /*26*/:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case Sequence.TEXT_BYTE_VALUE /*28*/:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case Sequence.CHAR_VALUE /*29*/:
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
                case SetExp.PREFER_BINDING2 /*8*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case ArithOp.ASHIFT_GENERAL /*9*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case ArithOp.LSHIFT_RIGHT /*12*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case ArithOp.AND /*13*/:
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
                case Sequence.INT_S16_VALUE /*20*/:
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
                case ArithOp.IOR /*14*/:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case Sequence.INT_U16_VALUE /*19*/:
                    if (!(obj instanceof Chamada)) {
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

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            switch (moduleMethod.selector) {
                case ArithOp.IOR /*14*/:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case Sequence.INT_U16_VALUE /*19*/:
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
                case SetExp.PREFER_BINDING2 /*8*/:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case ArithOp.ASHIFT_GENERAL /*9*/:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case ArithOp.LSHIFT_RIGHT /*12*/:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e22) {
                        throw new WrongType(e22, "add-to-global-var-environment", 1, obj);
                    }
                case ArithOp.AND /*13*/:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case ArithOp.XOR /*15*/:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case Sequence.INT_S16_VALUE /*20*/:
                    return this.$main.lookupHandler(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case Sequence.INT_U32_VALUE /*21*/:
                    return Chamada.lambda2();
                case Sequence.INT_S32_VALUE /*22*/:
                    this.$main.$define();
                    return Values.empty;
                case Sequence.INT_U64_VALUE /*23*/:
                    return Chamada.lambda3();
                case Sequence.INT_S64_VALUE /*24*/:
                    return Chamada.lambda4();
                case Sequence.BOOLEAN_VALUE /*27*/:
                    return Chamada.lambda7();
                case XDataType.DAY_TIME_DURATION_TYPE_CODE /*30*/:
                    return Chamada.lambda12();
                case Sequence.CDATA_VALUE /*31*/:
                    return Chamada.lambda15();
                case SetExp.SET_IF_UNBOUND /*32*/:
                    return this.$main.Chamada$Initialize();
                case Sequence.ELEMENT_VALUE /*33*/:
                    return Chamada.lambda16();
                case Sequence.DOCUMENT_VALUE /*34*/:
                    return Chamada.lambda17();
                case Sequence.ATTRIBUTE_VALUE /*35*/:
                    return Chamada.lambda18();
                case Sequence.COMMENT_VALUE /*36*/:
                    return Chamada.lambda19();
                case Sequence.PROCESSING_INSTRUCTION_VALUE /*37*/:
                    return this.$main.btnReturn$Click();
                case XDataType.STRING_TYPE_CODE /*38*/:
                    return Chamada.lambda20();
                case XDataType.NORMALIZED_STRING_TYPE_CODE /*39*/:
                    return Chamada.lambda21();
                case XDataType.TOKEN_TYPE_CODE /*40*/:
                    return Chamada.lambda22();
                case XDataType.LANGUAGE_TYPE_CODE /*41*/:
                    return Chamada.lambda23();
                case XDataType.NMTOKEN_TYPE_CODE /*42*/:
                    return Chamada.lambda24();
                case XDataType.NAME_TYPE_CODE /*43*/:
                    return Chamada.lambda25();
                case XDataType.NCNAME_TYPE_CODE /*44*/:
                    return Chamada.lambda26();
                case XDataType.ID_TYPE_CODE /*45*/:
                    return Chamada.lambda27();
                case XDataType.IDREF_TYPE_CODE /*46*/:
                    return this.$main.btnligarChamada$Click();
                case XDataType.ENTITY_TYPE_CODE /*47*/:
                    return Chamada.lambda28();
                case XDataType.UNTYPED_TYPE_CODE /*48*/:
                    return Chamada.lambda29();
                case 49:
                    return this.$main.btndesligaChamada$Click();
                case 50:
                    return Chamada.lambda30();
                case 51:
                    return Chamada.lambda31();
                case 52:
                    return this.$main.Lista$BeforePicking();
                case 53:
                    return this.$main.Lista$AfterPicking();
                case 54:
                    return Chamada.lambda32();
                case 55:
                    return Chamada.lambda33();
                case 56:
                    return Chamada.lambda34();
                case 57:
                    return Chamada.lambda35();
                case 58:
                    return Chamada.lambda36();
                case 59:
                    return Chamada.lambda37();
                case 60:
                    return this.$main.btnRestartAttendance$Click();
                case 61:
                    return Chamada.lambda38();
                case 62:
                    return Chamada.lambda39();
                case 63:
                    return Chamada.lambda40();
                case SetExp.HAS_VALUE /*64*/:
                    return Chamada.lambda41();
                case 65:
                    return Chamada.lambda42();
                case 66:
                    return Chamada.lambda43();
                case 67:
                    return this.$main.btnSubmit$Click();
                case 68:
                    return Chamada.lambda45();
                case 69:
                    return Chamada.lambda46();
                case PrettyWriter.NEWLINE_FILL /*70*/:
                    return this.$main.btnSharing$Click();
                case 71:
                    return Chamada.lambda48();
                case 72:
                    return Chamada.lambda49();
                case 73:
                    return this.$main.Clock1$Timer();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
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
                case Sequence.BOOLEAN_VALUE /*27*/:
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
                case 57:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 58:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 59:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 60:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 61:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 62:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 63:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case SetExp.HAS_VALUE /*64*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 65:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 66:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 67:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 68:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 69:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case PrettyWriter.NEWLINE_FILL /*70*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 71:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 72:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 73:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case ArithOp.QUOTIENT_EXACT /*7*/:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case ArithOp.ASHIFT_GENERAL /*9*/:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "lookup-in-form-environment", 1, obj);
                    }
                case ArithOp.ASHIFT_RIGHT /*11*/:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "is-bound-in-form-environment", 1, obj);
                    }
                case SetExp.PROCEDURE /*16*/:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case Sequence.INT_U8_VALUE /*17*/:
                    this.$main.sendError(obj);
                    return Values.empty;
                case Sequence.INT_S8_VALUE /*18*/:
                    this.$main.processException(obj);
                    return Values.empty;
                case Sequence.FLOAT_VALUE /*25*/:
                    return Chamada.lambda5(obj);
                case Sequence.DOUBLE_VALUE /*26*/:
                    return Chamada.lambda8(obj);
                case Sequence.TEXT_BYTE_VALUE /*28*/:
                    return Chamada.lambda10(obj);
                case Sequence.CHAR_VALUE /*29*/:
                    return Chamada.lambda13(obj);
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }
    }

    static {
        Lit220 = (SimpleSymbol) new SimpleSymbol("any").readResolve();
        Lit219 = (SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve();
        Lit218 = (SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve();
        Lit217 = (SimpleSymbol) new SimpleSymbol("send-error").readResolve();
        Lit216 = (SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve();
        Lit215 = (SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve();
        Lit214 = (SimpleSymbol) new SimpleSymbol("add-to-components").readResolve();
        Lit213 = (SimpleSymbol) new SimpleSymbol("add-to-events").readResolve();
        Lit212 = (SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve();
        Lit211 = (SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve();
        Lit210 = (SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve();
        Lit209 = (SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve();
        Lit208 = (SimpleSymbol) new SimpleSymbol("android-log-form").readResolve();
        Lit207 = new FString("com.google.appinventor.components.runtime.Sharing");
        Lit206 = new FString("com.google.appinventor.components.runtime.Sharing");
        Lit205 = new FString("com.google.appinventor.components.runtime.TinyWebDB");
        Lit204 = new FString("com.google.appinventor.components.runtime.TinyWebDB");
        Lit203 = (SimpleSymbol) new SimpleSymbol("Timer").readResolve();
        Lit202 = (SimpleSymbol) new SimpleSymbol("Clock1$Timer").readResolve();
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol("list").readResolve();
        Lit111 = simpleSymbol;
        Lit201 = PairWithPosition.make(simpleSymbol, PairWithPosition.make(Lit220, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 1217499), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 1217493);
        SimpleSymbol simpleSymbol2 = Lit111;
        simpleSymbol = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit26 = simpleSymbol;
        Lit200 = PairWithPosition.make(simpleSymbol2, PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 1217462), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 1217456);
        Lit199 = (SimpleSymbol) new SimpleSymbol("$alunosNaLista").readResolve();
        Lit198 = (SimpleSymbol) new SimpleSymbol("$ParameterByte").readResolve();
        Lit197 = PairWithPosition.make(Lit26, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 1217113);
        Lit196 = (SimpleSymbol) new SimpleSymbol("ReceiveText").readResolve();
        Lit195 = PairWithPosition.make(Lit26, PairWithPosition.make(Lit26, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 1216775), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 1216767);
        Lit194 = (SimpleSymbol) new SimpleSymbol("BytesAvailableToReceive").readResolve();
        Lit193 = (SimpleSymbol) new SimpleSymbol("IsConnected").readResolve();
        Lit192 = new FString("com.google.appinventor.components.runtime.Clock");
        Lit191 = new FString("com.google.appinventor.components.runtime.Clock");
        Lit190 = new FString("com.google.appinventor.components.runtime.Notifier");
        Lit189 = new FString("com.google.appinventor.components.runtime.Notifier");
        Lit188 = new FString("com.google.appinventor.components.runtime.BluetoothClient");
        Lit187 = new FString("com.google.appinventor.components.runtime.BluetoothClient");
        Lit186 = new FString("com.google.appinventor.components.runtime.TinyDB");
        Lit185 = new FString("com.google.appinventor.components.runtime.TinyDB");
        Lit184 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit183 = IntNum.make((int) Component.COLOR_NONE);
        Lit182 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement7").readResolve();
        Lit181 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit180 = (SimpleSymbol) new SimpleSymbol("btnSharing$Click").readResolve();
        simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit23 = simpleSymbol;
        Lit179 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 1090667);
        Lit178 = (SimpleSymbol) new SimpleSymbol("ShareMessage").readResolve();
        Lit177 = (SimpleSymbol) new SimpleSymbol("Sharing1").readResolve();
        Lit176 = PairWithPosition.make(Lit111, PairWithPosition.make(Lit220, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 1090527), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 1090521);
        Lit175 = PairWithPosition.make(Lit23, PairWithPosition.make(Lit23, PairWithPosition.make(Lit23, PairWithPosition.make(Lit23, PairWithPosition.make(Lit23, PairWithPosition.make(Lit23, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 1090503), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 1090498), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 1090493), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 1090488), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 1090483), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 1090477);
        Lit174 = PairWithPosition.make(Lit111, PairWithPosition.make(Lit26, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 1090446), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 1090440);
        Lit173 = PairWithPosition.make(Lit111, PairWithPosition.make(Lit26, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 1090303), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 1090297);
        Lit172 = PairWithPosition.make(Lit111, PairWithPosition.make(Lit26, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 1090160), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 1090154);
        Lit171 = (SimpleSymbol) new SimpleSymbol("$aluno").readResolve();
        Lit170 = (SimpleSymbol) new SimpleSymbol("$alunos").readResolve();
        Lit169 = PairWithPosition.make(Lit23, PairWithPosition.make(Lit220, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 1089642), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 1089636);
        Lit168 = new FString("com.google.appinventor.components.runtime.Button");
        Lit167 = new FString("com.google.appinventor.components.runtime.Button");
        Lit166 = (SimpleSymbol) new SimpleSymbol("btnSubmit$Click").readResolve();
        Lit165 = PairWithPosition.make(Lit23, PairWithPosition.make(Lit220, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 996393), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 996387);
        Lit164 = (SimpleSymbol) new SimpleSymbol("TinyWebDB1").readResolve();
        Lit163 = PairWithPosition.make(Lit23, PairWithPosition.make(Lit220, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 996259), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 996253);
        Lit162 = (SimpleSymbol) new SimpleSymbol("StoreValue").readResolve();
        Lit161 = PairWithPosition.make(Lit111, PairWithPosition.make(Lit220, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 996067), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 996061);
        Lit160 = (SimpleSymbol) new SimpleSymbol("$presencasCadastradas").readResolve();
        Lit159 = PairWithPosition.make(Lit111, PairWithPosition.make(Lit26, PairWithPosition.make(Lit220, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 995906), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 995899), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 995893);
        Lit158 = PairWithPosition.make((SimpleSymbol) new SimpleSymbol("InstantInTime").readResolve(), PairWithPosition.make(Lit23, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 995884), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 995869);
        Lit157 = (SimpleSymbol) new SimpleSymbol("Now").readResolve();
        Lit156 = (SimpleSymbol) new SimpleSymbol("FormatDate").readResolve();
        Lit155 = IntNum.make(4);
        Lit154 = (SimpleSymbol) new SimpleSymbol("$objAluno").readResolve();
        Lit153 = (SimpleSymbol) new SimpleSymbol("$item").readResolve();
        Lit152 = PairWithPosition.make(Lit23, PairWithPosition.make(Lit220, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 995523), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 995517);
        Lit151 = new FString("com.google.appinventor.components.runtime.Button");
        int[] iArr = new int[2];
        iArr[0] = Component.COLOR_PINK;
        Lit150 = IntNum.make(iArr);
        Lit149 = new FString("com.google.appinventor.components.runtime.Button");
        Lit148 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit147 = IntNum.make((int) Component.COLOR_NONE);
        Lit146 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement3").readResolve();
        Lit145 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit144 = new FString("com.google.appinventor.components.runtime.ListView");
        Lit143 = IntNum.make((int) Component.COLOR_NONE);
        Lit142 = new FString("com.google.appinventor.components.runtime.ListView");
        Lit141 = (SimpleSymbol) new SimpleSymbol("btnRestartAttendance$Click").readResolve();
        Lit140 = new FString("com.google.appinventor.components.runtime.Button");
        iArr = new int[2];
        iArr[0] = Component.COLOR_PINK;
        Lit139 = IntNum.make(iArr);
        Lit138 = new FString("com.google.appinventor.components.runtime.Button");
        Lit137 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit136 = IntNum.make((int) Component.COLOR_NONE);
        Lit135 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve();
        Lit134 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit133 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit132 = IntNum.make(16);
        Lit131 = IntNum.make((int) Component.COLOR_NONE);
        Lit130 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement6").readResolve();
        Lit129 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit128 = (SimpleSymbol) new SimpleSymbol("AfterPicking").readResolve();
        Lit127 = (SimpleSymbol) new SimpleSymbol("Lista$AfterPicking").readResolve();
        Lit126 = PairWithPosition.make(Lit23, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 643186);
        Lit125 = (SimpleSymbol) new SimpleSymbol("Selection").readResolve();
        Lit124 = (SimpleSymbol) new SimpleSymbol("Connect").readResolve();
        Lit123 = (SimpleSymbol) new SimpleSymbol("BeforePicking").readResolve();
        Lit122 = (SimpleSymbol) new SimpleSymbol("Lista$BeforePicking").readResolve();
        Lit121 = (SimpleSymbol) new SimpleSymbol("AddressesAndNames").readResolve();
        Lit120 = new FString("com.google.appinventor.components.runtime.ListPicker");
        Lit119 = new FString("com.google.appinventor.components.runtime.ListPicker");
        Lit118 = (SimpleSymbol) new SimpleSymbol("btndesligaChamada$Click").readResolve();
        Lit117 = (SimpleSymbol) new SimpleSymbol("Disconnect").readResolve();
        Lit116 = new FString("com.google.appinventor.components.runtime.Button");
        Lit115 = new FString("com.google.appinventor.components.runtime.Button");
        Lit114 = (SimpleSymbol) new SimpleSymbol("btnligarChamada$Click").readResolve();
        Lit113 = (SimpleSymbol) new SimpleSymbol("Visible").readResolve();
        Lit112 = (SimpleSymbol) new SimpleSymbol("$names").readResolve();
        Lit110 = (SimpleSymbol) new SimpleSymbol("Elements").readResolve();
        Lit109 = (SimpleSymbol) new SimpleSymbol("listaChamada").readResolve();
        Lit108 = PairWithPosition.make(Lit23, PairWithPosition.make(Lit220, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 495839), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 495833);
        Lit107 = (SimpleSymbol) new SimpleSymbol("GetValue").readResolve();
        Lit106 = (SimpleSymbol) new SimpleSymbol("TinyDB1").readResolve();
        Lit105 = (SimpleSymbol) new SimpleSymbol("TimerEnabled").readResolve();
        Lit104 = (SimpleSymbol) new SimpleSymbol("Clock1").readResolve();
        Lit103 = (SimpleSymbol) new SimpleSymbol("Open").readResolve();
        Lit102 = (SimpleSymbol) new SimpleSymbol("Lista").readResolve();
        Lit101 = new FString("com.google.appinventor.components.runtime.Button");
        iArr = new int[2];
        iArr[0] = -1;
        Lit100 = IntNum.make(iArr);
        Lit99 = IntNum.make(154);
        iArr = new int[2];
        iArr[0] = Component.COLOR_PINK;
        Lit98 = IntNum.make(iArr);
        Lit97 = new FString("com.google.appinventor.components.runtime.Button");
        Lit96 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit95 = IntNum.make((int) Component.COLOR_NONE);
        Lit94 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve();
        Lit93 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit92 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit91 = IntNum.make((int) Component.COLOR_NONE);
        Lit90 = (SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve();
        Lit89 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve();
        Lit88 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit87 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit86 = IntNum.make((int) Component.COLOR_NONE);
        Lit85 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement5").readResolve();
        Lit84 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit83 = (SimpleSymbol) new SimpleSymbol("Click").readResolve();
        Lit82 = (SimpleSymbol) new SimpleSymbol("btnReturn$Click").readResolve();
        Lit81 = new FString("com.google.appinventor.components.runtime.Button");
        Lit80 = (SimpleSymbol) new SimpleSymbol("Text").readResolve();
        Lit79 = IntNum.make(2);
        Lit78 = (SimpleSymbol) new SimpleSymbol("Shape").readResolve();
        Lit77 = IntNum.make((int) DateTime.TIMEZONE_MASK);
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
        Lit64 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement4").readResolve();
        Lit63 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit62 = new FString("com.google.appinventor.components.runtime.Label");
        Lit61 = (SimpleSymbol) new SimpleSymbol("Label1").readResolve();
        Lit60 = new FString("com.google.appinventor.components.runtime.Label");
        Lit59 = (SimpleSymbol) new SimpleSymbol("Initialize").readResolve();
        Lit58 = (SimpleSymbol) new SimpleSymbol("Chamada$Initialize").readResolve();
        Lit57 = PairWithPosition.make(Lit23, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 100159);
        Lit56 = (SimpleSymbol) new SimpleSymbol("ShowAlert").readResolve();
        Lit55 = (SimpleSymbol) new SimpleSymbol("Notifier1").readResolve();
        simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve();
        Lit32 = simpleSymbol;
        Lit54 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 100010);
        Lit53 = (SimpleSymbol) new SimpleSymbol("Enabled").readResolve();
        Lit52 = (SimpleSymbol) new SimpleSymbol("BluetoothClient1").readResolve();
        Lit51 = (SimpleSymbol) new SimpleSymbol("TextColor").readResolve();
        Lit50 = (SimpleSymbol) new SimpleSymbol("btnSharing").readResolve();
        Lit49 = (SimpleSymbol) new SimpleSymbol("btnSubmit").readResolve();
        Lit48 = (SimpleSymbol) new SimpleSymbol("btnRestartAttendance").readResolve();
        Lit47 = (SimpleSymbol) new SimpleSymbol("btndesligaChamada").readResolve();
        Lit46 = (SimpleSymbol) new SimpleSymbol("btnligarChamada").readResolve();
        Lit45 = (SimpleSymbol) new SimpleSymbol("$backgroundColor").readResolve();
        Lit44 = (SimpleSymbol) new SimpleSymbol("btnReturn").readResolve();
        Lit43 = (SimpleSymbol) new SimpleSymbol("$fontColor").readResolve();
        Lit42 = PairWithPosition.make(Lit111, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 98676);
        Lit41 = PairWithPosition.make(Lit220, PairWithPosition.make(Lit220, PairWithPosition.make(Lit220, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 98653), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 98649), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 98644);
        Lit40 = IntNum.make(229);
        Lit39 = IntNum.make(246);
        Lit38 = IntNum.make(239);
        Lit37 = PairWithPosition.make(Lit111, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 98487);
        Lit36 = PairWithPosition.make(Lit220, PairWithPosition.make(Lit220, PairWithPosition.make(Lit220, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 98464), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 98460), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 98455);
        Lit35 = IntNum.make(45);
        Lit34 = IntNum.make(168);
        Lit33 = IntNum.make(91);
        Lit31 = (SimpleSymbol) new SimpleSymbol("TitleVisible").readResolve();
        Lit30 = (SimpleSymbol) new SimpleSymbol("Title").readResolve();
        Lit29 = (SimpleSymbol) new SimpleSymbol("Sizing").readResolve();
        Lit28 = (SimpleSymbol) new SimpleSymbol("OpenScreenAnimation").readResolve();
        Lit27 = (SimpleSymbol) new SimpleSymbol("CloseScreenAnimation").readResolve();
        iArr = new int[2];
        iArr[0] = Component.COLOR_LTGRAY;
        Lit25 = IntNum.make(iArr);
        Lit24 = (SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve();
        Lit22 = (SimpleSymbol) new SimpleSymbol("AppName").readResolve();
        Lit21 = PairWithPosition.make(Lit220, PairWithPosition.make(Lit220, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 45375), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 45370);
        Lit20 = PairWithPosition.make(Lit111, PairWithPosition.make(Lit26, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 45313), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 45307);
        Lit19 = (SimpleSymbol) new SimpleSymbol("$alunoEncontrado").readResolve();
        Lit18 = PairWithPosition.make(Lit220, PairWithPosition.make(Lit220, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 45375), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 45370);
        Lit17 = (SimpleSymbol) new SimpleSymbol("$nomeAluno").readResolve();
        Lit16 = PairWithPosition.make(Lit111, PairWithPosition.make(Lit26, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 45313), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 45307);
        Lit15 = IntNum.make(3);
        Lit14 = (SimpleSymbol) new SimpleSymbol("p$getAluno").readResolve();
        Lit13 = PairWithPosition.make(Lit220, PairWithPosition.make(Lit220, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 41280), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 41275);
        Lit12 = PairWithPosition.make(Lit111, PairWithPosition.make(Lit26, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 41223), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 41217);
        Lit11 = PairWithPosition.make(Lit220, PairWithPosition.make(Lit220, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 41280), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 41275);
        Lit10 = (SimpleSymbol) new SimpleSymbol("$rfid").readResolve();
        Lit9 = PairWithPosition.make(Lit111, PairWithPosition.make(Lit26, LList.Empty, "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 41223), "/tmp/1480424935890_0.5741515729244012-0/youngandroidproject/../src/appinventor/ai_efelipecarlos/Caller/Chamada.yail", 41217);
        Lit8 = IntNum.make(1);
        Lit7 = (SimpleSymbol) new SimpleSymbol("$cartaoAluno").readResolve();
        Lit6 = (SimpleSymbol) new SimpleSymbol("p$isCartaoCadastrado").readResolve();
        Lit5 = (SimpleSymbol) new SimpleSymbol("g$alunos").readResolve();
        Lit4 = IntNum.make(0);
        Lit3 = (SimpleSymbol) new SimpleSymbol("g$cartaoEncontrado").readResolve();
        Lit2 = (SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve();
        Lit1 = (SimpleSymbol) new SimpleSymbol("getMessage").readResolve();
        Lit0 = (SimpleSymbol) new SimpleSymbol("Chamada").readResolve();
    }

    public Chamada() {
        ModuleInfo.register(this);
        ModuleBody appinventor_ai_efelipecarlos_Caller_Chamada_frame = new frame();
        appinventor_ai_efelipecarlos_Caller_Chamada_frame.$main = this;
        this.android$Mnlog$Mnform = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 7, Lit208, 4097);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 8, Lit209, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 9, Lit210, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 11, Lit211, 4097);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 12, Lit212, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 13, Lit213, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 14, Lit214, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 15, Lit215, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 16, Lit216, 4097);
        this.send$Mnerror = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 17, Lit217, 4097);
        this.process$Mnexception = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 18, "process-exception", 4097);
        this.dispatchEvent = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 19, Lit218, 16388);
        this.lookup$Mnhandler = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 20, Lit219, 8194);
        PropertySet moduleMethod = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 21, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime3960804766349238341.scm:547");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 22, "$define", 0);
        lambda$Fn2 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 23, null, 0);
        lambda$Fn3 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 24, null, 0);
        lambda$Fn4 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 25, null, 4097);
        lambda$Fn7 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 26, null, 4097);
        lambda$Fn6 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 27, null, 0);
        lambda$Fn9 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 28, null, 4097);
        lambda$Fn12 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 29, null, 4097);
        lambda$Fn11 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 30, null, 0);
        lambda$Fn14 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 31, null, 0);
        this.Chamada$Initialize = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 32, Lit58, 0);
        lambda$Fn15 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 33, null, 0);
        lambda$Fn16 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 34, null, 0);
        lambda$Fn17 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 35, null, 0);
        lambda$Fn18 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 36, null, 0);
        this.btnReturn$Click = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 37, Lit82, 0);
        lambda$Fn19 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 38, null, 0);
        lambda$Fn20 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 39, null, 0);
        lambda$Fn21 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 40, null, 0);
        lambda$Fn22 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 41, null, 0);
        lambda$Fn23 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 42, null, 0);
        lambda$Fn24 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 43, null, 0);
        lambda$Fn25 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 44, null, 0);
        lambda$Fn26 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 45, null, 0);
        this.btnligarChamada$Click = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 46, Lit114, 0);
        lambda$Fn27 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 47, null, 0);
        lambda$Fn28 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 48, null, 0);
        this.btndesligaChamada$Click = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 49, Lit118, 0);
        lambda$Fn29 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 50, null, 0);
        lambda$Fn30 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 51, null, 0);
        this.Lista$BeforePicking = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 52, Lit122, 0);
        this.Lista$AfterPicking = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 53, Lit127, 0);
        lambda$Fn31 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 54, null, 0);
        lambda$Fn32 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 55, null, 0);
        lambda$Fn33 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 56, null, 0);
        lambda$Fn34 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 57, null, 0);
        lambda$Fn35 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 58, null, 0);
        lambda$Fn36 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 59, null, 0);
        this.btnRestartAttendance$Click = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 60, Lit141, 0);
        lambda$Fn37 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 61, null, 0);
        lambda$Fn38 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 62, null, 0);
        lambda$Fn39 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 63, null, 0);
        lambda$Fn40 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 64, null, 0);
        lambda$Fn41 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 65, null, 0);
        lambda$Fn42 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 66, null, 0);
        this.btnSubmit$Click = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 67, Lit166, 0);
        lambda$Fn44 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 68, null, 0);
        lambda$Fn45 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 69, null, 0);
        this.btnSharing$Click = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 70, Lit180, 0);
        lambda$Fn47 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 71, null, 0);
        lambda$Fn48 = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 72, null, 0);
        this.Clock1$Timer = new ModuleMethod(appinventor_ai_efelipecarlos_Caller_Chamada_frame, 73, Lit202, 0);
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
            Chamada = null;
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
                    Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit5, Lit4), $result);
                } else {
                    addToGlobalVars(Lit5, lambda$Fn3);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit6, lambda$Fn4), $result);
                } else {
                    addToGlobalVars(Lit6, lambda$Fn6);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit14, lambda$Fn9), $result);
                } else {
                    addToGlobalVars(Lit14, lambda$Fn11);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "IBMP_V4_2", Lit23);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit24, Lit25, Lit26);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit27, "fade", Lit23);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit28, "zoom", Lit23);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit29, "Responsive", Lit23);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit30, "Chamada", Lit23);
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit31, Boolean.FALSE, Lit32), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn14));
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit58, this.Chamada$Initialize);
                } else {
                    addToFormEnvironment(Lit58, this.Chamada$Initialize);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Chamada", "Initialize");
                } else {
                    addToEvents(Lit0, Lit59);
                }
                this.Label1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit60, Lit61, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit62, Lit61, Boolean.FALSE);
                }
                this.HorizontalArrangement4 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit63, Lit64, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit0, Lit70, Lit64, lambda$Fn16);
                }
                this.btnReturn = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit64, Lit71, Lit44, lambda$Fn17), $result);
                } else {
                    addToComponents(Lit64, Lit81, Lit44, lambda$Fn18);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit82, this.btnReturn$Click);
                } else {
                    addToFormEnvironment(Lit82, this.btnReturn$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btnReturn", "Click");
                } else {
                    addToEvents(Lit44, Lit83);
                }
                this.HorizontalArrangement5 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit84, Lit85, lambda$Fn19), $result);
                } else {
                    addToComponents(Lit0, Lit87, Lit85, lambda$Fn20);
                }
                this.VerticalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit88, Lit89, lambda$Fn21), $result);
                } else {
                    addToComponents(Lit0, Lit92, Lit89, lambda$Fn22);
                }
                this.HorizontalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit89, Lit93, Lit94, lambda$Fn23), $result);
                } else {
                    addToComponents(Lit89, Lit96, Lit94, lambda$Fn24);
                }
                this.btnligarChamada = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit94, Lit97, Lit46, lambda$Fn25), $result);
                } else {
                    addToComponents(Lit94, Lit101, Lit46, lambda$Fn26);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit114, this.btnligarChamada$Click);
                } else {
                    addToFormEnvironment(Lit114, this.btnligarChamada$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btnligarChamada", "Click");
                } else {
                    addToEvents(Lit46, Lit83);
                }
                this.btndesligaChamada = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit94, Lit115, Lit47, lambda$Fn27), $result);
                } else {
                    addToComponents(Lit94, Lit116, Lit47, lambda$Fn28);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit118, this.btndesligaChamada$Click);
                } else {
                    addToFormEnvironment(Lit118, this.btndesligaChamada$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btndesligaChamada", "Click");
                } else {
                    addToEvents(Lit47, Lit83);
                }
                this.Lista = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit89, Lit119, Lit102, lambda$Fn29), $result);
                } else {
                    addToComponents(Lit89, Lit120, Lit102, lambda$Fn30);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit122, this.Lista$BeforePicking);
                } else {
                    addToFormEnvironment(Lit122, this.Lista$BeforePicking);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Lista", "BeforePicking");
                } else {
                    addToEvents(Lit102, Lit123);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit127, this.Lista$AfterPicking);
                } else {
                    addToFormEnvironment(Lit127, this.Lista$AfterPicking);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Lista", "AfterPicking");
                } else {
                    addToEvents(Lit102, Lit128);
                }
                this.HorizontalArrangement6 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit89, Lit129, Lit130, lambda$Fn31), $result);
                } else {
                    addToComponents(Lit89, Lit133, Lit130, lambda$Fn32);
                }
                this.HorizontalArrangement2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit89, Lit134, Lit135, lambda$Fn33), $result);
                } else {
                    addToComponents(Lit89, Lit137, Lit135, lambda$Fn34);
                }
                this.btnRestartAttendance = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit135, Lit138, Lit48, lambda$Fn35), $result);
                } else {
                    addToComponents(Lit135, Lit140, Lit48, lambda$Fn36);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit141, this.btnRestartAttendance$Click);
                } else {
                    addToFormEnvironment(Lit141, this.btnRestartAttendance$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btnRestartAttendance", "Click");
                } else {
                    addToEvents(Lit48, Lit83);
                }
                this.listaChamada = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit89, Lit142, Lit109, lambda$Fn37), $result);
                } else {
                    addToComponents(Lit89, Lit144, Lit109, lambda$Fn38);
                }
                this.HorizontalArrangement3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit89, Lit145, Lit146, lambda$Fn39), $result);
                } else {
                    addToComponents(Lit89, Lit148, Lit146, lambda$Fn40);
                }
                this.btnSubmit = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit146, Lit149, Lit49, lambda$Fn41), $result);
                } else {
                    addToComponents(Lit146, Lit151, Lit49, lambda$Fn42);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit166, this.btnSubmit$Click);
                } else {
                    addToFormEnvironment(Lit166, this.btnSubmit$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btnSubmit", "Click");
                } else {
                    addToEvents(Lit49, Lit83);
                }
                this.btnSharing = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit146, Lit167, Lit50, lambda$Fn44), $result);
                } else {
                    addToComponents(Lit146, Lit168, Lit50, lambda$Fn45);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit180, this.btnSharing$Click);
                } else {
                    addToFormEnvironment(Lit180, this.btnSharing$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btnSharing", "Click");
                } else {
                    addToEvents(Lit50, Lit83);
                }
                this.HorizontalArrangement7 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit89, Lit181, Lit182, lambda$Fn47), $result);
                } else {
                    addToComponents(Lit89, Lit184, Lit182, lambda$Fn48);
                }
                this.TinyDB1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit185, Lit106, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit186, Lit106, Boolean.FALSE);
                }
                this.BluetoothClient1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit187, Lit52, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit188, Lit52, Boolean.FALSE);
                }
                this.Notifier1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit189, Lit55, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit190, Lit55, Boolean.FALSE);
                }
                this.Clock1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit191, Lit104, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit192, Lit104, Boolean.FALSE);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit202, this.Clock1$Timer);
                } else {
                    addToFormEnvironment(Lit202, this.Clock1$Timer);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Clock1", "Timer");
                } else {
                    addToEvents(Lit104, Lit203);
                }
                this.TinyWebDB1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit204, Lit164, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit205, Lit164, Boolean.FALSE);
                }
                this.Sharing1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit206, Lit177, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit207, Lit177, Boolean.FALSE);
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

    static IntNum lambda4() {
        return Lit4;
    }

    static Object lambda5(Object $rfid) {
        frame0 appinventor_ai_efelipecarlos_Caller_Chamada_frame0 = new frame0();
        appinventor_ai_efelipecarlos_Caller_Chamada_frame0.$rfid = $rfid;
        runtime.addGlobalVarToCurrentFormEnvironment(Lit3, Boolean.FALSE);
        runtime.yailForEach(appinventor_ai_efelipecarlos_Caller_Chamada_frame0.lambda$Fn5, runtime.lookupGlobalVarInCurrentFormEnvironment(Lit5, runtime.$Stthe$Mnnull$Mnvalue$St));
        return runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St);
    }

    static Procedure lambda7() {
        return lambda$Fn7;
    }

    static Object lambda8(Object $rfid) {
        frame1 appinventor_ai_efelipecarlos_Caller_Chamada_frame1 = new frame1();
        appinventor_ai_efelipecarlos_Caller_Chamada_frame1.$rfid = $rfid;
        runtime.addGlobalVarToCurrentFormEnvironment(Lit3, Boolean.FALSE);
        runtime.yailForEach(appinventor_ai_efelipecarlos_Caller_Chamada_frame1.lambda$Fn8, runtime.lookupGlobalVarInCurrentFormEnvironment(Lit5, runtime.$Stthe$Mnnull$Mnvalue$St));
        return runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St);
    }

    static Object lambda10(Object $nomeAluno) {
        frame2 appinventor_ai_efelipecarlos_Caller_Chamada_frame2 = new frame2();
        appinventor_ai_efelipecarlos_Caller_Chamada_frame2.$nomeAluno = $nomeAluno;
        appinventor_ai_efelipecarlos_Caller_Chamada_frame2.$alunoEncontrado = Lit4;
        runtime.yailForEach(appinventor_ai_efelipecarlos_Caller_Chamada_frame2.lambda$Fn10, runtime.lookupGlobalVarInCurrentFormEnvironment(Lit5, runtime.$Stthe$Mnnull$Mnvalue$St));
        if (!(appinventor_ai_efelipecarlos_Caller_Chamada_frame2.$alunoEncontrado instanceof Package)) {
            return appinventor_ai_efelipecarlos_Caller_Chamada_frame2.$alunoEncontrado;
        }
        return runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit19), " is not bound in the current context"), "Unbound Variable");
    }

    static Procedure lambda12() {
        return lambda$Fn12;
    }

    static Object lambda13(Object $nomeAluno) {
        frame3 appinventor_ai_efelipecarlos_Caller_Chamada_frame3 = new frame3();
        appinventor_ai_efelipecarlos_Caller_Chamada_frame3.$nomeAluno = $nomeAluno;
        appinventor_ai_efelipecarlos_Caller_Chamada_frame3.$alunoEncontrado = Lit4;
        runtime.yailForEach(appinventor_ai_efelipecarlos_Caller_Chamada_frame3.lambda$Fn13, runtime.lookupGlobalVarInCurrentFormEnvironment(Lit5, runtime.$Stthe$Mnnull$Mnvalue$St));
        if (!(appinventor_ai_efelipecarlos_Caller_Chamada_frame3.$alunoEncontrado instanceof Package)) {
            return appinventor_ai_efelipecarlos_Caller_Chamada_frame3.$alunoEncontrado;
        }
        return runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit19), " is not bound in the current context"), "Unbound Variable");
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "IBMP_V4_2", Lit23);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit24, Lit25, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit27, "fade", Lit23);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit28, "zoom", Lit23);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit29, "Responsive", Lit23);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit30, "Chamada", Lit23);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit31, Boolean.FALSE, Lit32);
    }

    public Object Chamada$Initialize() {
        runtime.setThisForm();
        Object $backgroundColor = runtime.callYailPrimitive(runtime.make$Mncolor, LList.list1(runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list3(Lit33, Lit34, Lit35), Lit36, "make a list")), Lit37, "make-color");
        Object $fontColor = runtime.callYailPrimitive(runtime.make$Mncolor, LList.list1(runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list3(Lit38, Lit39, Lit40), Lit41, "make a list")), Lit42, "make-color");
        runtime.setAndCoerceProperty$Ex(Lit0, Lit24, $fontColor instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit43), " is not bound in the current context"), "Unbound Variable") : $fontColor, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit24, $backgroundColor instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit45), " is not bound in the current context"), "Unbound Variable") : $backgroundColor, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit46, Lit24, $backgroundColor instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit45), " is not bound in the current context"), "Unbound Variable") : $backgroundColor, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit24, $backgroundColor instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit45), " is not bound in the current context"), "Unbound Variable") : $backgroundColor, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit48, Lit24, $backgroundColor instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit45), " is not bound in the current context"), "Unbound Variable") : $backgroundColor, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit24, $backgroundColor instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit45), " is not bound in the current context"), "Unbound Variable") : $backgroundColor, Lit26);
        SimpleSymbol simpleSymbol = Lit50;
        SimpleSymbol simpleSymbol2 = Lit24;
        if ($backgroundColor instanceof Package) {
            $backgroundColor = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit45), " is not bound in the current context"), "Unbound Variable");
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, $backgroundColor, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit51, $fontColor instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit43), " is not bound in the current context"), "Unbound Variable") : $fontColor, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit46, Lit51, $fontColor instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit43), " is not bound in the current context"), "Unbound Variable") : $fontColor, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit51, $fontColor instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit43), " is not bound in the current context"), "Unbound Variable") : $fontColor, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit48, Lit51, $fontColor instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit43), " is not bound in the current context"), "Unbound Variable") : $fontColor, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit51, $fontColor instanceof Package ? runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit43), " is not bound in the current context"), "Unbound Variable") : $fontColor, Lit26);
        simpleSymbol = Lit50;
        simpleSymbol2 = Lit51;
        if ($fontColor instanceof Package) {
            $fontColor = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit43), " is not bound in the current context"), "Unbound Variable");
        }
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, $fontColor, Lit26);
        return runtime.callYailPrimitive(runtime.yail$Mnnot, LList.list1(runtime.getProperty$1(Lit52, Lit53)), Lit54, "not") != Boolean.FALSE ? runtime.callComponentMethod(Lit55, Lit56, LList.list1("Bluetooth is not enabled - use Settings to turn BT on"), Lit57) : Values.empty;
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit64, Lit24, Lit65, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit64, Lit66, Lit67, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit64, Lit68, Lit69, Lit26);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit64, Lit24, Lit65, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit64, Lit66, Lit67, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit64, Lit68, Lit69, Lit26);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit44, Lit24, Lit72, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit73, Boolean.TRUE, Lit32);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit74, Lit75, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit76, Lit8, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit66, Lit67, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit68, Lit77, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit78, Lit79, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit44, Lit80, "RETURN", Lit23);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit44, Lit24, Lit72, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit73, Boolean.TRUE, Lit32);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit74, Lit75, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit76, Lit8, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit66, Lit67, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit68, Lit77, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit44, Lit78, Lit79, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit44, Lit80, "RETURN", Lit23);
    }

    public Object btnReturn$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.close$Mnscreen, LList.Empty, LList.Empty, "close screen");
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit85, Lit24, Lit86, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit85, Lit66, Lit67, Lit26);
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit85, Lit24, Lit86, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit85, Lit66, Lit67, Lit26);
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit89, Lit90, Lit15, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit89, Lit24, Lit91, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit89, Lit66, Lit69, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit89, Lit68, Lit69, Lit26);
    }

    static Object lambda23() {
        runtime.setAndCoerceProperty$Ex(Lit89, Lit90, Lit15, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit89, Lit24, Lit91, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit89, Lit66, Lit69, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit89, Lit68, Lit69, Lit26);
    }

    static Object lambda24() {
        runtime.setAndCoerceProperty$Ex(Lit94, Lit90, Lit15, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit94, Lit24, Lit95, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit94, Lit68, Lit69, Lit26);
    }

    static Object lambda25() {
        runtime.setAndCoerceProperty$Ex(Lit94, Lit90, Lit15, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit94, Lit24, Lit95, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit94, Lit68, Lit69, Lit26);
    }

    static Object lambda26() {
        runtime.setAndCoerceProperty$Ex(Lit46, Lit24, Lit98, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit46, Lit73, Boolean.TRUE, Lit32);
        runtime.setAndCoerceProperty$Ex(Lit46, Lit74, Lit75, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit46, Lit76, Lit8, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit46, Lit66, Lit67, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit46, Lit68, Lit99, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit46, Lit78, Lit79, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit46, Lit80, "START ATTENDANCE", Lit23);
        return runtime.setAndCoerceProperty$Ex(Lit46, Lit51, Lit100, Lit26);
    }

    static Object lambda27() {
        runtime.setAndCoerceProperty$Ex(Lit46, Lit24, Lit98, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit46, Lit73, Boolean.TRUE, Lit32);
        runtime.setAndCoerceProperty$Ex(Lit46, Lit74, Lit75, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit46, Lit76, Lit8, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit46, Lit66, Lit67, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit46, Lit68, Lit99, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit46, Lit78, Lit79, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit46, Lit80, "START ATTENDANCE", Lit23);
        return runtime.setAndCoerceProperty$Ex(Lit46, Lit51, Lit100, Lit26);
    }

    public Object btnligarChamada$Click() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit102, Lit103, LList.Empty, LList.Empty);
        runtime.setAndCoerceProperty$Ex(Lit104, Lit105, Boolean.TRUE, Lit32);
        Object $names = runtime.callComponentMethod(Lit106, Lit107, LList.list2("cards", ElementType.MATCH_ANY_LOCALNAME), Lit108);
        runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list");
        runtime.setAndCoerceProperty$Ex(Lit109, Lit110, runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list"), Lit111);
        Symbol symbol = Lit5;
        if ($names instanceof Package) {
            $names = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit112), " is not bound in the current context"), "Unbound Variable");
        }
        runtime.addGlobalVarToCurrentFormEnvironment(symbol, $names);
        runtime.setAndCoerceProperty$Ex(Lit46, Lit113, Boolean.FALSE, Lit32);
        return runtime.setAndCoerceProperty$Ex(Lit47, Lit113, Boolean.TRUE, Lit32);
    }

    static Object lambda28() {
        runtime.setAndCoerceProperty$Ex(Lit47, Lit73, Boolean.TRUE, Lit32);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit74, Lit75, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit76, Lit8, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit66, Lit67, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit68, Lit99, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit78, Lit79, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit80, "STOP ATTENDANCE", Lit23);
        return runtime.setAndCoerceProperty$Ex(Lit47, Lit113, Boolean.FALSE, Lit32);
    }

    static Object lambda29() {
        runtime.setAndCoerceProperty$Ex(Lit47, Lit73, Boolean.TRUE, Lit32);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit74, Lit75, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit76, Lit8, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit66, Lit67, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit68, Lit99, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit78, Lit79, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit80, "STOP ATTENDANCE", Lit23);
        return runtime.setAndCoerceProperty$Ex(Lit47, Lit113, Boolean.FALSE, Lit32);
    }

    public Object btndesligaChamada$Click() {
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit104, Lit105, Boolean.FALSE, Lit32);
        runtime.setAndCoerceProperty$Ex(Lit46, Lit113, Boolean.TRUE, Lit32);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit113, Boolean.FALSE, Lit32);
        return runtime.callComponentMethod(Lit52, Lit117, LList.Empty, LList.Empty);
    }

    static Object lambda30() {
        runtime.setAndCoerceProperty$Ex(Lit102, Lit80, "Text for ListPicker1", Lit23);
        return runtime.setAndCoerceProperty$Ex(Lit102, Lit113, Boolean.FALSE, Lit32);
    }

    static Object lambda31() {
        runtime.setAndCoerceProperty$Ex(Lit102, Lit80, "Text for ListPicker1", Lit23);
        return runtime.setAndCoerceProperty$Ex(Lit102, Lit113, Boolean.FALSE, Lit32);
    }

    public Object Lista$BeforePicking() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit102, Lit110, runtime.getProperty$1(Lit52, Lit121), Lit111);
    }

    public Object Lista$AfterPicking() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit52, Lit124, LList.list1(runtime.getProperty$1(Lit102, Lit125)), Lit126) != Boolean.FALSE ? Boolean.FALSE : Values.empty;
    }

    static Object lambda32() {
        runtime.setAndCoerceProperty$Ex(Lit130, Lit24, Lit131, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit130, Lit66, Lit132, Lit26);
    }

    static Object lambda33() {
        runtime.setAndCoerceProperty$Ex(Lit130, Lit24, Lit131, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit130, Lit66, Lit132, Lit26);
    }

    static Object lambda34() {
        runtime.setAndCoerceProperty$Ex(Lit135, Lit90, Lit15, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit135, Lit24, Lit136, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit135, Lit68, Lit69, Lit26);
    }

    static Object lambda35() {
        runtime.setAndCoerceProperty$Ex(Lit135, Lit90, Lit15, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit135, Lit24, Lit136, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit135, Lit68, Lit69, Lit26);
    }

    static Object lambda36() {
        runtime.setAndCoerceProperty$Ex(Lit48, Lit24, Lit139, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit48, Lit73, Boolean.TRUE, Lit32);
        runtime.setAndCoerceProperty$Ex(Lit48, Lit74, Lit75, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit48, Lit76, Lit8, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit48, Lit66, Lit67, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit48, Lit68, Lit99, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit48, Lit78, Lit79, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit48, Lit80, "RESTART ATTENDANCE", Lit23);
    }

    static Object lambda37() {
        runtime.setAndCoerceProperty$Ex(Lit48, Lit24, Lit139, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit48, Lit73, Boolean.TRUE, Lit32);
        runtime.setAndCoerceProperty$Ex(Lit48, Lit74, Lit75, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit48, Lit76, Lit8, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit48, Lit66, Lit67, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit48, Lit68, Lit99, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit48, Lit78, Lit79, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit48, Lit80, "RESTART ATTENDANCE", Lit23);
    }

    public Object btnRestartAttendance$Click() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit109, Lit110, runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list"), Lit111);
    }

    static Object lambda38() {
        runtime.setAndCoerceProperty$Ex(Lit109, Lit24, Lit143, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit109, Lit66, Lit69, Lit26);
    }

    static Object lambda39() {
        runtime.setAndCoerceProperty$Ex(Lit109, Lit24, Lit143, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit109, Lit66, Lit69, Lit26);
    }

    static Object lambda40() {
        runtime.setAndCoerceProperty$Ex(Lit146, Lit90, Lit15, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit146, Lit24, Lit147, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit146, Lit68, Lit69, Lit26);
    }

    static Object lambda41() {
        runtime.setAndCoerceProperty$Ex(Lit146, Lit90, Lit15, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit146, Lit24, Lit147, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit146, Lit68, Lit69, Lit26);
    }

    static Object lambda42() {
        runtime.setAndCoerceProperty$Ex(Lit49, Lit24, Lit150, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit73, Boolean.TRUE, Lit32);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit74, Lit75, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit76, Lit8, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit66, Lit67, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit68, Lit99, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit78, Lit79, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit49, Lit80, "CLOSE ATTENDENCE", Lit23);
    }

    static Object lambda43() {
        runtime.setAndCoerceProperty$Ex(Lit49, Lit24, Lit150, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit73, Boolean.TRUE, Lit32);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit74, Lit75, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit76, Lit8, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit66, Lit67, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit68, Lit99, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit78, Lit79, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit49, Lit80, "CLOSE ATTENDENCE", Lit23);
    }

    public Object btnSubmit$Click() {
        Object signalRuntimeError;
        frame4 appinventor_ai_efelipecarlos_Caller_Chamada_frame4 = new frame4();
        runtime.setThisForm();
        appinventor_ai_efelipecarlos_Caller_Chamada_frame4.$presencasCadastradas = runtime.callComponentMethod(Lit106, Lit107, LList.list2("presencas", runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list")), Lit152);
        runtime.yailForEach(appinventor_ai_efelipecarlos_Caller_Chamada_frame4.lambda$Fn43, runtime.getProperty$1(Lit109, Lit110));
        SimpleSymbol simpleSymbol = Lit106;
        SimpleSymbol simpleSymbol2 = Lit162;
        String str = "presencas";
        if (appinventor_ai_efelipecarlos_Caller_Chamada_frame4.$presencasCadastradas instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit160), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = appinventor_ai_efelipecarlos_Caller_Chamada_frame4.$presencasCadastradas;
        }
        runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list2(str, signalRuntimeError), Lit163);
        simpleSymbol = Lit164;
        simpleSymbol2 = Lit162;
        str = "presencasWeb";
        if (appinventor_ai_efelipecarlos_Caller_Chamada_frame4.$presencasCadastradas instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit160), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = appinventor_ai_efelipecarlos_Caller_Chamada_frame4.$presencasCadastradas;
        }
        runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list2(str, signalRuntimeError), Lit165);
        runtime.callComponentMethod(Lit52, Lit117, LList.Empty, LList.Empty);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit113, Boolean.FALSE, Lit32);
        return runtime.setAndCoerceProperty$Ex(Lit50, Lit113, Boolean.TRUE, Lit32);
    }

    static Object lambda45() {
        runtime.setAndCoerceProperty$Ex(Lit50, Lit73, Boolean.TRUE, Lit32);
        runtime.setAndCoerceProperty$Ex(Lit50, Lit74, Lit75, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit50, Lit76, Lit8, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit50, Lit66, Lit67, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit50, Lit68, Lit99, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit50, Lit78, Lit79, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit50, Lit80, "SHARE", Lit23);
        return runtime.setAndCoerceProperty$Ex(Lit50, Lit113, Boolean.FALSE, Lit32);
    }

    static Object lambda46() {
        runtime.setAndCoerceProperty$Ex(Lit50, Lit73, Boolean.TRUE, Lit32);
        runtime.setAndCoerceProperty$Ex(Lit50, Lit74, Lit75, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit50, Lit76, Lit8, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit50, Lit66, Lit67, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit50, Lit68, Lit99, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit50, Lit78, Lit79, Lit26);
        runtime.setAndCoerceProperty$Ex(Lit50, Lit80, "SHARE", Lit23);
        return runtime.setAndCoerceProperty$Ex(Lit50, Lit113, Boolean.FALSE, Lit32);
    }

    public Object btnSharing$Click() {
        Object signalRuntimeError;
        frame5 appinventor_ai_efelipecarlos_Caller_Chamada_frame5 = new frame5();
        runtime.setThisForm();
        Object $names = runtime.callComponentMethod(Lit106, Lit107, LList.list2("presencas", ElementType.MATCH_ANY_LOCALNAME), Lit169);
        runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list");
        Symbol symbol = Lit5;
        if ($names instanceof Package) {
            $names = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit112), " is not bound in the current context"), "Unbound Variable");
        }
        runtime.addGlobalVarToCurrentFormEnvironment(symbol, $names);
        appinventor_ai_efelipecarlos_Caller_Chamada_frame5.$alunos = runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list");
        runtime.yailForEach(appinventor_ai_efelipecarlos_Caller_Chamada_frame5.lambda$Fn46, runtime.lookupGlobalVarInCurrentFormEnvironment(Lit5, runtime.$Stthe$Mnnull$Mnvalue$St));
        SimpleSymbol simpleSymbol = Lit177;
        SimpleSymbol simpleSymbol2 = Lit178;
        if (appinventor_ai_efelipecarlos_Caller_Chamada_frame5.$alunos instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit170), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = appinventor_ai_efelipecarlos_Caller_Chamada_frame5.$alunos;
        }
        return runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list1(signalRuntimeError), Lit179);
    }

    static Object lambda48() {
        runtime.setAndCoerceProperty$Ex(Lit182, Lit24, Lit183, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit182, Lit66, Lit67, Lit26);
    }

    static Object lambda49() {
        runtime.setAndCoerceProperty$Ex(Lit182, Lit24, Lit183, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit182, Lit66, Lit67, Lit26);
    }

    public Object Clock1$Timer() {
        runtime.setThisForm();
        IntNum $ParameterByte = Lit4;
        if (runtime.getProperty$1(Lit52, Lit193) == Boolean.FALSE) {
            return Values.empty;
        }
        if (runtime.callYailPrimitive(Scheme.numGrt, LList.list2(runtime.callComponentMethod(Lit52, Lit194, LList.Empty, LList.Empty), Lit4), Lit195, ">") == Boolean.FALSE) {
            return Values.empty;
        }
        runtime.callComponentMethod(Lit52, Lit194, LList.Empty, LList.Empty);
        $ParameterByte = runtime.callComponentMethod(Lit52, Lit196, LList.list1(runtime.callComponentMethod(Lit52, Lit194, LList.Empty, LList.Empty)), Lit197);
        Procedure procedure = Scheme.applyToArgs;
        Object lookupGlobalVarInCurrentFormEnvironment = runtime.lookupGlobalVarInCurrentFormEnvironment(Lit6, runtime.$Stthe$Mnnull$Mnvalue$St);
        if ($ParameterByte instanceof Package) {
            $ParameterByte = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit198), " is not bound in the current context"), "Unbound Variable");
        }
        if (procedure.apply2(lookupGlobalVarInCurrentFormEnvironment, $ParameterByte) == Boolean.FALSE) {
            return Values.empty;
        }
        Object signalRuntimeError;
        Object $alunosNaLista = runtime.getProperty$1(Lit109, Lit110);
        ModuleMethod moduleMethod = runtime.yail$Mnlist$Mnadd$Mnto$Mnlist$Ex;
        if ($alunosNaLista instanceof Package) {
            signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit199), " is not bound in the current context"), "Unbound Variable");
        } else {
            signalRuntimeError = $alunosNaLista;
        }
        runtime.callYailPrimitive(moduleMethod, LList.list2(signalRuntimeError, runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St), Lit15), Lit200, "select list item")), Lit201, "add items to list");
        SimpleSymbol simpleSymbol = Lit109;
        SimpleSymbol simpleSymbol2 = Lit110;
        if ($alunosNaLista instanceof Package) {
            $alunosNaLista = runtime.signalRuntimeError(strings.stringAppend("The variable ", ((Procedure) runtime.get$Mndisplay$Mnrepresentation).apply1(Lit199), " is not bound in the current context"), "Unbound Variable");
        }
        return runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, $alunosNaLista, Lit111);
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
        Chamada = this;
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
        Chamada closureEnv = this;
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
