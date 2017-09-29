package com.epam.test.api.support.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = Result.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("description")
	private String description;
	@JsonProperty("modified")
	private String modified;
	@JsonProperty("resourceURI")
	private String resourceURI;
	@JsonProperty("event")
	private Event event;
	@JsonProperty("series")
	private Event series;
	@JsonProperty("stories")
	private Event stories;
	@JsonProperty("events")
	private Event events;

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("modified")
	public String getModified() {
		return modified;
	}

	@JsonProperty("modified")
	public void setModified(String modified) {
		this.modified = modified;
	}

	@JsonProperty("resourceURI")
	public String getResourceURI() {
		return resourceURI;
	}

	@JsonProperty("resourceURI")
	public void setResourceURI(String resourceURI) {
		this.resourceURI = resourceURI;
	}

	@JsonProperty("event")
	public Event getEvent() {
		return event;
	}

	@JsonProperty("event")
	public void setEvent(Event event) {
		this.event = event;
	}

	@JsonProperty("series")
	public Event getSeries() {
		return series;
	}

	@JsonProperty("series")
	public void setSeries(Event series) {
		this.series = series;
	}

	@JsonProperty("stories")
	public Event getStories() {
		return stories;
	}

	@JsonProperty("stories")
	public void setStories(Event stories) {
		this.stories = stories;
	}

	@JsonProperty("events")
	public Event getEvents() {
		return events;
	}

	@JsonProperty("events")
	public void setEvents(Event events) {
		this.events = events;
	}


}
