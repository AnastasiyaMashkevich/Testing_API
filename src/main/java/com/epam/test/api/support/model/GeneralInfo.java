package com.epam.test.api.support.model;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = GeneralInfo.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeneralInfo {
	@JsonProperty("code")
	private Integer code;
	@JsonProperty("status")
	private String status;
	@JsonProperty("copyright")
	private String copyright;
	@JsonProperty("attributionText")
	private String attributionText;
	@JsonProperty("attributionHTML")
	private String attributionHTML;
	@JsonProperty("etag")
	private String etag;
	@JsonProperty("data")
	private Data data;

	@JsonProperty("code")
	public Integer getCode() {
		return code;
	}

	@JsonProperty("code")
	public void setCode(Integer code) {
		this.code = code;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("copyright")
	public String getCopyright() {
		return copyright;
	}

	@JsonProperty("copyright")
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	@JsonProperty("attributionText")
	public String getAttributionText() {
		return attributionText;
	}

	@JsonProperty("attributionText")
	public void setAttributionText(String attributionText) {
		this.attributionText = attributionText;
	}

	@JsonProperty("attributionHTML")
	public String getAttributionHTML() {
		return attributionHTML;
	}

	@JsonProperty("attributionHTML")
	public void setAttributionHTML(String attributionHTML) {
		this.attributionHTML = attributionHTML;
	}

	@JsonProperty("etag")
	public String getEtag() {
		return etag;
	}

	@JsonProperty("etag")
	public void setEtag(String etag) {
		this.etag = etag;
	}

	@JsonProperty("data")
	public Data getData() {
		return data;
	}

	@JsonProperty("data")
	public void setData(Data data) {
		this.data = data;
	}
}
