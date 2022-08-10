// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An object representing the location and content of a table footnote. */
@Fluent
public final class DocumentFootnote {
    /*
     * Table footnote content.
     */
    @JsonProperty(value = "content", required = true)
    private String content;

    /*
     * Bounding regions covering the table footnote.
     */
    @JsonProperty(value = "boundingRegions")
    private List<BoundingRegion> boundingRegions;

    /*
     * Location of the table footnote in the reading order concatenated
     * content.
     */
    @JsonProperty(value = "spans", required = true)
    private List<DocumentSpan> spans;

    /**
     * Get the content property: Table footnote content.
     *
     * @return the content value.
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Set the content property: Table footnote content.
     *
     * @param content the content value to set.
     * @return the DocumentFootnote object itself.
     */
    public DocumentFootnote setContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get the boundingRegions property: Bounding regions covering the table footnote.
     *
     * @return the boundingRegions value.
     */
    public List<BoundingRegion> getBoundingRegions() {
        return this.boundingRegions;
    }

    /**
     * Set the boundingRegions property: Bounding regions covering the table footnote.
     *
     * @param boundingRegions the boundingRegions value to set.
     * @return the DocumentFootnote object itself.
     */
    public DocumentFootnote setBoundingRegions(List<BoundingRegion> boundingRegions) {
        this.boundingRegions = boundingRegions;
        return this;
    }

    /**
     * Get the spans property: Location of the table footnote in the reading order concatenated content.
     *
     * @return the spans value.
     */
    public List<DocumentSpan> getSpans() {
        return this.spans;
    }

    /**
     * Set the spans property: Location of the table footnote in the reading order concatenated content.
     *
     * @param spans the spans value to set.
     * @return the DocumentFootnote object itself.
     */
    public DocumentFootnote setSpans(List<DocumentSpan> spans) {
        this.spans = spans;
        return this;
    }
}