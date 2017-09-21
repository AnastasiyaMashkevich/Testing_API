package com.epam.test.api.model;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RepositoriesList {
	@JsonProperty("total_count")
	private Integer totalCount;
	@JsonProperty("incomplete_results")
	private Boolean incompleteResults;
	@JsonProperty("items")
	private List<Repository> items = new ArrayList<Repository>();

	@JsonProperty("total_count")
	public Integer getTotalCount() {
		return totalCount;
	}

	@JsonProperty("total_count")
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	@JsonProperty("incomplete_results")
	public Boolean getIncompleteResults() {
		return incompleteResults;
	}

	@JsonProperty("incomplete_results")
	public void setIncompleteResults(Boolean incompleteResults) {
		this.incompleteResults = incompleteResults;
	}

	@JsonProperty("items")
	public List<Repository> getItems() {
		return items;
	}

	@JsonProperty("items")
	public void setItems(List<Repository> items) {
		this.items = items;
	}

}
