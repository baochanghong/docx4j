/*
 *  Copyright 2007-2008, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.docx4j.dml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_ColorSchemeAndMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_ColorSchemeAndMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clrScheme" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_ColorScheme"/>
 *         &lt;element name="clrMap" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_ColorMapping" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_ColorSchemeAndMapping", propOrder = {
    "clrScheme",
    "clrMap"
})
public class CTColorSchemeAndMapping {

    @XmlElement(required = true)
    protected CTColorScheme clrScheme;
    protected CTColorMapping clrMap;

    /**
     * Gets the value of the clrScheme property.
     * 
     * @return
     *     possible object is
     *     {@link CTColorScheme }
     *     
     */
    public CTColorScheme getClrScheme() {
        return clrScheme;
    }

    /**
     * Sets the value of the clrScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTColorScheme }
     *     
     */
    public void setClrScheme(CTColorScheme value) {
        this.clrScheme = value;
    }

    /**
     * Gets the value of the clrMap property.
     * 
     * @return
     *     possible object is
     *     {@link CTColorMapping }
     *     
     */
    public CTColorMapping getClrMap() {
        return clrMap;
    }

    /**
     * Sets the value of the clrMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTColorMapping }
     *     
     */
    public void setClrMap(CTColorMapping value) {
        this.clrMap = value;
    }

}
