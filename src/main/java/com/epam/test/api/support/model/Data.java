package com.epam.test.api.support.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = Data.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {

	@JsonProperty("offset")
	private Integer offset;
	@JsonProperty("limit")
	private Integer limit;
	@JsonProperty("total")
	private Integer total;
	@JsonProperty("count")
	private Integer count;
	@JsonProperty("results")
	private List<Result> results = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("offset")
	public Integer getOffset() {
		return offset;
	}

	@JsonProperty("offset")
	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	@JsonProperty("limit")
	public Integer getLimit() {
		return limit;
	}

	@JsonProperty("limit")
	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	@JsonProperty("total")
	public Integer getTotal() {
		return total;
	}

	@JsonProperty("total")
	public void setTotal(Integer total) {
		this.total = total;
	}

	@JsonProperty("count")
	public Integer getCount() {
		return count;
	}

	@JsonProperty("count")
	public void setCount(Integer count) {
		this.count = count;
	}

	@JsonProperty("results")
	public List<Result> getResults() {
		return results;
	}

	@JsonProperty("results")
	public void setResults(List<Result> results) {
		this.results = results;
	}
}
