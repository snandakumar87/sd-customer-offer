package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAgreementRetrieveInputModelAgreementInstanceReport
 */
public class BQAgreementRetrieveInputModelAgreementInstanceReport   {
  private String agreementInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return agreementInstanceReportReference
  **/

  public String getAgreementInstanceReportReference() {
    return agreementInstanceReportReference;
  }

  public void setAgreementInstanceReportReference(String agreementInstanceReportReference) {
    this.agreementInstanceReportReference = agreementInstanceReportReference;
  }


}

