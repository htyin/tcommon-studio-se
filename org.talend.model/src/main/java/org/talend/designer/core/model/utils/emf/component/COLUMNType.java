/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.core.model.utils.emf.component;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>COLUMN Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getDEFAULT <em>DEFAULT</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#isKEY <em>KEY</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getLENGTH <em>LENGTH</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getNAME <em>NAME</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#isNULLABLE <em>NULLABLE</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getPRECISION <em>PRECISION</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOLUMNType()
 * @model extendedMetaData="name='COLUMN_._type' kind='empty'"
 * @generated
 */
public interface COLUMNType extends EObject {
    /**
     * Returns the value of the '<em><b>DEFAULT</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DEFAULT</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DEFAULT</em>' attribute.
     * @see #setDEFAULT(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOLUMNType_DEFAULT()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='DEFAULT' namespace='##targetNamespace'"
     * @generated
     */
    String getDEFAULT();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getDEFAULT <em>DEFAULT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DEFAULT</em>' attribute.
     * @see #getDEFAULT()
     * @generated
     */
    void setDEFAULT(String value);

    /**
     * Returns the value of the '<em><b>KEY</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>KEY</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>KEY</em>' attribute.
     * @see #isSetKEY()
     * @see #unsetKEY()
     * @see #setKEY(boolean)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOLUMNType_KEY()
     * @model default="false" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='KEY' namespace='##targetNamespace'"
     * @generated
     */
    boolean isKEY();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#isKEY <em>KEY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>KEY</em>' attribute.
     * @see #isSetKEY()
     * @see #unsetKEY()
     * @see #isKEY()
     * @generated
     */
    void setKEY(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#isKEY <em>KEY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKEY()
     * @see #isKEY()
     * @see #setKEY(boolean)
     * @generated
     */
    void unsetKEY();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#isKEY <em>KEY</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>KEY</em>' attribute is set.
     * @see #unsetKEY()
     * @see #isKEY()
     * @see #setKEY(boolean)
     * @generated
     */
    boolean isSetKEY();

    /**
     * Returns the value of the '<em><b>LENGTH</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LENGTH</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>LENGTH</em>' attribute.
     * @see #isSetLENGTH()
     * @see #unsetLENGTH()
     * @see #setLENGTH(int)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOLUMNType_LENGTH()
     * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='LENGTH' namespace='##targetNamespace'"
     * @generated
     */
    int getLENGTH();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getLENGTH <em>LENGTH</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>LENGTH</em>' attribute.
     * @see #isSetLENGTH()
     * @see #unsetLENGTH()
     * @see #getLENGTH()
     * @generated
     */
    void setLENGTH(int value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getLENGTH <em>LENGTH</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLENGTH()
     * @see #getLENGTH()
     * @see #setLENGTH(int)
     * @generated
     */
    void unsetLENGTH();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getLENGTH <em>LENGTH</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>LENGTH</em>' attribute is set.
     * @see #unsetLENGTH()
     * @see #getLENGTH()
     * @see #setLENGTH(int)
     * @generated
     */
    boolean isSetLENGTH();

    /**
     * Returns the value of the '<em><b>NAME</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>NAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>NAME</em>' attribute.
     * @see #setNAME(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOLUMNType_NAME()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='NAME' namespace='##targetNamespace'"
     * @generated
     */
    String getNAME();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getNAME <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NAME</em>' attribute.
     * @see #getNAME()
     * @generated
     */
    void setNAME(String value);

    /**
     * Returns the value of the '<em><b>NULLABLE</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>NULLABLE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>NULLABLE</em>' attribute.
     * @see #isSetNULLABLE()
     * @see #unsetNULLABLE()
     * @see #setNULLABLE(boolean)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOLUMNType_NULLABLE()
     * @model default="true" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='NULLABLE' namespace='##targetNamespace'"
     * @generated
     */
    boolean isNULLABLE();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#isNULLABLE <em>NULLABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>NULLABLE</em>' attribute.
     * @see #isSetNULLABLE()
     * @see #unsetNULLABLE()
     * @see #isNULLABLE()
     * @generated
     */
    void setNULLABLE(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#isNULLABLE <em>NULLABLE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNULLABLE()
     * @see #isNULLABLE()
     * @see #setNULLABLE(boolean)
     * @generated
     */
    void unsetNULLABLE();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#isNULLABLE <em>NULLABLE</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>NULLABLE</em>' attribute is set.
     * @see #unsetNULLABLE()
     * @see #isNULLABLE()
     * @see #setNULLABLE(boolean)
     * @generated
     */
    boolean isSetNULLABLE();

    /**
     * Returns the value of the '<em><b>PRECISION</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PRECISION</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PRECISION</em>' attribute.
     * @see #isSetPRECISION()
     * @see #unsetPRECISION()
     * @see #setPRECISION(int)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOLUMNType_PRECISION()
     * @model default="0" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='PRECISION' namespace='##targetNamespace'"
     * @generated
     */
    int getPRECISION();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getPRECISION <em>PRECISION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PRECISION</em>' attribute.
     * @see #isSetPRECISION()
     * @see #unsetPRECISION()
     * @see #getPRECISION()
     * @generated
     */
    void setPRECISION(int value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getPRECISION <em>PRECISION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPRECISION()
     * @see #getPRECISION()
     * @see #setPRECISION(int)
     * @generated
     */
    void unsetPRECISION();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getPRECISION <em>PRECISION</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PRECISION</em>' attribute is set.
     * @see #unsetPRECISION()
     * @see #getPRECISION()
     * @see #setPRECISION(int)
     * @generated
     */
    boolean isSetPRECISION();

    /**
     * Returns the value of the '<em><b>TYPE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TYPE</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TYPE</em>' attribute.
     * @see #setTYPE(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getCOLUMNType_TYPE()
     * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='TYPE' namespace='##targetNamespace'"
     * @generated
     */
    String getTYPE();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.COLUMNType#getTYPE <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>TYPE</em>' attribute.
     * @see #getTYPE()
     * @generated
     */
    void setTYPE(String value);

} // COLUMNType