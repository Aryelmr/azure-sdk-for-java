// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Route sections contain additional information about parts of a route. Each section contains at least the elements
 * `startPointIndex`, `endPointIndex`, and `sectionType`.
 */
@Fluent
public final class RouteSection {
    /*
     * Index of the first point (offset 0) in the route this section applies
     * to.
     */
    @JsonProperty(value = "startPointIndex", access = JsonProperty.Access.WRITE_ONLY)
    private Integer startPointIndex;

    /*
     * Index of the last point (offset 0) in the route this section applies to.
     */
    @JsonProperty(value = "endPointIndex", access = JsonProperty.Access.WRITE_ONLY)
    private Integer endPointIndex;

    /*
     * Section types of the reported route response
     */
    @JsonProperty(value = "sectionType", access = JsonProperty.Access.WRITE_ONLY)
    private RouteSectionType sectionType;

    /*
     * Travel mode for the calculated route. The value will be set to `other`
     * if the requested mode of transport is not possible in this section
     */
    @JsonProperty(value = "travelMode", access = JsonProperty.Access.WRITE_ONLY)
    private RouteTravelMode travelMode;

    /*
     * Type of the incident. Can currently be JAM, ROAD_WORK, ROAD_CLOSURE, or
     * OTHER. See "tec" for detailed information.
     */
    @JsonProperty(value = "simpleCategory", access = JsonProperty.Access.WRITE_ONLY)
    private RouteDelayReason simpleCategory;

    /*
     * Effective speed of the incident in km/h, averaged over its entire
     * length.
     */
    @JsonProperty(value = "effectiveSpeedInKmh", access = JsonProperty.Access.WRITE_ONLY)
    private Integer effectiveSpeedInKmh;

    /*
     * Delay in seconds caused by the incident.
     */
    @JsonProperty(value = "delayInSeconds", access = JsonProperty.Access.WRITE_ONLY)
    private Integer delayInSeconds;

    /*
     * The magnitude of delay caused by the incident. These values correspond
     * to the values of the response field ty of the [Get Traffic Incident
     * Detail
     * API](https://docs.microsoft.com/rest/api/maps/traffic/gettrafficincidentdetail).
     */
    @JsonProperty(value = "magnitudeOfDelay", access = JsonProperty.Access.WRITE_ONLY)
    private DelayMagnitude delayMagnitude;

    /*
     * Details of the traffic event, using definitions in the
     * [TPEG2-TEC](https://www.iso.org/standard/63116.html) standard. Can
     * contain effectCode and causes elements.
     */
    @JsonProperty(value = "tec")
    private RouteSectionTec tec;

    /**
     * Get the startPointIndex property: Index of the first point (offset 0) in the route this section applies to.
     *
     * @return the startPointIndex value.
     */
    public Integer getStartPointIndex() {
        return this.startPointIndex;
    }

    /**
     * Get the endPointIndex property: Index of the last point (offset 0) in the route this section applies to.
     *
     * @return the endPointIndex value.
     */
    public Integer getEndPointIndex() {
        return this.endPointIndex;
    }

    /**
     * Get the sectionType property: Section types of the reported route response.
     *
     * @return the sectionType value.
     */
    public RouteSectionType getSectionType() {
        return this.sectionType;
    }

    /**
     * Get the travelMode property: Travel mode for the calculated route. The value will be set to `other` if the
     * requested mode of transport is not possible in this section.
     *
     * @return the travelMode value.
     */
    public RouteTravelMode getTravelMode() {
        return this.travelMode;
    }

    /**
     * Get the simpleCategory property: Type of the incident. Can currently be JAM, ROAD_WORK, ROAD_CLOSURE, or OTHER.
     * See "tec" for detailed information.
     *
     * @return the simpleCategory value.
     */
    public RouteDelayReason getSimpleCategory() {
        return this.simpleCategory;
    }

    /**
     * Get the effectiveSpeedInKmh property: Effective speed of the incident in km/h, averaged over its entire length.
     *
     * @return the effectiveSpeedInKmh value.
     */
    public Integer getEffectiveSpeedInKmh() {
        return this.effectiveSpeedInKmh;
    }

    /**
     * Get the delayInSeconds property: Delay in seconds caused by the incident.
     *
     * @return the delayInSeconds value.
     */
    public Integer getDelayInSeconds() {
        return this.delayInSeconds;
    }

    /**
     * Get the delayMagnitude property: The magnitude of delay caused by the incident. These values correspond to the
     * values of the response field ty of the [Get Traffic Incident Detail
     * API](https://docs.microsoft.com/rest/api/maps/traffic/gettrafficincidentdetail).
     *
     * @return the delayMagnitude value.
     */
    public DelayMagnitude getDelayMagnitude() {
        return this.delayMagnitude;
    }

    /**
     * Get the tec property: Details of the traffic event, using definitions in the
     * [TPEG2-TEC](https://www.iso.org/standard/63116.html) standard. Can contain effectCode and causes elements.
     *
     * @return the tec value.
     */
    public RouteSectionTec getTec() {
        return this.tec;
    }

    /**
     * Set the tec property: Details of the traffic event, using definitions in the
     * [TPEG2-TEC](https://www.iso.org/standard/63116.html) standard. Can contain effectCode and causes elements.
     *
     * @param tec the tec value to set.
     * @return the RouteSection object itself.
     */
    public RouteSection setTec(RouteSectionTec tec) {
        this.tec = tec;
        return this;
    }
}