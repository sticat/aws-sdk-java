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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request structure for update App request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateApp" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAppRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique Id for an Amplify App.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * Name for an Amplify App.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Description for an Amplify App.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Platform for an Amplify App.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * IAM service role for an Amplify App.
     * </p>
     */
    private String iamServiceRoleArn;
    /**
     * <p>
     * Environment Variables for an Amplify App.
     * </p>
     */
    private java.util.Map<String, String> environmentVariables;
    /**
     * <p>
     * Enables branch auto-building for an Amplify App.
     * </p>
     */
    private Boolean enableBranchAutoBuild;
    /**
     * <p>
     * Enables Basic Authorization for an Amplify App.
     * </p>
     */
    private Boolean enableBasicAuth;
    /**
     * <p>
     * Basic Authorization credentials for an Amplify App.
     * </p>
     */
    private String basicAuthCredentials;
    /**
     * <p>
     * Custom redirect / rewrite rules for an Amplify App.
     * </p>
     */
    private java.util.List<CustomRule> customRules;
    /**
     * <p>
     * BuildSpec for an Amplify App.
     * </p>
     */
    private String buildSpec;
    /**
     * <p>
     * Enables automated branch creation for the Amplify App.
     * </p>
     */
    private Boolean enableAutoBranchCreation;
    /**
     * <p>
     * Automated branch creation glob patterns for the Amplify App.
     * </p>
     */
    private java.util.List<String> autoBranchCreationPatterns;
    /**
     * <p>
     * Automated branch creation branchConfig for the Amplify App.
     * </p>
     */
    private AutoBranchCreationConfig autoBranchCreationConfig;
    /**
     * <p>
     * Repository for an Amplify App
     * </p>
     */
    private String repository;
    /**
     * <p>
     * OAuth token for 3rd party source control system for an Amplify App, used to create webhook and read-only deploy
     * key. OAuth token is not stored.
     * </p>
     */
    private String oauthToken;
    /**
     * <p>
     * Personal Access token for 3rd party source control system for an Amplify App, used to create webhook and
     * read-only deploy key. Token is not stored.
     * </p>
     */
    private String accessToken;

    /**
     * <p>
     * Unique Id for an Amplify App.
     * </p>
     * 
     * @param appId
     *        Unique Id for an Amplify App.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * Unique Id for an Amplify App.
     * </p>
     * 
     * @return Unique Id for an Amplify App.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * Unique Id for an Amplify App.
     * </p>
     * 
     * @param appId
     *        Unique Id for an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * Name for an Amplify App.
     * </p>
     * 
     * @param name
     *        Name for an Amplify App.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name for an Amplify App.
     * </p>
     * 
     * @return Name for an Amplify App.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name for an Amplify App.
     * </p>
     * 
     * @param name
     *        Name for an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Description for an Amplify App.
     * </p>
     * 
     * @param description
     *        Description for an Amplify App.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description for an Amplify App.
     * </p>
     * 
     * @return Description for an Amplify App.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description for an Amplify App.
     * </p>
     * 
     * @param description
     *        Description for an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Platform for an Amplify App.
     * </p>
     * 
     * @param platform
     *        Platform for an Amplify App.
     * @see Platform
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * Platform for an Amplify App.
     * </p>
     * 
     * @return Platform for an Amplify App.
     * @see Platform
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * Platform for an Amplify App.
     * </p>
     * 
     * @param platform
     *        Platform for an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public UpdateAppRequest withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * Platform for an Amplify App.
     * </p>
     * 
     * @param platform
     *        Platform for an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public UpdateAppRequest withPlatform(Platform platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * IAM service role for an Amplify App.
     * </p>
     * 
     * @param iamServiceRoleArn
     *        IAM service role for an Amplify App.
     */

    public void setIamServiceRoleArn(String iamServiceRoleArn) {
        this.iamServiceRoleArn = iamServiceRoleArn;
    }

    /**
     * <p>
     * IAM service role for an Amplify App.
     * </p>
     * 
     * @return IAM service role for an Amplify App.
     */

    public String getIamServiceRoleArn() {
        return this.iamServiceRoleArn;
    }

    /**
     * <p>
     * IAM service role for an Amplify App.
     * </p>
     * 
     * @param iamServiceRoleArn
     *        IAM service role for an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest withIamServiceRoleArn(String iamServiceRoleArn) {
        setIamServiceRoleArn(iamServiceRoleArn);
        return this;
    }

    /**
     * <p>
     * Environment Variables for an Amplify App.
     * </p>
     * 
     * @return Environment Variables for an Amplify App.
     */

    public java.util.Map<String, String> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * <p>
     * Environment Variables for an Amplify App.
     * </p>
     * 
     * @param environmentVariables
     *        Environment Variables for an Amplify App.
     */

    public void setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    /**
     * <p>
     * Environment Variables for an Amplify App.
     * </p>
     * 
     * @param environmentVariables
     *        Environment Variables for an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest withEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        setEnvironmentVariables(environmentVariables);
        return this;
    }

    /**
     * Add a single EnvironmentVariables entry
     *
     * @see UpdateAppRequest#withEnvironmentVariables
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest addEnvironmentVariablesEntry(String key, String value) {
        if (null == this.environmentVariables) {
            this.environmentVariables = new java.util.HashMap<String, String>();
        }
        if (this.environmentVariables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.environmentVariables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EnvironmentVariables.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest clearEnvironmentVariablesEntries() {
        this.environmentVariables = null;
        return this;
    }

    /**
     * <p>
     * Enables branch auto-building for an Amplify App.
     * </p>
     * 
     * @param enableBranchAutoBuild
     *        Enables branch auto-building for an Amplify App.
     */

    public void setEnableBranchAutoBuild(Boolean enableBranchAutoBuild) {
        this.enableBranchAutoBuild = enableBranchAutoBuild;
    }

    /**
     * <p>
     * Enables branch auto-building for an Amplify App.
     * </p>
     * 
     * @return Enables branch auto-building for an Amplify App.
     */

    public Boolean getEnableBranchAutoBuild() {
        return this.enableBranchAutoBuild;
    }

    /**
     * <p>
     * Enables branch auto-building for an Amplify App.
     * </p>
     * 
     * @param enableBranchAutoBuild
     *        Enables branch auto-building for an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest withEnableBranchAutoBuild(Boolean enableBranchAutoBuild) {
        setEnableBranchAutoBuild(enableBranchAutoBuild);
        return this;
    }

    /**
     * <p>
     * Enables branch auto-building for an Amplify App.
     * </p>
     * 
     * @return Enables branch auto-building for an Amplify App.
     */

    public Boolean isEnableBranchAutoBuild() {
        return this.enableBranchAutoBuild;
    }

    /**
     * <p>
     * Enables Basic Authorization for an Amplify App.
     * </p>
     * 
     * @param enableBasicAuth
     *        Enables Basic Authorization for an Amplify App.
     */

    public void setEnableBasicAuth(Boolean enableBasicAuth) {
        this.enableBasicAuth = enableBasicAuth;
    }

    /**
     * <p>
     * Enables Basic Authorization for an Amplify App.
     * </p>
     * 
     * @return Enables Basic Authorization for an Amplify App.
     */

    public Boolean getEnableBasicAuth() {
        return this.enableBasicAuth;
    }

    /**
     * <p>
     * Enables Basic Authorization for an Amplify App.
     * </p>
     * 
     * @param enableBasicAuth
     *        Enables Basic Authorization for an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest withEnableBasicAuth(Boolean enableBasicAuth) {
        setEnableBasicAuth(enableBasicAuth);
        return this;
    }

    /**
     * <p>
     * Enables Basic Authorization for an Amplify App.
     * </p>
     * 
     * @return Enables Basic Authorization for an Amplify App.
     */

    public Boolean isEnableBasicAuth() {
        return this.enableBasicAuth;
    }

    /**
     * <p>
     * Basic Authorization credentials for an Amplify App.
     * </p>
     * 
     * @param basicAuthCredentials
     *        Basic Authorization credentials for an Amplify App.
     */

    public void setBasicAuthCredentials(String basicAuthCredentials) {
        this.basicAuthCredentials = basicAuthCredentials;
    }

    /**
     * <p>
     * Basic Authorization credentials for an Amplify App.
     * </p>
     * 
     * @return Basic Authorization credentials for an Amplify App.
     */

    public String getBasicAuthCredentials() {
        return this.basicAuthCredentials;
    }

    /**
     * <p>
     * Basic Authorization credentials for an Amplify App.
     * </p>
     * 
     * @param basicAuthCredentials
     *        Basic Authorization credentials for an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest withBasicAuthCredentials(String basicAuthCredentials) {
        setBasicAuthCredentials(basicAuthCredentials);
        return this;
    }

    /**
     * <p>
     * Custom redirect / rewrite rules for an Amplify App.
     * </p>
     * 
     * @return Custom redirect / rewrite rules for an Amplify App.
     */

    public java.util.List<CustomRule> getCustomRules() {
        return customRules;
    }

    /**
     * <p>
     * Custom redirect / rewrite rules for an Amplify App.
     * </p>
     * 
     * @param customRules
     *        Custom redirect / rewrite rules for an Amplify App.
     */

    public void setCustomRules(java.util.Collection<CustomRule> customRules) {
        if (customRules == null) {
            this.customRules = null;
            return;
        }

        this.customRules = new java.util.ArrayList<CustomRule>(customRules);
    }

    /**
     * <p>
     * Custom redirect / rewrite rules for an Amplify App.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomRules(java.util.Collection)} or {@link #withCustomRules(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param customRules
     *        Custom redirect / rewrite rules for an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest withCustomRules(CustomRule... customRules) {
        if (this.customRules == null) {
            setCustomRules(new java.util.ArrayList<CustomRule>(customRules.length));
        }
        for (CustomRule ele : customRules) {
            this.customRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Custom redirect / rewrite rules for an Amplify App.
     * </p>
     * 
     * @param customRules
     *        Custom redirect / rewrite rules for an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest withCustomRules(java.util.Collection<CustomRule> customRules) {
        setCustomRules(customRules);
        return this;
    }

    /**
     * <p>
     * BuildSpec for an Amplify App.
     * </p>
     * 
     * @param buildSpec
     *        BuildSpec for an Amplify App.
     */

    public void setBuildSpec(String buildSpec) {
        this.buildSpec = buildSpec;
    }

    /**
     * <p>
     * BuildSpec for an Amplify App.
     * </p>
     * 
     * @return BuildSpec for an Amplify App.
     */

    public String getBuildSpec() {
        return this.buildSpec;
    }

    /**
     * <p>
     * BuildSpec for an Amplify App.
     * </p>
     * 
     * @param buildSpec
     *        BuildSpec for an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest withBuildSpec(String buildSpec) {
        setBuildSpec(buildSpec);
        return this;
    }

    /**
     * <p>
     * Enables automated branch creation for the Amplify App.
     * </p>
     * 
     * @param enableAutoBranchCreation
     *        Enables automated branch creation for the Amplify App.
     */

    public void setEnableAutoBranchCreation(Boolean enableAutoBranchCreation) {
        this.enableAutoBranchCreation = enableAutoBranchCreation;
    }

    /**
     * <p>
     * Enables automated branch creation for the Amplify App.
     * </p>
     * 
     * @return Enables automated branch creation for the Amplify App.
     */

    public Boolean getEnableAutoBranchCreation() {
        return this.enableAutoBranchCreation;
    }

    /**
     * <p>
     * Enables automated branch creation for the Amplify App.
     * </p>
     * 
     * @param enableAutoBranchCreation
     *        Enables automated branch creation for the Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest withEnableAutoBranchCreation(Boolean enableAutoBranchCreation) {
        setEnableAutoBranchCreation(enableAutoBranchCreation);
        return this;
    }

    /**
     * <p>
     * Enables automated branch creation for the Amplify App.
     * </p>
     * 
     * @return Enables automated branch creation for the Amplify App.
     */

    public Boolean isEnableAutoBranchCreation() {
        return this.enableAutoBranchCreation;
    }

    /**
     * <p>
     * Automated branch creation glob patterns for the Amplify App.
     * </p>
     * 
     * @return Automated branch creation glob patterns for the Amplify App.
     */

    public java.util.List<String> getAutoBranchCreationPatterns() {
        return autoBranchCreationPatterns;
    }

    /**
     * <p>
     * Automated branch creation glob patterns for the Amplify App.
     * </p>
     * 
     * @param autoBranchCreationPatterns
     *        Automated branch creation glob patterns for the Amplify App.
     */

    public void setAutoBranchCreationPatterns(java.util.Collection<String> autoBranchCreationPatterns) {
        if (autoBranchCreationPatterns == null) {
            this.autoBranchCreationPatterns = null;
            return;
        }

        this.autoBranchCreationPatterns = new java.util.ArrayList<String>(autoBranchCreationPatterns);
    }

    /**
     * <p>
     * Automated branch creation glob patterns for the Amplify App.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutoBranchCreationPatterns(java.util.Collection)} or
     * {@link #withAutoBranchCreationPatterns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param autoBranchCreationPatterns
     *        Automated branch creation glob patterns for the Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest withAutoBranchCreationPatterns(String... autoBranchCreationPatterns) {
        if (this.autoBranchCreationPatterns == null) {
            setAutoBranchCreationPatterns(new java.util.ArrayList<String>(autoBranchCreationPatterns.length));
        }
        for (String ele : autoBranchCreationPatterns) {
            this.autoBranchCreationPatterns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Automated branch creation glob patterns for the Amplify App.
     * </p>
     * 
     * @param autoBranchCreationPatterns
     *        Automated branch creation glob patterns for the Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest withAutoBranchCreationPatterns(java.util.Collection<String> autoBranchCreationPatterns) {
        setAutoBranchCreationPatterns(autoBranchCreationPatterns);
        return this;
    }

    /**
     * <p>
     * Automated branch creation branchConfig for the Amplify App.
     * </p>
     * 
     * @param autoBranchCreationConfig
     *        Automated branch creation branchConfig for the Amplify App.
     */

    public void setAutoBranchCreationConfig(AutoBranchCreationConfig autoBranchCreationConfig) {
        this.autoBranchCreationConfig = autoBranchCreationConfig;
    }

    /**
     * <p>
     * Automated branch creation branchConfig for the Amplify App.
     * </p>
     * 
     * @return Automated branch creation branchConfig for the Amplify App.
     */

    public AutoBranchCreationConfig getAutoBranchCreationConfig() {
        return this.autoBranchCreationConfig;
    }

    /**
     * <p>
     * Automated branch creation branchConfig for the Amplify App.
     * </p>
     * 
     * @param autoBranchCreationConfig
     *        Automated branch creation branchConfig for the Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest withAutoBranchCreationConfig(AutoBranchCreationConfig autoBranchCreationConfig) {
        setAutoBranchCreationConfig(autoBranchCreationConfig);
        return this;
    }

    /**
     * <p>
     * Repository for an Amplify App
     * </p>
     * 
     * @param repository
     *        Repository for an Amplify App
     */

    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * <p>
     * Repository for an Amplify App
     * </p>
     * 
     * @return Repository for an Amplify App
     */

    public String getRepository() {
        return this.repository;
    }

    /**
     * <p>
     * Repository for an Amplify App
     * </p>
     * 
     * @param repository
     *        Repository for an Amplify App
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest withRepository(String repository) {
        setRepository(repository);
        return this;
    }

    /**
     * <p>
     * OAuth token for 3rd party source control system for an Amplify App, used to create webhook and read-only deploy
     * key. OAuth token is not stored.
     * </p>
     * 
     * @param oauthToken
     *        OAuth token for 3rd party source control system for an Amplify App, used to create webhook and read-only
     *        deploy key. OAuth token is not stored.
     */

    public void setOauthToken(String oauthToken) {
        this.oauthToken = oauthToken;
    }

    /**
     * <p>
     * OAuth token for 3rd party source control system for an Amplify App, used to create webhook and read-only deploy
     * key. OAuth token is not stored.
     * </p>
     * 
     * @return OAuth token for 3rd party source control system for an Amplify App, used to create webhook and read-only
     *         deploy key. OAuth token is not stored.
     */

    public String getOauthToken() {
        return this.oauthToken;
    }

    /**
     * <p>
     * OAuth token for 3rd party source control system for an Amplify App, used to create webhook and read-only deploy
     * key. OAuth token is not stored.
     * </p>
     * 
     * @param oauthToken
     *        OAuth token for 3rd party source control system for an Amplify App, used to create webhook and read-only
     *        deploy key. OAuth token is not stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest withOauthToken(String oauthToken) {
        setOauthToken(oauthToken);
        return this;
    }

    /**
     * <p>
     * Personal Access token for 3rd party source control system for an Amplify App, used to create webhook and
     * read-only deploy key. Token is not stored.
     * </p>
     * 
     * @param accessToken
     *        Personal Access token for 3rd party source control system for an Amplify App, used to create webhook and
     *        read-only deploy key. Token is not stored.
     */

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * Personal Access token for 3rd party source control system for an Amplify App, used to create webhook and
     * read-only deploy key. Token is not stored.
     * </p>
     * 
     * @return Personal Access token for 3rd party source control system for an Amplify App, used to create webhook and
     *         read-only deploy key. Token is not stored.
     */

    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * <p>
     * Personal Access token for 3rd party source control system for an Amplify App, used to create webhook and
     * read-only deploy key. Token is not stored.
     * </p>
     * 
     * @param accessToken
     *        Personal Access token for 3rd party source control system for an Amplify App, used to create webhook and
     *        read-only deploy key. Token is not stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppRequest withAccessToken(String accessToken) {
        setAccessToken(accessToken);
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
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getIamServiceRoleArn() != null)
            sb.append("IamServiceRoleArn: ").append(getIamServiceRoleArn()).append(",");
        if (getEnvironmentVariables() != null)
            sb.append("EnvironmentVariables: ").append(getEnvironmentVariables()).append(",");
        if (getEnableBranchAutoBuild() != null)
            sb.append("EnableBranchAutoBuild: ").append(getEnableBranchAutoBuild()).append(",");
        if (getEnableBasicAuth() != null)
            sb.append("EnableBasicAuth: ").append(getEnableBasicAuth()).append(",");
        if (getBasicAuthCredentials() != null)
            sb.append("BasicAuthCredentials: ").append(getBasicAuthCredentials()).append(",");
        if (getCustomRules() != null)
            sb.append("CustomRules: ").append(getCustomRules()).append(",");
        if (getBuildSpec() != null)
            sb.append("BuildSpec: ").append(getBuildSpec()).append(",");
        if (getEnableAutoBranchCreation() != null)
            sb.append("EnableAutoBranchCreation: ").append(getEnableAutoBranchCreation()).append(",");
        if (getAutoBranchCreationPatterns() != null)
            sb.append("AutoBranchCreationPatterns: ").append(getAutoBranchCreationPatterns()).append(",");
        if (getAutoBranchCreationConfig() != null)
            sb.append("AutoBranchCreationConfig: ").append(getAutoBranchCreationConfig()).append(",");
        if (getRepository() != null)
            sb.append("Repository: ").append(getRepository()).append(",");
        if (getOauthToken() != null)
            sb.append("OauthToken: ").append(getOauthToken()).append(",");
        if (getAccessToken() != null)
            sb.append("AccessToken: ").append(getAccessToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAppRequest == false)
            return false;
        UpdateAppRequest other = (UpdateAppRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getIamServiceRoleArn() == null ^ this.getIamServiceRoleArn() == null)
            return false;
        if (other.getIamServiceRoleArn() != null && other.getIamServiceRoleArn().equals(this.getIamServiceRoleArn()) == false)
            return false;
        if (other.getEnvironmentVariables() == null ^ this.getEnvironmentVariables() == null)
            return false;
        if (other.getEnvironmentVariables() != null && other.getEnvironmentVariables().equals(this.getEnvironmentVariables()) == false)
            return false;
        if (other.getEnableBranchAutoBuild() == null ^ this.getEnableBranchAutoBuild() == null)
            return false;
        if (other.getEnableBranchAutoBuild() != null && other.getEnableBranchAutoBuild().equals(this.getEnableBranchAutoBuild()) == false)
            return false;
        if (other.getEnableBasicAuth() == null ^ this.getEnableBasicAuth() == null)
            return false;
        if (other.getEnableBasicAuth() != null && other.getEnableBasicAuth().equals(this.getEnableBasicAuth()) == false)
            return false;
        if (other.getBasicAuthCredentials() == null ^ this.getBasicAuthCredentials() == null)
            return false;
        if (other.getBasicAuthCredentials() != null && other.getBasicAuthCredentials().equals(this.getBasicAuthCredentials()) == false)
            return false;
        if (other.getCustomRules() == null ^ this.getCustomRules() == null)
            return false;
        if (other.getCustomRules() != null && other.getCustomRules().equals(this.getCustomRules()) == false)
            return false;
        if (other.getBuildSpec() == null ^ this.getBuildSpec() == null)
            return false;
        if (other.getBuildSpec() != null && other.getBuildSpec().equals(this.getBuildSpec()) == false)
            return false;
        if (other.getEnableAutoBranchCreation() == null ^ this.getEnableAutoBranchCreation() == null)
            return false;
        if (other.getEnableAutoBranchCreation() != null && other.getEnableAutoBranchCreation().equals(this.getEnableAutoBranchCreation()) == false)
            return false;
        if (other.getAutoBranchCreationPatterns() == null ^ this.getAutoBranchCreationPatterns() == null)
            return false;
        if (other.getAutoBranchCreationPatterns() != null && other.getAutoBranchCreationPatterns().equals(this.getAutoBranchCreationPatterns()) == false)
            return false;
        if (other.getAutoBranchCreationConfig() == null ^ this.getAutoBranchCreationConfig() == null)
            return false;
        if (other.getAutoBranchCreationConfig() != null && other.getAutoBranchCreationConfig().equals(this.getAutoBranchCreationConfig()) == false)
            return false;
        if (other.getRepository() == null ^ this.getRepository() == null)
            return false;
        if (other.getRepository() != null && other.getRepository().equals(this.getRepository()) == false)
            return false;
        if (other.getOauthToken() == null ^ this.getOauthToken() == null)
            return false;
        if (other.getOauthToken() != null && other.getOauthToken().equals(this.getOauthToken()) == false)
            return false;
        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getIamServiceRoleArn() == null) ? 0 : getIamServiceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentVariables() == null) ? 0 : getEnvironmentVariables().hashCode());
        hashCode = prime * hashCode + ((getEnableBranchAutoBuild() == null) ? 0 : getEnableBranchAutoBuild().hashCode());
        hashCode = prime * hashCode + ((getEnableBasicAuth() == null) ? 0 : getEnableBasicAuth().hashCode());
        hashCode = prime * hashCode + ((getBasicAuthCredentials() == null) ? 0 : getBasicAuthCredentials().hashCode());
        hashCode = prime * hashCode + ((getCustomRules() == null) ? 0 : getCustomRules().hashCode());
        hashCode = prime * hashCode + ((getBuildSpec() == null) ? 0 : getBuildSpec().hashCode());
        hashCode = prime * hashCode + ((getEnableAutoBranchCreation() == null) ? 0 : getEnableAutoBranchCreation().hashCode());
        hashCode = prime * hashCode + ((getAutoBranchCreationPatterns() == null) ? 0 : getAutoBranchCreationPatterns().hashCode());
        hashCode = prime * hashCode + ((getAutoBranchCreationConfig() == null) ? 0 : getAutoBranchCreationConfig().hashCode());
        hashCode = prime * hashCode + ((getRepository() == null) ? 0 : getRepository().hashCode());
        hashCode = prime * hashCode + ((getOauthToken() == null) ? 0 : getOauthToken().hashCode());
        hashCode = prime * hashCode + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAppRequest clone() {
        return (UpdateAppRequest) super.clone();
    }

}
