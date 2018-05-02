/**
 */
package org.xcpsml.xcpsmlmt.cpsml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xcpsml.xcpsmlmt.cpsml.ComTransition;
import org.xcpsml.xcpsmlmt.cpsml.Condition;
import org.xcpsml.xcpsmlmt.cpsml.CpsmlFactory;
import org.xcpsml.xcpsmlmt.cpsml.CpsmlPackage;
import org.xcpsml.xcpsmlmt.cpsml.DeVariable;
import org.xcpsml.xcpsmlmt.cpsml.Fright;
import org.xcpsml.xcpsmlmt.cpsml.Function;
import org.xcpsml.xcpsmlmt.cpsml.IndeVariable;
import org.xcpsml.xcpsmlmt.cpsml.Interval;
import org.xcpsml.xcpsmlmt.cpsml.ODE;
import org.xcpsml.xcpsmlmt.cpsml.ProbTransition;
import org.xcpsml.xcpsmlmt.cpsml.State;
import org.xcpsml.xcpsmlmt.cpsml.Variable;

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
	public org.xcpsml.xcpsmlmt.cpsml.System createSystem() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComTransition createComTransition() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbTransition createProbTransition() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODE createODE() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interval createInterval() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndeVariable createIndeVariable() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeVariable createDeVariable() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fright createFright() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
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
