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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateGraphqlApi" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGraphqlApiRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A user-supplied name for the <code>GraphqlApi</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon CloudWatch Logs configuration.
     * </p>
     */
    private LogConfig logConfig;
    /**
     * <p>
     * The authentication type: API key, AWS IAM, OIDC, or Amazon Cognito user pools.
     * </p>
     */
    private String authenticationType;
    /**
     * <p>
     * The Amazon Cognito user pool configuration.
     * </p>
     */
    private UserPoolConfig userPoolConfig;
    /**
     * <p>
     * The OpenID Connect configuration.
     * </p>
     */
    private OpenIDConnectConfig openIDConnectConfig;
    /**
     * <p>
     * A <code>TagMap</code> object.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * A list of additional authentication providers for the <code>GraphqlApi</code> API.
     * </p>
     */
    private java.util.List<AdditionalAuthenticationProvider> additionalAuthenticationProviders;

    /**
     * <p>
     * A user-supplied name for the <code>GraphqlApi</code>.
     * </p>
     * 
     * @param name
     *        A user-supplied name for the <code>GraphqlApi</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A user-supplied name for the <code>GraphqlApi</code>.
     * </p>
     * 
     * @return A user-supplied name for the <code>GraphqlApi</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A user-supplied name for the <code>GraphqlApi</code>.
     * </p>
     * 
     * @param name
     *        A user-supplied name for the <code>GraphqlApi</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGraphqlApiRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon CloudWatch Logs configuration.
     * </p>
     * 
     * @param logConfig
     *        The Amazon CloudWatch Logs configuration.
     */

    public void setLogConfig(LogConfig logConfig) {
        this.logConfig = logConfig;
    }

    /**
     * <p>
     * The Amazon CloudWatch Logs configuration.
     * </p>
     * 
     * @return The Amazon CloudWatch Logs configuration.
     */

    public LogConfig getLogConfig() {
        return this.logConfig;
    }

    /**
     * <p>
     * The Amazon CloudWatch Logs configuration.
     * </p>
     * 
     * @param logConfig
     *        The Amazon CloudWatch Logs configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGraphqlApiRequest withLogConfig(LogConfig logConfig) {
        setLogConfig(logConfig);
        return this;
    }

    /**
     * <p>
     * The authentication type: API key, AWS IAM, OIDC, or Amazon Cognito user pools.
     * </p>
     * 
     * @param authenticationType
     *        The authentication type: API key, AWS IAM, OIDC, or Amazon Cognito user pools.
     * @see AuthenticationType
     */

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    /**
     * <p>
     * The authentication type: API key, AWS IAM, OIDC, or Amazon Cognito user pools.
     * </p>
     * 
     * @return The authentication type: API key, AWS IAM, OIDC, or Amazon Cognito user pools.
     * @see AuthenticationType
     */

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * <p>
     * The authentication type: API key, AWS IAM, OIDC, or Amazon Cognito user pools.
     * </p>
     * 
     * @param authenticationType
     *        The authentication type: API key, AWS IAM, OIDC, or Amazon Cognito user pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public CreateGraphqlApiRequest withAuthenticationType(String authenticationType) {
        setAuthenticationType(authenticationType);
        return this;
    }

    /**
     * <p>
     * The authentication type: API key, AWS IAM, OIDC, or Amazon Cognito user pools.
     * </p>
     * 
     * @param authenticationType
     *        The authentication type: API key, AWS IAM, OIDC, or Amazon Cognito user pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public CreateGraphqlApiRequest withAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Cognito user pool configuration.
     * </p>
     * 
     * @param userPoolConfig
     *        The Amazon Cognito user pool configuration.
     */

    public void setUserPoolConfig(UserPoolConfig userPoolConfig) {
        this.userPoolConfig = userPoolConfig;
    }

    /**
     * <p>
     * The Amazon Cognito user pool configuration.
     * </p>
     * 
     * @return The Amazon Cognito user pool configuration.
     */

    public UserPoolConfig getUserPoolConfig() {
        return this.userPoolConfig;
    }

    /**
     * <p>
     * The Amazon Cognito user pool configuration.
     * </p>
     * 
     * @param userPoolConfig
     *        The Amazon Cognito user pool configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGraphqlApiRequest withUserPoolConfig(UserPoolConfig userPoolConfig) {
        setUserPoolConfig(userPoolConfig);
        return this;
    }

    /**
     * <p>
     * The OpenID Connect configuration.
     * </p>
     * 
     * @param openIDConnectConfig
     *        The OpenID Connect configuration.
     */

    public void setOpenIDConnectConfig(OpenIDConnectConfig openIDConnectConfig) {
        this.openIDConnectConfig = openIDConnectConfig;
    }

    /**
     * <p>
     * The OpenID Connect configuration.
     * </p>
     * 
     * @return The OpenID Connect configuration.
     */

    public OpenIDConnectConfig getOpenIDConnectConfig() {
        return this.openIDConnectConfig;
    }

    /**
     * <p>
     * The OpenID Connect configuration.
     * </p>
     * 
     * @param openIDConnectConfig
     *        The OpenID Connect configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGraphqlApiRequest withOpenIDConnectConfig(OpenIDConnectConfig openIDConnectConfig) {
        setOpenIDConnectConfig(openIDConnectConfig);
        return this;
    }

    /**
     * <p>
     * A <code>TagMap</code> object.
     * </p>
     * 
     * @return A <code>TagMap</code> object.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A <code>TagMap</code> object.
     * </p>
     * 
     * @param tags
     *        A <code>TagMap</code> object.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A <code>TagMap</code> object.
     * </p>
     * 
     * @param tags
     *        A <code>TagMap</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGraphqlApiRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public CreateGraphqlApiRequest addTagsEntry(String key, String value) {
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

    public CreateGraphqlApiRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A list of additional authentication providers for the <code>GraphqlApi</code> API.
     * </p>
     * 
     * @return A list of additional authentication providers for the <code>GraphqlApi</code> API.
     */

    public java.util.List<AdditionalAuthenticationProvider> getAdditionalAuthenticationProviders() {
        return additionalAuthenticationProviders;
    }

    /**
     * <p>
     * A list of additional authentication providers for the <code>GraphqlApi</code> API.
     * </p>
     * 
     * @param additionalAuthenticationProviders
     *        A list of additional authentication providers for the <code>GraphqlApi</code> API.
     */

    public void setAdditionalAuthenticationProviders(java.util.Collection<AdditionalAuthenticationProvider> additionalAuthenticationProviders) {
        if (additionalAuthenticationProviders == null) {
            this.additionalAuthenticationProviders = null;
            return;
        }

        this.additionalAuthenticationProviders = new java.util.ArrayList<AdditionalAuthenticationProvider>(additionalAuthenticationProviders);
    }

    /**
     * <p>
     * A list of additional authentication providers for the <code>GraphqlApi</code> API.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalAuthenticationProviders(java.util.Collection)} or
     * {@link #withAdditionalAuthenticationProviders(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param additionalAuthenticationProviders
     *        A list of additional authentication providers for the <code>GraphqlApi</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGraphqlApiRequest withAdditionalAuthenticationProviders(AdditionalAuthenticationProvider... additionalAuthenticationProviders) {
        if (this.additionalAuthenticationProviders == null) {
            setAdditionalAuthenticationProviders(new java.util.ArrayList<AdditionalAuthenticationProvider>(additionalAuthenticationProviders.length));
        }
        for (AdditionalAuthenticationProvider ele : additionalAuthenticationProviders) {
            this.additionalAuthenticationProviders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of additional authentication providers for the <code>GraphqlApi</code> API.
     * </p>
     * 
     * @param additionalAuthenticationProviders
     *        A list of additional authentication providers for the <code>GraphqlApi</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGraphqlApiRequest withAdditionalAuthenticationProviders(
            java.util.Collection<AdditionalAuthenticationProvider> additionalAuthenticationProviders) {
        setAdditionalAuthenticationProviders(additionalAuthenticationProviders);
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
        if (getLogConfig() != null)
            sb.append("LogConfig: ").append(getLogConfig()).append(",");
        if (getAuthenticationType() != null)
            sb.append("AuthenticationType: ").append(getAuthenticationType()).append(",");
        if (getUserPoolConfig() != null)
            sb.append("UserPoolConfig: ").append(getUserPoolConfig()).append(",");
        if (getOpenIDConnectConfig() != null)
            sb.append("OpenIDConnectConfig: ").append(getOpenIDConnectConfig()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getAdditionalAuthenticationProviders() != null)
            sb.append("AdditionalAuthenticationProviders: ").append(getAdditionalAuthenticationProviders());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGraphqlApiRequest == false)
            return false;
        CreateGraphqlApiRequest other = (CreateGraphqlApiRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLogConfig() == null ^ this.getLogConfig() == null)
            return false;
        if (other.getLogConfig() != null && other.getLogConfig().equals(this.getLogConfig()) == false)
            return false;
        if (other.getAuthenticationType() == null ^ this.getAuthenticationType() == null)
            return false;
        if (other.getAuthenticationType() != null && other.getAuthenticationType().equals(this.getAuthenticationType()) == false)
            return false;
        if (other.getUserPoolConfig() == null ^ this.getUserPoolConfig() == null)
            return false;
        if (other.getUserPoolConfig() != null && other.getUserPoolConfig().equals(this.getUserPoolConfig()) == false)
            return false;
        if (other.getOpenIDConnectConfig() == null ^ this.getOpenIDConnectConfig() == null)
            return false;
        if (other.getOpenIDConnectConfig() != null && other.getOpenIDConnectConfig().equals(this.getOpenIDConnectConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getAdditionalAuthenticationProviders() == null ^ this.getAdditionalAuthenticationProviders() == null)
            return false;
        if (other.getAdditionalAuthenticationProviders() != null
                && other.getAdditionalAuthenticationProviders().equals(this.getAdditionalAuthenticationProviders()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getLogConfig() == null) ? 0 : getLogConfig().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationType() == null) ? 0 : getAuthenticationType().hashCode());
        hashCode = prime * hashCode + ((getUserPoolConfig() == null) ? 0 : getUserPoolConfig().hashCode());
        hashCode = prime * hashCode + ((getOpenIDConnectConfig() == null) ? 0 : getOpenIDConnectConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getAdditionalAuthenticationProviders() == null) ? 0 : getAdditionalAuthenticationProviders().hashCode());
        return hashCode;
    }

    @Override
    public CreateGraphqlApiRequest clone() {
        return (CreateGraphqlApiRequest) super.clone();
    }

}
