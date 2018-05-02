/**
 */
package org.xcpsml.xcpsml.cpsml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xcpsml.xcpsml.cpsml.ComTransition;
import org.xcpsml.xcpsml.cpsml.Condition;
import org.xcpsml.xcpsml.cpsml.CpsmlFactory;
import org.xcpsml.xcpsml.cpsml.CpsmlPackage;
import org.xcpsml.xcpsml.cpsml.DeVariable;
import org.xcpsml.xcpsml.cpsml.Fright;
import org.xcpsml.xcpsml.cpsml.Function;
import org.xcpsml.xcpsml.cpsml.IndeVariable;
import org.xcpsml.xcpsml.cpsml.Interval;
import org.xcpsml.xcpsml.cpsml.ODE;
import org.xcpsml.xcpsml.cpsml.ProbTransition;
import org.xcpsml.xcpsml.cpsml.State;
import org.xcpsml.xcpsml.cpsml.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CpsmlFactoryImpl extends EFactoryImpl implements CpsmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CpsmlFactory init() {
		try {
			CpsmlFactory theCpsmlFactory = (CpsmlFactory)EPackage.Registry.INSTANCE.getEFactory(CpsmlPackage.eNS_URI);
			if (theCpsmlFactory != null) {
				return theCpsmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CpsmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpsmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CpsmlPackage.SYSTEM: return createSystem();
			case CpsmlPackage.VARIABLE: return createVariable();
			case CpsmlPackage.STATE: return createState();
			case CpsmlPackage.COM_TRANSITION: return createComTransition();
			case CpsmlPackage.PROB_TRANSITION: return createProbTransition();
			case CpsmlPackage.ODE: return createODE();
			case CpsmlPackage.FUNCTION: return createFunction();
			case CpsmlPackage.CONDITION: return createCondition();
			case CpsmlPackage.INTERVAL: return createInterval();
			case CpsmlPackage.INDE_VARIABLE: return createIndeVariable();
			case CpsmlPackage.DE_VARIABLE: return createDeVariable();
			case CpsmlPackage.FRIGHT: return createFright();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.xcpsml.xcpsml.cpsml.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComTransition createComTransition() {
		ComTransitionImpl comTransition = new ComTransitionImpl();
		return comTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbTransition createProbTransition() {
		ProbTransitionImpl probTransition = new ProbTransitionImpl();
		return probTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODE createODE() {
		ODEImpl ode = new ODEImpl();
		return ode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interval createInterval() {
		IntervalImpl interval = new IntervalImpl();
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndeVariable createIndeVariable() {
		IndeVariableImpl indeVariable = new IndeVariableImpl();
		return indeVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeVariable createDeVariable() {
		DeVariableImpl deVariable = new DeVariableImpl();
		return deVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fright createFright() {
		FrightImpl fright = new FrightImpl();
		return fright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpsmlPackage getCpsmlPackage() {
		return (CpsmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CpsmlPackage getPackage() {
		return CpsmlPackage.eINSTANCE;
	}

} //CpsmlFactoryImpl
