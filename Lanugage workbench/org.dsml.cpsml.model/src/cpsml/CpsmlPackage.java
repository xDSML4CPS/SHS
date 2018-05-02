/**
 */
package cpsml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cpsml.CpsmlFactory
 * @model kind="package"
 * @generated
 */
public interface CpsmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cpsml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/cpsml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cpsml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CpsmlPackage eINSTANCE = cpsml.impl.CpsmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link cpsml.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cpsml.impl.SystemImpl
	 * @see cpsml.impl.CpsmlPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ownedvariables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OWNEDVARIABLES = 1;

	/**
	 * The feature id for the '<em><b>Relatedvariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__RELATEDVARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Owned States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OWNED_STATES = 3;

	/**
	 * The feature id for the '<em><b>Owned Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OWNED_TRANSITIONS = 4;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__INITIAL_STATE = 5;

	/**
	 * The feature id for the '<em><b>Ownedodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OWNEDODES = 6;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cpsml.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cpsml.impl.VariableImpl
	 * @see cpsml.impl.CpsmlPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cpsml.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cpsml.impl.StateImpl
	 * @see cpsml.impl.CpsmlPackageImpl#getState()
	 * @generated
	 */
	int STATE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Slaveode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__SLAVEODE = 1;

	/**
	 * The feature id for the '<em><b>Outgoing Com Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING_COM_TRANSITIONS = 2;

	/**
	 * The feature id for the '<em><b>Incoming Com Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING_COM_TRANSITIONS = 3;

	/**
	 * The feature id for the '<em><b>Outgoing Prob Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING_PROB_TRANSITIONS = 4;

	/**
	 * The feature id for the '<em><b>Incoming Prob Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING_PROB_TRANSITIONS = 5;

	/**
	 * The feature id for the '<em><b>Sub States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__SUB_STATES = 6;

	/**
	 * The feature id for the '<em><b>Initialsubstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INITIALSUBSTATE = 7;

	/**
	 * The feature id for the '<em><b>Subtransitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__SUBTRANSITIONS = 8;

	/**
	 * The feature id for the '<em><b>Subodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__SUBODES = 9;

	/**
	 * The feature id for the '<em><b>Subrelatedvariables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__SUBRELATEDVARIABLES = 10;

	/**
	 * The feature id for the '<em><b>Subrelatedvariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__SUBRELATEDVARIABLE = 11;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cpsml.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cpsml.impl.TransitionImpl
	 * @see cpsml.impl.CpsmlPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Relatedvariable2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__RELATEDVARIABLE2 = 1;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EVENT = 2;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARD = 3;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ACTION = 4;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cpsml.impl.ComTransitionImpl <em>Com Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cpsml.impl.ComTransitionImpl
	 * @see cpsml.impl.CpsmlPackageImpl#getComTransition()
	 * @generated
	 */
	int COM_TRANSITION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_TRANSITION__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Relatedvariable2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_TRANSITION__RELATEDVARIABLE2 = TRANSITION__RELATEDVARIABLE2;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_TRANSITION__EVENT = TRANSITION__EVENT;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_TRANSITION__GUARD = TRANSITION__GUARD;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_TRANSITION__ACTION = TRANSITION__ACTION;

	/**
	 * The feature id for the '<em><b>Csrc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_TRANSITION__CSRC = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ctgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_TRANSITION__CTGT = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Com Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Com Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_TRANSITION_OPERATION_COUNT = TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cpsml.impl.ProbTransitionImpl <em>Prob Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cpsml.impl.ProbTransitionImpl
	 * @see cpsml.impl.CpsmlPackageImpl#getProbTransition()
	 * @generated
	 */
	int PROB_TRANSITION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_TRANSITION__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Relatedvariable2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_TRANSITION__RELATEDVARIABLE2 = TRANSITION__RELATEDVARIABLE2;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_TRANSITION__EVENT = TRANSITION__EVENT;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_TRANSITION__GUARD = TRANSITION__GUARD;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_TRANSITION__ACTION = TRANSITION__ACTION;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_TRANSITION__PROBABILITY = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Psrc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_TRANSITION__PSRC = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ptgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_TRANSITION__PTGT = TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Prob Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Prob Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_TRANSITION_OPERATION_COUNT = TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cpsml.impl.ODEImpl <em>ODE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cpsml.impl.ODEImpl
	 * @see cpsml.impl.CpsmlPackageImpl#getODE()
	 * @generated
	 */
	int ODE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODE__FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODE__CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODE__INTERVAL = 3;

	/**
	 * The number of structural features of the '<em>ODE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>ODE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cpsml.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cpsml.impl.FunctionImpl
	 * @see cpsml.impl.CpsmlPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Indevariable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__INDEVARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Devariable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DEVARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Fright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__FRIGHT = 3;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cpsml.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cpsml.impl.ConditionImpl
	 * @see cpsml.impl.CpsmlPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cpsml.impl.IntervalImpl <em>Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cpsml.impl.IntervalImpl
	 * @see cpsml.impl.CpsmlPackageImpl#getInterval()
	 * @generated
	 */
	int INTERVAL = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__LEFT = 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__RIGHT = 2;

	/**
	 * The feature id for the '<em><b>Subinterval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__SUBINTERVAL = 3;

	/**
	 * The number of structural features of the '<em>Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cpsml.impl.IndeVariableImpl <em>Inde Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cpsml.impl.IndeVariableImpl
	 * @see cpsml.impl.CpsmlPackageImpl#getIndeVariable()
	 * @generated
	 */
	int INDE_VARIABLE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDE_VARIABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Inde Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDE_VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Inde Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDE_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cpsml.impl.DeVariableImpl <em>De Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cpsml.impl.DeVariableImpl
	 * @see cpsml.impl.CpsmlPackageImpl#getDeVariable()
	 * @generated
	 */
	int DE_VARIABLE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_VARIABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>De Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>De Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cpsml.impl.FrightImpl <em>Fright</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cpsml.impl.FrightImpl
	 * @see cpsml.impl.CpsmlPackageImpl#getFright()
	 * @generated
	 */
	int FRIGHT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIGHT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Fright</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIGHT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Fright</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIGHT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link cpsml.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see cpsml.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the attribute '{@link cpsml.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cpsml.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link cpsml.System#getOwnedvariables <em>Ownedvariables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ownedvariables</em>'.
	 * @see cpsml.System#getOwnedvariables()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Ownedvariables();

	/**
	 * Returns the meta object for the reference '{@link cpsml.System#getRelatedvariable <em>Relatedvariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relatedvariable</em>'.
	 * @see cpsml.System#getRelatedvariable()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Relatedvariable();

	/**
	 * Returns the meta object for the containment reference list '{@link cpsml.System#getOwnedStates <em>Owned States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned States</em>'.
	 * @see cpsml.System#getOwnedStates()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_OwnedStates();

	/**
	 * Returns the meta object for the containment reference list '{@link cpsml.System#getOwnedTransitions <em>Owned Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Transitions</em>'.
	 * @see cpsml.System#getOwnedTransitions()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_OwnedTransitions();

	/**
	 * Returns the meta object for the reference '{@link cpsml.System#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see cpsml.System#getInitialState()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_InitialState();

	/**
	 * Returns the meta object for the containment reference list '{@link cpsml.System#getOwnedodes <em>Ownedodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ownedodes</em>'.
	 * @see cpsml.System#getOwnedodes()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Ownedodes();

	/**
	 * Returns the meta object for class '{@link cpsml.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see cpsml.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link cpsml.Variable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cpsml.Variable#getValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Value();

	/**
	 * Returns the meta object for class '{@link cpsml.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see cpsml.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link cpsml.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cpsml.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the reference '{@link cpsml.State#getSlaveode <em>Slaveode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Slaveode</em>'.
	 * @see cpsml.State#getSlaveode()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Slaveode();

	/**
	 * Returns the meta object for the reference list '{@link cpsml.State#getOutgoingComTransitions <em>Outgoing Com Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Com Transitions</em>'.
	 * @see cpsml.State#getOutgoingComTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OutgoingComTransitions();

	/**
	 * Returns the meta object for the reference list '{@link cpsml.State#getIncomingComTransitions <em>Incoming Com Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Com Transitions</em>'.
	 * @see cpsml.State#getIncomingComTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_IncomingComTransitions();

	/**
	 * Returns the meta object for the reference list '{@link cpsml.State#getOutgoingProbTransitions <em>Outgoing Prob Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Prob Transitions</em>'.
	 * @see cpsml.State#getOutgoingProbTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OutgoingProbTransitions();

	/**
	 * Returns the meta object for the reference list '{@link cpsml.State#getIncomingProbTransitions <em>Incoming Prob Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Prob Transitions</em>'.
	 * @see cpsml.State#getIncomingProbTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_IncomingProbTransitions();

	/**
	 * Returns the meta object for the containment reference list '{@link cpsml.State#getSubStates <em>Sub States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub States</em>'.
	 * @see cpsml.State#getSubStates()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_SubStates();

	/**
	 * Returns the meta object for the reference '{@link cpsml.State#getInitialsubstate <em>Initialsubstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initialsubstate</em>'.
	 * @see cpsml.State#getInitialsubstate()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Initialsubstate();

	/**
	 * Returns the meta object for the containment reference list '{@link cpsml.State#getSubtransitions <em>Subtransitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subtransitions</em>'.
	 * @see cpsml.State#getSubtransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Subtransitions();

	/**
	 * Returns the meta object for the containment reference list '{@link cpsml.State#getSubodes <em>Subodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subodes</em>'.
	 * @see cpsml.State#getSubodes()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Subodes();

	/**
	 * Returns the meta object for the containment reference list '{@link cpsml.State#getSubrelatedvariables <em>Subrelatedvariables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subrelatedvariables</em>'.
	 * @see cpsml.State#getSubrelatedvariables()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Subrelatedvariables();

	/**
	 * Returns the meta object for the reference '{@link cpsml.State#getSubrelatedvariable <em>Subrelatedvariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subrelatedvariable</em>'.
	 * @see cpsml.State#getSubrelatedvariable()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Subrelatedvariable();

	/**
	 * Returns the meta object for class '{@link cpsml.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see cpsml.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link cpsml.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cpsml.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for the attribute '{@link cpsml.Transition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see cpsml.Transition#getAction()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Action();

	/**
	 * Returns the meta object for the reference '{@link cpsml.Transition#getRelatedvariable2 <em>Relatedvariable2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relatedvariable2</em>'.
	 * @see cpsml.Transition#getRelatedvariable2()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Relatedvariable2();

	/**
	 * Returns the meta object for the attribute '{@link cpsml.Transition#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see cpsml.Transition#getEvent()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Event();

	/**
	 * Returns the meta object for the attribute '{@link cpsml.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard</em>'.
	 * @see cpsml.Transition#getGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Guard();

	/**
	 * Returns the meta object for class '{@link cpsml.ComTransition <em>Com Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Transition</em>'.
	 * @see cpsml.ComTransition
	 * @generated
	 */
	EClass getComTransition();

	/**
	 * Returns the meta object for the reference '{@link cpsml.ComTransition#getCsrc <em>Csrc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Csrc</em>'.
	 * @see cpsml.ComTransition#getCsrc()
	 * @see #getComTransition()
	 * @generated
	 */
	EReference getComTransition_Csrc();

	/**
	 * Returns the meta object for the reference '{@link cpsml.ComTransition#getCtgt <em>Ctgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ctgt</em>'.
	 * @see cpsml.ComTransition#getCtgt()
	 * @see #getComTransition()
	 * @generated
	 */
	EReference getComTransition_Ctgt();

	/**
	 * Returns the meta object for class '{@link cpsml.ProbTransition <em>Prob Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prob Transition</em>'.
	 * @see cpsml.ProbTransition
	 * @generated
	 */
	EClass getProbTransition();

	/**
	 * Returns the meta object for the attribute '{@link cpsml.ProbTransition#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see cpsml.ProbTransition#getProbability()
	 * @see #getProbTransition()
	 * @generated
	 */
	EAttribute getProbTransition_Probability();

	/**
	 * Returns the meta object for the reference '{@link cpsml.ProbTransition#getPsrc <em>Psrc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Psrc</em>'.
	 * @see cpsml.ProbTransition#getPsrc()
	 * @see #getProbTransition()
	 * @generated
	 */
	EReference getProbTransition_Psrc();

	/**
	 * Returns the meta object for the reference '{@link cpsml.ProbTransition#getPtgt <em>Ptgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ptgt</em>'.
	 * @see cpsml.ProbTransition#getPtgt()
	 * @see #getProbTransition()
	 * @generated
	 */
	EReference getProbTransition_Ptgt();

	/**
	 * Returns the meta object for class '{@link cpsml.ODE <em>ODE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ODE</em>'.
	 * @see cpsml.ODE
	 * @generated
	 */
	EClass getODE();

	/**
	 * Returns the meta object for the attribute '{@link cpsml.ODE#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cpsml.ODE#getName()
	 * @see #getODE()
	 * @generated
	 */
	EAttribute getODE_Name();

	/**
	 * Returns the meta object for the containment reference '{@link cpsml.ODE#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see cpsml.ODE#getFunction()
	 * @see #getODE()
	 * @generated
	 */
	EReference getODE_Function();

	/**
	 * Returns the meta object for the containment reference '{@link cpsml.ODE#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see cpsml.ODE#getCondition()
	 * @see #getODE()
	 * @generated
	 */
	EReference getODE_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link cpsml.ODE#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interval</em>'.
	 * @see cpsml.ODE#getInterval()
	 * @see #getODE()
	 * @generated
	 */
	EReference getODE_Interval();

	/**
	 * Returns the meta object for class '{@link cpsml.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see cpsml.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link cpsml.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cpsml.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the containment reference '{@link cpsml.Function#getIndevariable <em>Indevariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Indevariable</em>'.
	 * @see cpsml.Function#getIndevariable()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Indevariable();

	/**
	 * Returns the meta object for the containment reference '{@link cpsml.Function#getDevariable <em>Devariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Devariable</em>'.
	 * @see cpsml.Function#getDevariable()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Devariable();

	/**
	 * Returns the meta object for the containment reference '{@link cpsml.Function#getFright <em>Fright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fright</em>'.
	 * @see cpsml.Function#getFright()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Fright();

	/**
	 * Returns the meta object for class '{@link cpsml.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see cpsml.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link cpsml.Condition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cpsml.Condition#getName()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Name();

	/**
	 * Returns the meta object for class '{@link cpsml.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval</em>'.
	 * @see cpsml.Interval
	 * @generated
	 */
	EClass getInterval();

	/**
	 * Returns the meta object for the attribute '{@link cpsml.Interval#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cpsml.Interval#getName()
	 * @see #getInterval()
	 * @generated
	 */
	EAttribute getInterval_Name();

	/**
	 * Returns the meta object for the attribute '{@link cpsml.Interval#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left</em>'.
	 * @see cpsml.Interval#getLeft()
	 * @see #getInterval()
	 * @generated
	 */
	EAttribute getInterval_Left();

	/**
	 * Returns the meta object for the attribute '{@link cpsml.Interval#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right</em>'.
	 * @see cpsml.Interval#getRight()
	 * @see #getInterval()
	 * @generated
	 */
	EAttribute getInterval_Right();

	/**
	 * Returns the meta object for the attribute '{@link cpsml.Interval#getSubinterval <em>Subinterval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subinterval</em>'.
	 * @see cpsml.Interval#getSubinterval()
	 * @see #getInterval()
	 * @generated
	 */
	EAttribute getInterval_Subinterval();

	/**
	 * Returns the meta object for class '{@link cpsml.IndeVariable <em>Inde Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inde Variable</em>'.
	 * @see cpsml.IndeVariable
	 * @generated
	 */
	EClass getIndeVariable();

	/**
	 * Returns the meta object for the attribute '{@link cpsml.IndeVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cpsml.IndeVariable#getName()
	 * @see #getIndeVariable()
	 * @generated
	 */
	EAttribute getIndeVariable_Name();

	/**
	 * Returns the meta object for class '{@link cpsml.DeVariable <em>De Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>De Variable</em>'.
	 * @see cpsml.DeVariable
	 * @generated
	 */
	EClass getDeVariable();

	/**
	 * Returns the meta object for the attribute '{@link cpsml.DeVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cpsml.DeVariable#getName()
	 * @see #getDeVariable()
	 * @generated
	 */
	EAttribute getDeVariable_Name();

	/**
	 * Returns the meta object for class '{@link cpsml.Fright <em>Fright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fright</em>'.
	 * @see cpsml.Fright
	 * @generated
	 */
	EClass getFright();

	/**
	 * Returns the meta object for the attribute '{@link cpsml.Fright#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cpsml.Fright#getName()
	 * @see #getFright()
	 * @generated
	 */
	EAttribute getFright_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CpsmlFactory getCpsmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cpsml.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cpsml.impl.SystemImpl
		 * @see cpsml.impl.CpsmlPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Ownedvariables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__OWNEDVARIABLES = eINSTANCE.getSystem_Ownedvariables();

		/**
		 * The meta object literal for the '<em><b>Relatedvariable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__RELATEDVARIABLE = eINSTANCE.getSystem_Relatedvariable();

		/**
		 * The meta object literal for the '<em><b>Owned States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__OWNED_STATES = eINSTANCE.getSystem_OwnedStates();

		/**
		 * The meta object literal for the '<em><b>Owned Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__OWNED_TRANSITIONS = eINSTANCE.getSystem_OwnedTransitions();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__INITIAL_STATE = eINSTANCE.getSystem_InitialState();

		/**
		 * The meta object literal for the '<em><b>Ownedodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__OWNEDODES = eINSTANCE.getSystem_Ownedodes();

		/**
		 * The meta object literal for the '{@link cpsml.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cpsml.impl.VariableImpl
		 * @see cpsml.impl.CpsmlPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VALUE = eINSTANCE.getVariable_Value();

		/**
		 * The meta object literal for the '{@link cpsml.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cpsml.impl.StateImpl
		 * @see cpsml.impl.CpsmlPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Slaveode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__SLAVEODE = eINSTANCE.getState_Slaveode();

		/**
		 * The meta object literal for the '<em><b>Outgoing Com Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOING_COM_TRANSITIONS = eINSTANCE.getState_OutgoingComTransitions();

		/**
		 * The meta object literal for the '<em><b>Incoming Com Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INCOMING_COM_TRANSITIONS = eINSTANCE.getState_IncomingComTransitions();

		/**
		 * The meta object literal for the '<em><b>Outgoing Prob Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOING_PROB_TRANSITIONS = eINSTANCE.getState_OutgoingProbTransitions();

		/**
		 * The meta object literal for the '<em><b>Incoming Prob Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INCOMING_PROB_TRANSITIONS = eINSTANCE.getState_IncomingProbTransitions();

		/**
		 * The meta object literal for the '<em><b>Sub States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__SUB_STATES = eINSTANCE.getState_SubStates();

		/**
		 * The meta object literal for the '<em><b>Initialsubstate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INITIALSUBSTATE = eINSTANCE.getState_Initialsubstate();

		/**
		 * The meta object literal for the '<em><b>Subtransitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__SUBTRANSITIONS = eINSTANCE.getState_Subtransitions();

		/**
		 * The meta object literal for the '<em><b>Subodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__SUBODES = eINSTANCE.getState_Subodes();

		/**
		 * The meta object literal for the '<em><b>Subrelatedvariables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__SUBRELATEDVARIABLES = eINSTANCE.getState_Subrelatedvariables();

		/**
		 * The meta object literal for the '<em><b>Subrelatedvariable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__SUBRELATEDVARIABLE = eINSTANCE.getState_Subrelatedvariable();

		/**
		 * The meta object literal for the '{@link cpsml.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cpsml.impl.TransitionImpl
		 * @see cpsml.impl.CpsmlPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__ACTION = eINSTANCE.getTransition_Action();

		/**
		 * The meta object literal for the '<em><b>Relatedvariable2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__RELATEDVARIABLE2 = eINSTANCE.getTransition_Relatedvariable2();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__EVENT = eINSTANCE.getTransition_Event();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

		/**
		 * The meta object literal for the '{@link cpsml.impl.ComTransitionImpl <em>Com Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cpsml.impl.ComTransitionImpl
		 * @see cpsml.impl.CpsmlPackageImpl#getComTransition()
		 * @generated
		 */
		EClass COM_TRANSITION = eINSTANCE.getComTransition();

		/**
		 * The meta object literal for the '<em><b>Csrc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_TRANSITION__CSRC = eINSTANCE.getComTransition_Csrc();

		/**
		 * The meta object literal for the '<em><b>Ctgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_TRANSITION__CTGT = eINSTANCE.getComTransition_Ctgt();

		/**
		 * The meta object literal for the '{@link cpsml.impl.ProbTransitionImpl <em>Prob Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cpsml.impl.ProbTransitionImpl
		 * @see cpsml.impl.CpsmlPackageImpl#getProbTransition()
		 * @generated
		 */
		EClass PROB_TRANSITION = eINSTANCE.getProbTransition();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROB_TRANSITION__PROBABILITY = eINSTANCE.getProbTransition_Probability();

		/**
		 * The meta object literal for the '<em><b>Psrc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROB_TRANSITION__PSRC = eINSTANCE.getProbTransition_Psrc();

		/**
		 * The meta object literal for the '<em><b>Ptgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROB_TRANSITION__PTGT = eINSTANCE.getProbTransition_Ptgt();

		/**
		 * The meta object literal for the '{@link cpsml.impl.ODEImpl <em>ODE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cpsml.impl.ODEImpl
		 * @see cpsml.impl.CpsmlPackageImpl#getODE()
		 * @generated
		 */
		EClass ODE = eINSTANCE.getODE();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ODE__NAME = eINSTANCE.getODE_Name();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ODE__FUNCTION = eINSTANCE.getODE_Function();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ODE__CONDITION = eINSTANCE.getODE_Condition();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ODE__INTERVAL = eINSTANCE.getODE_Interval();

		/**
		 * The meta object literal for the '{@link cpsml.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cpsml.impl.FunctionImpl
		 * @see cpsml.impl.CpsmlPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Indevariable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__INDEVARIABLE = eINSTANCE.getFunction_Indevariable();

		/**
		 * The meta object literal for the '<em><b>Devariable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__DEVARIABLE = eINSTANCE.getFunction_Devariable();

		/**
		 * The meta object literal for the '<em><b>Fright</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__FRIGHT = eINSTANCE.getFunction_Fright();

		/**
		 * The meta object literal for the '{@link cpsml.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cpsml.impl.ConditionImpl
		 * @see cpsml.impl.CpsmlPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__NAME = eINSTANCE.getCondition_Name();

		/**
		 * The meta object literal for the '{@link cpsml.impl.IntervalImpl <em>Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cpsml.impl.IntervalImpl
		 * @see cpsml.impl.CpsmlPackageImpl#getInterval()
		 * @generated
		 */
		EClass INTERVAL = eINSTANCE.getInterval();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL__NAME = eINSTANCE.getInterval_Name();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL__LEFT = eINSTANCE.getInterval_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL__RIGHT = eINSTANCE.getInterval_Right();

		/**
		 * The meta object literal for the '<em><b>Subinterval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL__SUBINTERVAL = eINSTANCE.getInterval_Subinterval();

		/**
		 * The meta object literal for the '{@link cpsml.impl.IndeVariableImpl <em>Inde Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cpsml.impl.IndeVariableImpl
		 * @see cpsml.impl.CpsmlPackageImpl#getIndeVariable()
		 * @generated
		 */
		EClass INDE_VARIABLE = eINSTANCE.getIndeVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDE_VARIABLE__NAME = eINSTANCE.getIndeVariable_Name();

		/**
		 * The meta object literal for the '{@link cpsml.impl.DeVariableImpl <em>De Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cpsml.impl.DeVariableImpl
		 * @see cpsml.impl.CpsmlPackageImpl#getDeVariable()
		 * @generated
		 */
		EClass DE_VARIABLE = eINSTANCE.getDeVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DE_VARIABLE__NAME = eINSTANCE.getDeVariable_Name();

		/**
		 * The meta object literal for the '{@link cpsml.impl.FrightImpl <em>Fright</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cpsml.impl.FrightImpl
		 * @see cpsml.impl.CpsmlPackageImpl#getFright()
		 * @generated
		 */
		EClass FRIGHT = eINSTANCE.getFright();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRIGHT__NAME = eINSTANCE.getFright_Name();

	}

} //CpsmlPackage
