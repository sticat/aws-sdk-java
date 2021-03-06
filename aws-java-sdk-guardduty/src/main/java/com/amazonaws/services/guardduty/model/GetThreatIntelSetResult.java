/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetThreatIntelSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetThreatIntelSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A user-friendly ThreatIntelSet name displayed in all findings that are generated by activity that involves IP
     * addresses included in this ThreatIntelSet.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The format of the threatIntelSet.
     * </p>
     */
    private String format;
    /**
     * <p>
     * The URI of the file that contains the ThreatIntelSet.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The status of threatIntelSet file uploaded.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The tags of the threat list resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A user-friendly ThreatIntelSet name displayed in all findings that are generated by activity that involves IP
     * addresses included in this ThreatIntelSet.
     * </p>
     * 
     * @param name
     *        A user-friendly ThreatIntelSet name displayed in all findings that are generated by activity that involves
     *        IP addresses included in this ThreatIntelSet.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A user-friendly ThreatIntelSet name displayed in all findings that are generated by activity that involves IP
     * addresses included in this ThreatIntelSet.
     * </p>
     * 
     * @return A user-friendly ThreatIntelSet name displayed in all findings that are generated by activity that
     *         involves IP addresses included in this ThreatIntelSet.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A user-friendly ThreatIntelSet name displayed in all findings that are generated by activity that involves IP
     * addresses included in this ThreatIntelSet.
     * </p>
     * 
     * @param name
     *        A user-friendly ThreatIntelSet name displayed in all findings that are generated by activity that involves
     *        IP addresses included in this ThreatIntelSet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetThreatIntelSetResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The format of the threatIntelSet.
     * </p>
     * 
     * @param format
     *        The format of the threatIntelSet.
     * @see ThreatIntelSetFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the threatIntelSet.
     * </p>
     * 
     * @return The format of the threatIntelSet.
     * @see ThreatIntelSetFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the threatIntelSet.
     * </p>
     * 
     * @param format
     *        The format of the threatIntelSet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThreatIntelSetFormat
     */

    public GetThreatIntelSetResult withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format of the threatIntelSet.
     * </p>
     * 
     * @param format
     *        The format of the threatIntelSet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThreatIntelSetFormat
     */

    public GetThreatIntelSetResult withFormat(ThreatIntelSetFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The URI of the file that contains the ThreatIntelSet.
     * </p>
     * 
     * @param location
     *        The URI of the file that contains the ThreatIntelSet.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The URI of the file that contains the ThreatIntelSet.
     * </p>
     * 
     * @return The URI of the file that contains the ThreatIntelSet.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The URI of the file that contains the ThreatIntelSet.
     * </p>
     * 
     * @param location
     *        The URI of the file that contains the ThreatIntelSet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetThreatIntelSetResult withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The status of threatIntelSet file uploaded.
     * </p>
     * 
     * @param status
     *        The status of threatIntelSet file uploaded.
     * @see ThreatIntelSetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of threatIntelSet file uploaded.
     * </p>
     * 
     * @return The status of threatIntelSet file uploaded.
     * @see ThreatIntelSetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of threatIntelSet file uploaded.
     * </p>
     * 
     * @param status
     *        The status of threatIntelSet file uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThreatIntelSetStatus
     */

    public GetThreatIntelSetResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of threatIntelSet file uploaded.
     * </p>
     * 
     * @param status
     *        The status of threatIntelSet file uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThreatIntelSetStatus
     */

    public GetThreatIntelSetResult withStatus(ThreatIntelSetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The tags of the threat list resource.
     * </p>
     * 
     * @return The tags of the threat list resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of the threat list resource.
     * </p>
     * 
     * @param tags
     *        The tags of the threat list resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags of the threat list resource.
     * </p>
     * 
     * @param tags
     *        The tags of the threat list resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetThreatIntelSetResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetThreatIntelSetResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetThreatIntelSetResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetThreatIntelSetResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetThreatIntelSetResult == false)
            return false;
        GetThreatIntelSetResult other = (GetThreatIntelSetResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetThreatIntelSetResult clone() {
        try {
            return (GetThreatIntelSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
