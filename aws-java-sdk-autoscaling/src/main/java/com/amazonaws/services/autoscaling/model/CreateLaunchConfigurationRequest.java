/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#createLaunchConfiguration(CreateLaunchConfigurationRequest) CreateLaunchConfiguration operation}.
 * <p>
 * Creates a launch configuration.
 * </p>
 * <p>
 * If you exceed your maximum limit of launch configurations, which by
 * default is 100 per region, the call fails. For information about
 * viewing and updating these limits, see DescribeAccountLimits.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#createLaunchConfiguration(CreateLaunchConfigurationRequest)
 */
public class CreateLaunchConfigurationRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the launch configuration. This name must be unique within
     * the scope of your AWS account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String launchConfigurationName;

    /**
     * The ID of the Amazon Machine Image (AMI) to use to launch your EC2
     * instances. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding
     * an AMI</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String imageId;

    /**
     * The name of the key pair. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Amazon
     * EC2 Key Pairs</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String keyName;

    /**
     * One or more security groups with which to associate the instances.
     * <p>If your instances are launched in EC2-Classic, you can either
     * specify security group names or the security group IDs. For more
     * information about security groups for EC2-Classic, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html">Amazon
     * EC2 Security Groups</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>. <p>If your instances are launched in a VPC, specify
     * security group IDs. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security
     * Groups for Your VPC</a> in the <i>Amazon Virtual Private Cloud User
     * Guide</i>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroups;

    /**
     * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances
     * to. This parameter can only be used if you are launching EC2-Classic
     * instances. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String classicLinkVPCId;

    /**
     * The IDs of one or more security groups for the VPC specified in
     * <code>ClassicLinkVPCId</code>. This parameter is required if
     * <code>ClassicLinkVPCId</code> is specified, and cannot be used
     * otherwise. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> classicLinkVPCSecurityGroups;

    /**
     * The user data to make available to the launched EC2 instances. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance
     * Metadata and User Data</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>. <note>At this time, launch configurations don't support
     * compressed (zipped) user data files.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 21847<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String userData;

    /**
     * The ID of the EC2 instance to use to create the launch configuration.
     * <p>The new launch configuration derives attributes from the instance,
     * with the exception of the block device mapping. <p>To create a launch
     * configuration with a block device mapping or override any other
     * instance attributes, specify them as part of the same request. <p>For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-lc-with-instanceID.html">Create
     * a Launch Configuration Using an EC2 Instance</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String instanceId;

    /**
     * The instance type of the Amazon EC2 instance. For information about
     * available Amazon EC2 instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes">
     * Available Instance Types</a> in the <i>Amazon Elastic Cloud Compute
     * User Guide.</i>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String instanceType;

    /**
     * The ID of the kernel associated with the Amazon EC2 AMI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String kernelId;

    /**
     * The ID of the RAM disk associated with the Amazon EC2 AMI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String ramdiskId;

    /**
     * One or more mappings that specify how block devices are exposed to the
     * instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block
     * Device Mapping</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping> blockDeviceMappings;

    /**
     * Enables detailed monitoring if it is disabled. Detailed monitoring is
     * enabled by default. <p>When detailed monitoring is enabled, Amazon
     * Cloudwatch generates metrics every minute and your account is charged
     * a fee. When you disable detailed monitoring, by specifying
     * <code>False</code>, Cloudwatch generates metrics every 5 minutes. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-instance-monitoring.html">Monitor
     * Your Auto Scaling Instances</a> in the <i>Auto Scaling Developer
     * Guide</i>.
     */
    private InstanceMonitoring instanceMonitoring;

    /**
     * The maximum hourly price to be paid for any Spot Instance launched to
     * fulfill the request. Spot Instances are launched when the price you
     * specify exceeds the current Spot market price. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US-SpotInstances.html">Launch
     * Spot Instances in Your Auto Scaling Group</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String spotPrice;

    /**
     * The name or the Amazon Resource Name (ARN) of the instance profile
     * associated with the IAM role for the instance. <p>Amazon EC2 instances
     * launched with an IAM role will automatically have AWS security
     * credentials available. You can use IAM roles with Auto Scaling to
     * automatically enable applications running on your Amazon EC2 instances
     * to securely access other AWS resources. For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-iam-role.html">Launch
     * Auto Scaling Instances with an IAM Role</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String iamInstanceProfile;

    /**
     * Indicates whether the instance is optimized for Amazon EBS I/O. By
     * default, the instance is not optimized for EBS I/O. The optimization
     * provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal I/O performance. This
     * optimization is not available with all instance types. Additional
     * usage charges apply. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon
     * EBS-Optimized Instances</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     */
    private Boolean ebsOptimized;

    /**
     * Used for groups that launch instances into a virtual private cloud
     * (VPC). Specifies whether to assign a public IP address to each
     * instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html">Auto
     * Scaling and Amazon VPC</a> in the <i>Auto Scaling Developer Guide</i>.
     * <note> <p>If you specify a value for this parameter, be sure to
     * specify at least one subnet using the <i>VPCZoneIdentifier</i>
     * parameter when you create your group. </note> <p>Default: If the
     * instance is launched into a default subnet, the default is
     * <code>true</code>. If the instance is launched into a nondefault
     * subnet, the default is <code>false</code>. For more information, see
     * <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide//as-supported-platforms.html">Supported
     * Platforms</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */
    private Boolean associatePublicIpAddress;

    /**
     * The tenancy of the instance. An instance with a tenancy of
     * <code>dedicated</code> runs on single-tenant hardware and can only be
     * launched in a VPC. <p>You must set the value of this parameter to
     * <code>dedicated</code> if want to launch Dedicated Instances in a
     * shared tenancy VPC (VPC with instance placement tenancy attribute set
     * to <code>default</code>). <p>If you specify a value for this
     * parameter, be sure to specify at least one VPC subnet using the
     * <i>VPCZoneIdentifier</i> parameter when you create your group. <p>For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html">Auto
     * Scaling and Amazon VPC</a> in the <i>Auto Scaling Developer Guide</i>.
     * <p>Valid values: <code>default</code> | <code>dedicated</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String placementTenancy;

    /**
     * The name of the launch configuration. This name must be unique within
     * the scope of your AWS account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The name of the launch configuration. This name must be unique within
     *         the scope of your AWS account.
     */
    public String getLaunchConfigurationName() {
        return launchConfigurationName;
    }
    
    /**
     * The name of the launch configuration. This name must be unique within
     * the scope of your AWS account.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param launchConfigurationName The name of the launch configuration. This name must be unique within
     *         the scope of your AWS account.
     */
    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }
    
    /**
     * The name of the launch configuration. This name must be unique within
     * the scope of your AWS account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param launchConfigurationName The name of the launch configuration. This name must be unique within
     *         the scope of your AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLaunchConfigurationRequest withLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
        return this;
    }

    /**
     * The ID of the Amazon Machine Image (AMI) to use to launch your EC2
     * instances. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding
     * an AMI</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The ID of the Amazon Machine Image (AMI) to use to launch your EC2
     *         instances. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding
     *         an AMI</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */
    public String getImageId() {
        return imageId;
    }
    
    /**
     * The ID of the Amazon Machine Image (AMI) to use to launch your EC2
     * instances. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding
     * an AMI</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param imageId The ID of the Amazon Machine Image (AMI) to use to launch your EC2
     *         instances. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding
     *         an AMI</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    
    /**
     * The ID of the Amazon Machine Image (AMI) to use to launch your EC2
     * instances. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding
     * an AMI</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param imageId The ID of the Amazon Machine Image (AMI) to use to launch your EC2
     *         instances. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding
     *         an AMI</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLaunchConfigurationRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * The name of the key pair. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Amazon
     * EC2 Key Pairs</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The name of the key pair. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Amazon
     *         EC2 Key Pairs</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */
    public String getKeyName() {
        return keyName;
    }
    
    /**
     * The name of the key pair. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Amazon
     * EC2 Key Pairs</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param keyName The name of the key pair. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Amazon
     *         EC2 Key Pairs</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }
    
    /**
     * The name of the key pair. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Amazon
     * EC2 Key Pairs</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param keyName The name of the key pair. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Amazon
     *         EC2 Key Pairs</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLaunchConfigurationRequest withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * One or more security groups with which to associate the instances.
     * <p>If your instances are launched in EC2-Classic, you can either
     * specify security group names or the security group IDs. For more
     * information about security groups for EC2-Classic, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html">Amazon
     * EC2 Security Groups</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>. <p>If your instances are launched in a VPC, specify
     * security group IDs. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security
     * Groups for Your VPC</a> in the <i>Amazon Virtual Private Cloud User
     * Guide</i>.
     *
     * @return One or more security groups with which to associate the instances.
     *         <p>If your instances are launched in EC2-Classic, you can either
     *         specify security group names or the security group IDs. For more
     *         information about security groups for EC2-Classic, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html">Amazon
     *         EC2 Security Groups</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>. <p>If your instances are launched in a VPC, specify
     *         security group IDs. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security
     *         Groups for Your VPC</a> in the <i>Amazon Virtual Private Cloud User
     *         Guide</i>.
     */
    public java.util.List<String> getSecurityGroups() {
        if (securityGroups == null) {
              securityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              securityGroups.setAutoConstruct(true);
        }
        return securityGroups;
    }
    
    /**
     * One or more security groups with which to associate the instances.
     * <p>If your instances are launched in EC2-Classic, you can either
     * specify security group names or the security group IDs. For more
     * information about security groups for EC2-Classic, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html">Amazon
     * EC2 Security Groups</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>. <p>If your instances are launched in a VPC, specify
     * security group IDs. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security
     * Groups for Your VPC</a> in the <i>Amazon Virtual Private Cloud User
     * Guide</i>.
     *
     * @param securityGroups One or more security groups with which to associate the instances.
     *         <p>If your instances are launched in EC2-Classic, you can either
     *         specify security group names or the security group IDs. For more
     *         information about security groups for EC2-Classic, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html">Amazon
     *         EC2 Security Groups</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>. <p>If your instances are launched in a VPC, specify
     *         security group IDs. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security
     *         Groups for Your VPC</a> in the <i>Amazon Virtual Private Cloud User
     *         Guide</i>.
     */
    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(securityGroups.size());
        securityGroupsCopy.addAll(securityGroups);
        this.securityGroups = securityGroupsCopy;
    }
    
    /**
     * One or more security groups with which to associate the instances.
     * <p>If your instances are launched in EC2-Classic, you can either
     * specify security group names or the security group IDs. For more
     * information about security groups for EC2-Classic, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html">Amazon
     * EC2 Security Groups</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>. <p>If your instances are launched in a VPC, specify
     * security group IDs. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security
     * Groups for Your VPC</a> in the <i>Amazon Virtual Private Cloud User
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups One or more security groups with which to associate the instances.
     *         <p>If your instances are launched in EC2-Classic, you can either
     *         specify security group names or the security group IDs. For more
     *         information about security groups for EC2-Classic, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html">Amazon
     *         EC2 Security Groups</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>. <p>If your instances are launched in a VPC, specify
     *         security group IDs. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security
     *         Groups for Your VPC</a> in the <i>Amazon Virtual Private Cloud User
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLaunchConfigurationRequest withSecurityGroups(String... securityGroups) {
        if (getSecurityGroups() == null) setSecurityGroups(new java.util.ArrayList<String>(securityGroups.length));
        for (String value : securityGroups) {
            getSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * One or more security groups with which to associate the instances.
     * <p>If your instances are launched in EC2-Classic, you can either
     * specify security group names or the security group IDs. For more
     * information about security groups for EC2-Classic, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html">Amazon
     * EC2 Security Groups</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>. <p>If your instances are launched in a VPC, specify
     * security group IDs. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security
     * Groups for Your VPC</a> in the <i>Amazon Virtual Private Cloud User
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups One or more security groups with which to associate the instances.
     *         <p>If your instances are launched in EC2-Classic, you can either
     *         specify security group names or the security group IDs. For more
     *         information about security groups for EC2-Classic, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html">Amazon
     *         EC2 Security Groups</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>. <p>If your instances are launched in a VPC, specify
     *         security group IDs. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html">Security
     *         Groups for Your VPC</a> in the <i>Amazon Virtual Private Cloud User
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLaunchConfigurationRequest withSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(securityGroups.size());
            securityGroupsCopy.addAll(securityGroups);
            this.securityGroups = securityGroupsCopy;
        }

        return this;
    }

    /**
     * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances
     * to. This parameter can only be used if you are launching EC2-Classic
     * instances. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances
     *         to. This parameter can only be used if you are launching EC2-Classic
     *         instances. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a>
     *         in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */
    public String getClassicLinkVPCId() {
        return classicLinkVPCId;
    }
    
    /**
     * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances
     * to. This parameter can only be used if you are launching EC2-Classic
     * instances. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param classicLinkVPCId The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances
     *         to. This parameter can only be used if you are launching EC2-Classic
     *         instances. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a>
     *         in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */
    public void setClassicLinkVPCId(String classicLinkVPCId) {
        this.classicLinkVPCId = classicLinkVPCId;
    }
    
    /**
     * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances
     * to. This parameter can only be used if you are launching EC2-Classic
     * instances. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param classicLinkVPCId The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances
     *         to. This parameter can only be used if you are launching EC2-Classic
     *         instances. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a>
     *         in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLaunchConfigurationRequest withClassicLinkVPCId(String classicLinkVPCId) {
        this.classicLinkVPCId = classicLinkVPCId;
        return this;
    }

    /**
     * The IDs of one or more security groups for the VPC specified in
     * <code>ClassicLinkVPCId</code>. This parameter is required if
     * <code>ClassicLinkVPCId</code> is specified, and cannot be used
     * otherwise. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *
     * @return The IDs of one or more security groups for the VPC specified in
     *         <code>ClassicLinkVPCId</code>. This parameter is required if
     *         <code>ClassicLinkVPCId</code> is specified, and cannot be used
     *         otherwise. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a>
     *         in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */
    public java.util.List<String> getClassicLinkVPCSecurityGroups() {
        if (classicLinkVPCSecurityGroups == null) {
              classicLinkVPCSecurityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              classicLinkVPCSecurityGroups.setAutoConstruct(true);
        }
        return classicLinkVPCSecurityGroups;
    }
    
    /**
     * The IDs of one or more security groups for the VPC specified in
     * <code>ClassicLinkVPCId</code>. This parameter is required if
     * <code>ClassicLinkVPCId</code> is specified, and cannot be used
     * otherwise. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *
     * @param classicLinkVPCSecurityGroups The IDs of one or more security groups for the VPC specified in
     *         <code>ClassicLinkVPCId</code>. This parameter is required if
     *         <code>ClassicLinkVPCId</code> is specified, and cannot be used
     *         otherwise. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a>
     *         in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */
    public void setClassicLinkVPCSecurityGroups(java.util.Collection<String> classicLinkVPCSecurityGroups) {
        if (classicLinkVPCSecurityGroups == null) {
            this.classicLinkVPCSecurityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> classicLinkVPCSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(classicLinkVPCSecurityGroups.size());
        classicLinkVPCSecurityGroupsCopy.addAll(classicLinkVPCSecurityGroups);
        this.classicLinkVPCSecurityGroups = classicLinkVPCSecurityGroupsCopy;
    }
    
    /**
     * The IDs of one or more security groups for the VPC specified in
     * <code>ClassicLinkVPCId</code>. This parameter is required if
     * <code>ClassicLinkVPCId</code> is specified, and cannot be used
     * otherwise. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param classicLinkVPCSecurityGroups The IDs of one or more security groups for the VPC specified in
     *         <code>ClassicLinkVPCId</code>. This parameter is required if
     *         <code>ClassicLinkVPCId</code> is specified, and cannot be used
     *         otherwise. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a>
     *         in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLaunchConfigurationRequest withClassicLinkVPCSecurityGroups(String... classicLinkVPCSecurityGroups) {
        if (getClassicLinkVPCSecurityGroups() == null) setClassicLinkVPCSecurityGroups(new java.util.ArrayList<String>(classicLinkVPCSecurityGroups.length));
        for (String value : classicLinkVPCSecurityGroups) {
            getClassicLinkVPCSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * The IDs of one or more security groups for the VPC specified in
     * <code>ClassicLinkVPCId</code>. This parameter is required if
     * <code>ClassicLinkVPCId</code> is specified, and cannot be used
     * otherwise. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param classicLinkVPCSecurityGroups The IDs of one or more security groups for the VPC specified in
     *         <code>ClassicLinkVPCId</code>. This parameter is required if
     *         <code>ClassicLinkVPCId</code> is specified, and cannot be used
     *         otherwise. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html">ClassicLink</a>
     *         in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLaunchConfigurationRequest withClassicLinkVPCSecurityGroups(java.util.Collection<String> classicLinkVPCSecurityGroups) {
        if (classicLinkVPCSecurityGroups == null) {
            this.classicLinkVPCSecurityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> classicLinkVPCSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(classicLinkVPCSecurityGroups.size());
            classicLinkVPCSecurityGroupsCopy.addAll(classicLinkVPCSecurityGroups);
            this.classicLinkVPCSecurityGroups = classicLinkVPCSecurityGroupsCopy;
        }

        return this;
    }

    /**
     * The user data to make available to the launched EC2 instances. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance
     * Metadata and User Data</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>. <note>At this time, launch configurations don't support
     * compressed (zipped) user data files.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 21847<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The user data to make available to the launched EC2 instances. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance
     *         Metadata and User Data</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>. <note>At this time, launch configurations don't support
     *         compressed (zipped) user data files.</note>
     */
    public String getUserData() {
        return userData;
    }
    
    /**
     * The user data to make available to the launched EC2 instances. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance
     * Metadata and User Data</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>. <note>At this time, launch configurations don't support
     * compressed (zipped) user data files.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 21847<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param userData The user data to make available to the launched EC2 instances. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance
     *         Metadata and User Data</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>. <note>At this time, launch configurations don't support
     *         compressed (zipped) user data files.</note>
     */
    public void setUserData(String userData) {
        this.userData = userData;
    }
    
    /**
     * The user data to make available to the launched EC2 instances. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance
     * Metadata and User Data</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>. <note>At this time, launch configurations don't support
     * compressed (zipped) user data files.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 21847<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param userData The user data to make available to the launched EC2 instances. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance
     *         Metadata and User Data</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>. <note>At this time, launch configurations don't support
     *         compressed (zipped) user data files.</note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLaunchConfigurationRequest withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * The ID of the EC2 instance to use to create the launch configuration.
     * <p>The new launch configuration derives attributes from the instance,
     * with the exception of the block device mapping. <p>To create a launch
     * configuration with a block device mapping or override any other
     * instance attributes, specify them as part of the same request. <p>For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-lc-with-instanceID.html">Create
     * a Launch Configuration Using an EC2 Instance</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The ID of the EC2 instance to use to create the launch configuration.
     *         <p>The new launch configuration derives attributes from the instance,
     *         with the exception of the block device mapping. <p>To create a launch
     *         configuration with a block device mapping or override any other
     *         instance attributes, specify them as part of the same request. <p>For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-lc-with-instanceID.html">Create
     *         a Launch Configuration Using an EC2 Instance</a> in the <i>Auto
     *         Scaling Developer Guide</i>.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the EC2 instance to use to create the launch configuration.
     * <p>The new launch configuration derives attributes from the instance,
     * with the exception of the block device mapping. <p>To create a launch
     * configuration with a block device mapping or override any other
     * instance attributes, specify them as part of the same request. <p>For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-lc-with-instanceID.html">Create
     * a Launch Configuration Using an EC2 Instance</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param instanceId The ID of the EC2 instance to use to create the launch configuration.
     *         <p>The new launch configuration derives attributes from the instance,
     *         with the exception of the block device mapping. <p>To create a launch
     *         configuration with a block device mapping or override any other
     *         instance attributes, specify them as part of the same request. <p>For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-lc-with-instanceID.html">Create
     *         a Launch Configuration Using an EC2 Instance</a> in the <i>Auto
     *         Scaling Developer Guide</i>.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the EC2 instance to use to create the launch configuration.
     * <p>The new launch configuration derives attributes from the instance,
     * with the exception of the block device mapping. <p>To create a launch
     * configuration with a block device mapping or override any other
     * instance attributes, specify them as part of the same request. <p>For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-lc-with-instanceID.html">Create
     * a Launch Configuration Using an EC2 Instance</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param instanceId The ID of the EC2 instance to use to create the launch configuration.
     *         <p>The new launch configuration derives attributes from the instance,
     *         with the exception of the block device mapping. <p>To create a launch
     *         configuration with a block device mapping or override any other
     *         instance attributes, specify them as part of the same request. <p>For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-lc-with-instanceID.html">Create
     *         a Launch Configuration Using an EC2 Instance</a> in the <i>Auto
     *         Scaling Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLaunchConfigurationRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The instance type of the Amazon EC2 instance. For information about
     * available Amazon EC2 instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes">
     * Available Instance Types</a> in the <i>Amazon Elastic Cloud Compute
     * User Guide.</i>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The instance type of the Amazon EC2 instance. For information about
     *         available Amazon EC2 instance types, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes">
     *         Available Instance Types</a> in the <i>Amazon Elastic Cloud Compute
     *         User Guide.</i>
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type of the Amazon EC2 instance. For information about
     * available Amazon EC2 instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes">
     * Available Instance Types</a> in the <i>Amazon Elastic Cloud Compute
     * User Guide.</i>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param instanceType The instance type of the Amazon EC2 instance. For information about
     *         available Amazon EC2 instance types, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes">
     *         Available Instance Types</a> in the <i>Amazon Elastic Cloud Compute
     *         User Guide.</i>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type of the Amazon EC2 instance. For information about
     * available Amazon EC2 instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes">
     * Available Instance Types</a> in the <i>Amazon Elastic Cloud Compute
     * User Guide.</i>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param instanceType The instance type of the Amazon EC2 instance. For information about
     *         available Amazon EC2 instance types, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes">
     *         Available Instance Types</a> in the <i>Amazon Elastic Cloud Compute
     *         User Guide.</i>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLaunchConfigurationRequest withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * The ID of the kernel associated with the Amazon EC2 AMI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The ID of the kernel associated with the Amazon EC2 AMI.
     */
    public String getKernelId() {
        return kernelId;
    }
    
    /**
     * The ID of the kernel associated with the Amazon EC2 AMI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param kernelId The ID of the kernel associated with the Amazon EC2 AMI.
     */
    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }
    
    /**
     * The ID of the kernel associated with the Amazon EC2 AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param kernelId The ID of the kernel associated with the Amazon EC2 AMI.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLaunchConfigurationRequest withKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    /**
     * The ID of the RAM disk associated with the Amazon EC2 AMI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The ID of the RAM disk associated with the Amazon EC2 AMI.
     */
    public String getRamdiskId() {
        return ramdiskId;
    }
    
    /**
     * The ID of the RAM disk associated with the Amazon EC2 AMI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param ramdiskId The ID of the RAM disk associated with the Amazon EC2 AMI.
     */
    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }
    
    /**
     * The ID of the RAM disk associated with the Amazon EC2 AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param ramdiskId The ID of the RAM disk associated with the Amazon EC2 AMI.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLaunchConfigurationRequest withRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
        return this;
    }

    /**
     * One or more mappings that specify how block devices are exposed to the
     * instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block
     * Device Mapping</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     *
     * @return One or more mappings that specify how block devices are exposed to the
     *         instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block
     *         Device Mapping</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */
    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
              blockDeviceMappings = new com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping>();
              blockDeviceMappings.setAutoConstruct(true);
        }
        return blockDeviceMappings;
    }
    
    /**
     * One or more mappings that specify how block devices are exposed to the
     * instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block
     * Device Mapping</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     *
     * @param blockDeviceMappings One or more mappings that specify how block devices are exposed to the
     *         instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block
     *         Device Mapping</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */
    public void setBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping> blockDeviceMappingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping>(blockDeviceMappings.size());
        blockDeviceMappingsCopy.addAll(blockDeviceMappings);
        this.blockDeviceMappings = blockDeviceMappingsCopy;
    }
    
    /**
     * One or more mappings that specify how block devices are exposed to the
     * instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block
     * Device Mapping</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings One or more mappings that specify how block devices are exposed to the
     *         instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block
     *         Device Mapping</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLaunchConfigurationRequest withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
        if (getBlockDeviceMappings() == null) setBlockDeviceMappings(new java.util.ArrayList<BlockDeviceMapping>(blockDeviceMappings.length));
        for (BlockDeviceMapping value : blockDeviceMappings) {
            getBlockDeviceMappings().add(value);
        }
        return this;
    }
    
    /**
     * One or more mappings that specify how block devices are exposed to the
     * instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block
     * Device Mapping</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings One or more mappings that specify how block devices are exposed to the
     *         instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block
     *         Device Mapping</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLaunchConfigurationRequest withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping> blockDeviceMappingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping>(blockDeviceMappings.size());
            blockDeviceMappingsCopy.addAll(blockDeviceMappings);
            this.blockDeviceMappings = blockDeviceMappingsCopy;
        }

        return this;
    }

    /**
     * Enables detailed monitoring if it is disabled. Detailed monitoring is
     * enabled by default. <p>When detailed monitoring is enabled, Amazon
     * Cloudwatch generates metrics every minute and your account is charged
     * a fee. When you disable detailed monitoring, by specifying
     * <code>False</code>, Cloudwatch generates metrics every 5 minutes. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-instance-monitoring.html">Monitor
     * Your Auto Scaling Instances</a> in the <i>Auto Scaling Developer
     * Guide</i>.
     *
     * @return Enables detailed monitoring if it is disabled. Detailed monitoring is
     *         enabled by default. <p>When detailed monitoring is enabled, Amazon
     *         Cloudwatch generates metrics every minute and your account is charged
     *         a fee. When you disable detailed monitoring, by specifying
     *         <code>False</code>, Cloudwatch generates metrics every 5 minutes. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-instance-monitoring.html">Monitor
     *         Your Auto Scaling Instances</a> in the <i>Auto Scaling Developer
     *         Guide</i>.
     */
    public InstanceMonitoring getInstanceMonitoring() {
        return instanceMonitoring;
    }
    
    /**
     * Enables detailed monitoring if it is disabled. Detailed monitoring is
     * enabled by default. <p>When detailed monitoring is enabled, Amazon
     * Cloudwatch generates metrics every minute and your account is charged
     * a fee. When you disable detailed monitoring, by specifying
     * <code>False</code>, Cloudwatch generates metrics every 5 minutes. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-instance-monitoring.html">Monitor
     * Your Auto Scaling Instances</a> in the <i>Auto Scaling Developer
     * Guide</i>.
     *
     * @param instanceMonitoring Enables detailed monitoring if it is disabled. Detailed monitoring is
     *         enabled by default. <p>When detailed monitoring is enabled, Amazon
     *         Cloudwatch generates metrics every minute and your account is charged
     *         a fee. When you disable detailed monitoring, by specifying
     *         <code>False</code>, Cloudwatch generates metrics every 5 minutes. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-instance-monitoring.html">Monitor
     *         Your Auto Scaling Instances</a> in the <i>Auto Scaling Developer
     *         Guide</i>.
     */
    public void setInstanceMonitoring(InstanceMonitoring instanceMonitoring) {
        this.instanceMonitoring = instanceMonitoring;
    }
    
    /**
     * Enables detailed monitoring if it is disabled. Detailed monitoring is
     * enabled by default. <p>When detailed monitoring is enabled, Amazon
     * Cloudwatch generates metrics every minute and your account is charged
     * a fee. When you disable detailed monitoring, by specifying
     * <code>False</code>, Cloudwatch generates metrics every 5 minutes. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-instance-monitoring.html">Monitor
     * Your Auto Scaling Instances</a> in the <i>Auto Scaling Developer
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceMonitoring Enables detailed monitoring if it is disabled. Detailed monitoring is
     *         enabled by default. <p>When detailed monitoring is enabled, Amazon
     *         Cloudwatch generates metrics every minute and your account is charged
     *         a fee. When you disable detailed monitoring, by specifying
     *         <code>False</code>, Cloudwatch generates metrics every 5 minutes. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-instance-monitoring.html">Monitor
     *         Your Auto Scaling Instances</a> in the <i>Auto Scaling Developer
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLaunchConfigurationRequest withInstanceMonitoring(InstanceMonitoring instanceMonitoring) {
        this.instanceMonitoring = instanceMonitoring;
        return this;
    }

    /**
     * The maximum hourly price to be paid for any Spot Instance launched to
     * fulfill the request. Spot Instances are launched when the price you
     * specify exceeds the current Spot market price. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US-SpotInstances.html">Launch
     * Spot Instances in Your Auto Scaling Group</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The maximum hourly price to be paid for any Spot Instance launched to
     *         fulfill the request. Spot Instances are launched when the price you
     *         specify exceeds the current Spot market price. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US-SpotInstances.html">Launch
     *         Spot Instances in Your Auto Scaling Group</a> in the <i>Auto Scaling
     *         Developer Guide</i>.
     */
    public String getSpotPrice() {
        return spotPrice;
    }
    
    /**
     * The maximum hourly price to be paid for any Spot Instance launched to
     * fulfill the request. Spot Instances are launched when the price you
     * specify exceeds the current Spot market price. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US-SpotInstances.html">Launch
     * Spot Instances in Your Auto Scaling Group</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param spotPrice The maximum hourly price to be paid for any Spot Instance launched to
     *         fulfill the request. Spot Instances are launched when the price you
     *         specify exceeds the current Spot market price. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US-SpotInstances.html">Launch
     *         Spot Instances in Your Auto Scaling Group</a> in the <i>Auto Scaling
     *         Developer Guide</i>.
     */
    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }
    
    /**
     * The maximum hourly price to be paid for any Spot Instance launched to
     * fulfill the request. Spot Instances are launched when the price you
     * specify exceeds the current Spot market price. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US-SpotInstances.html">Launch
     * Spot Instances in Your Auto Scaling Group</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param spotPrice The maximum hourly price to be paid for any Spot Instance launched to
     *         fulfill the request. Spot Instances are launched when the price you
     *         specify exceeds the current Spot market price. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US-SpotInstances.html">Launch
     *         Spot Instances in Your Auto Scaling Group</a> in the <i>Auto Scaling
     *         Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLaunchConfigurationRequest withSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    /**
     * The name or the Amazon Resource Name (ARN) of the instance profile
     * associated with the IAM role for the instance. <p>Amazon EC2 instances
     * launched with an IAM role will automatically have AWS security
     * credentials available. You can use IAM roles with Auto Scaling to
     * automatically enable applications running on your Amazon EC2 instances
     * to securely access other AWS resources. For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-iam-role.html">Launch
     * Auto Scaling Instances with an IAM Role</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The name or the Amazon Resource Name (ARN) of the instance profile
     *         associated with the IAM role for the instance. <p>Amazon EC2 instances
     *         launched with an IAM role will automatically have AWS security
     *         credentials available. You can use IAM roles with Auto Scaling to
     *         automatically enable applications running on your Amazon EC2 instances
     *         to securely access other AWS resources. For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-iam-role.html">Launch
     *         Auto Scaling Instances with an IAM Role</a> in the <i>Auto Scaling
     *         Developer Guide</i>.
     */
    public String getIamInstanceProfile() {
        return iamInstanceProfile;
    }
    
    /**
     * The name or the Amazon Resource Name (ARN) of the instance profile
     * associated with the IAM role for the instance. <p>Amazon EC2 instances
     * launched with an IAM role will automatically have AWS security
     * credentials available. You can use IAM roles with Auto Scaling to
     * automatically enable applications running on your Amazon EC2 instances
     * to securely access other AWS resources. For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-iam-role.html">Launch
     * Auto Scaling Instances with an IAM Role</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param iamInstanceProfile The name or the Amazon Resource Name (ARN) of the instance profile
     *         associated with the IAM role for the instance. <p>Amazon EC2 instances
     *         launched with an IAM role will automatically have AWS security
     *         credentials available. You can use IAM roles with Auto Scaling to
     *         automatically enable applications running on your Amazon EC2 instances
     *         to securely access other AWS resources. For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-iam-role.html">Launch
     *         Auto Scaling Instances with an IAM Role</a> in the <i>Auto Scaling
     *         Developer Guide</i>.
     */
    public void setIamInstanceProfile(String iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }
    
    /**
     * The name or the Amazon Resource Name (ARN) of the instance profile
     * associated with the IAM role for the instance. <p>Amazon EC2 instances
     * launched with an IAM role will automatically have AWS security
     * credentials available. You can use IAM roles with Auto Scaling to
     * automatically enable applications running on your Amazon EC2 instances
     * to securely access other AWS resources. For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-iam-role.html">Launch
     * Auto Scaling Instances with an IAM Role</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param iamInstanceProfile The name or the Amazon Resource Name (ARN) of the instance profile
     *         associated with the IAM role for the instance. <p>Amazon EC2 instances
     *         launched with an IAM role will automatically have AWS security
     *         credentials available. You can use IAM roles with Auto Scaling to
     *         automatically enable applications running on your Amazon EC2 instances
     *         to securely access other AWS resources. For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-iam-role.html">Launch
     *         Auto Scaling Instances with an IAM Role</a> in the <i>Auto Scaling
     *         Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLaunchConfigurationRequest withIamInstanceProfile(String iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
        return this;
    }

    /**
     * Indicates whether the instance is optimized for Amazon EBS I/O. By
     * default, the instance is not optimized for EBS I/O. The optimization
     * provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal I/O performance. This
     * optimization is not available with all instance types. Additional
     * usage charges apply. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon
     * EBS-Optimized Instances</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     *
     * @return Indicates whether the instance is optimized for Amazon EBS I/O. By
     *         default, the instance is not optimized for EBS I/O. The optimization
     *         provides dedicated throughput to Amazon EBS and an optimized
     *         configuration stack to provide optimal I/O performance. This
     *         optimization is not available with all instance types. Additional
     *         usage charges apply. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon
     *         EBS-Optimized Instances</a> in the <i>Amazon Elastic Compute Cloud
     *         User Guide</i>.
     */
    public Boolean isEbsOptimized() {
        return ebsOptimized;
    }
    
    /**
     * Indicates whether the instance is optimized for Amazon EBS I/O. By
     * default, the instance is not optimized for EBS I/O. The optimization
     * provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal I/O performance. This
     * optimization is not available with all instance types. Additional
     * usage charges apply. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon
     * EBS-Optimized Instances</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     *
     * @param ebsOptimized Indicates whether the instance is optimized for Amazon EBS I/O. By
     *         default, the instance is not optimized for EBS I/O. The optimization
     *         provides dedicated throughput to Amazon EBS and an optimized
     *         configuration stack to provide optimal I/O performance. This
     *         optimization is not available with all instance types. Additional
     *         usage charges apply. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon
     *         EBS-Optimized Instances</a> in the <i>Amazon Elastic Compute Cloud
     *         User Guide</i>.
     */
    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }
    
    /**
     * Indicates whether the instance is optimized for Amazon EBS I/O. By
     * default, the instance is not optimized for EBS I/O. The optimization
     * provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal I/O performance. This
     * optimization is not available with all instance types. Additional
     * usage charges apply. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon
     * EBS-Optimized Instances</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ebsOptimized Indicates whether the instance is optimized for Amazon EBS I/O. By
     *         default, the instance is not optimized for EBS I/O. The optimization
     *         provides dedicated throughput to Amazon EBS and an optimized
     *         configuration stack to provide optimal I/O performance. This
     *         optimization is not available with all instance types. Additional
     *         usage charges apply. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon
     *         EBS-Optimized Instances</a> in the <i>Amazon Elastic Compute Cloud
     *         User Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLaunchConfigurationRequest withEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * Indicates whether the instance is optimized for Amazon EBS I/O. By
     * default, the instance is not optimized for EBS I/O. The optimization
     * provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal I/O performance. This
     * optimization is not available with all instance types. Additional
     * usage charges apply. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon
     * EBS-Optimized Instances</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     *
     * @return Indicates whether the instance is optimized for Amazon EBS I/O. By
     *         default, the instance is not optimized for EBS I/O. The optimization
     *         provides dedicated throughput to Amazon EBS and an optimized
     *         configuration stack to provide optimal I/O performance. This
     *         optimization is not available with all instance types. Additional
     *         usage charges apply. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html">Amazon
     *         EBS-Optimized Instances</a> in the <i>Amazon Elastic Compute Cloud
     *         User Guide</i>.
     */
    public Boolean getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * Used for groups that launch instances into a virtual private cloud
     * (VPC). Specifies whether to assign a public IP address to each
     * instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html">Auto
     * Scaling and Amazon VPC</a> in the <i>Auto Scaling Developer Guide</i>.
     * <note> <p>If you specify a value for this parameter, be sure to
     * specify at least one subnet using the <i>VPCZoneIdentifier</i>
     * parameter when you create your group. </note> <p>Default: If the
     * instance is launched into a default subnet, the default is
     * <code>true</code>. If the instance is launched into a nondefault
     * subnet, the default is <code>false</code>. For more information, see
     * <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide//as-supported-platforms.html">Supported
     * Platforms</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *
     * @return Used for groups that launch instances into a virtual private cloud
     *         (VPC). Specifies whether to assign a public IP address to each
     *         instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html">Auto
     *         Scaling and Amazon VPC</a> in the <i>Auto Scaling Developer Guide</i>.
     *         <note> <p>If you specify a value for this parameter, be sure to
     *         specify at least one subnet using the <i>VPCZoneIdentifier</i>
     *         parameter when you create your group. </note> <p>Default: If the
     *         instance is launched into a default subnet, the default is
     *         <code>true</code>. If the instance is launched into a nondefault
     *         subnet, the default is <code>false</code>. For more information, see
     *         <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide//as-supported-platforms.html">Supported
     *         Platforms</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */
    public Boolean isAssociatePublicIpAddress() {
        return associatePublicIpAddress;
    }
    
    /**
     * Used for groups that launch instances into a virtual private cloud
     * (VPC). Specifies whether to assign a public IP address to each
     * instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html">Auto
     * Scaling and Amazon VPC</a> in the <i>Auto Scaling Developer Guide</i>.
     * <note> <p>If you specify a value for this parameter, be sure to
     * specify at least one subnet using the <i>VPCZoneIdentifier</i>
     * parameter when you create your group. </note> <p>Default: If the
     * instance is launched into a default subnet, the default is
     * <code>true</code>. If the instance is launched into a nondefault
     * subnet, the default is <code>false</code>. For more information, see
     * <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide//as-supported-platforms.html">Supported
     * Platforms</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *
     * @param associatePublicIpAddress Used for groups that launch instances into a virtual private cloud
     *         (VPC). Specifies whether to assign a public IP address to each
     *         instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html">Auto
     *         Scaling and Amazon VPC</a> in the <i>Auto Scaling Developer Guide</i>.
     *         <note> <p>If you specify a value for this parameter, be sure to
     *         specify at least one subnet using the <i>VPCZoneIdentifier</i>
     *         parameter when you create your group. </note> <p>Default: If the
     *         instance is launched into a default subnet, the default is
     *         <code>true</code>. If the instance is launched into a nondefault
     *         subnet, the default is <code>false</code>. For more information, see
     *         <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide//as-supported-platforms.html">Supported
     *         Platforms</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */
    public void setAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
    }
    
    /**
     * Used for groups that launch instances into a virtual private cloud
     * (VPC). Specifies whether to assign a public IP address to each
     * instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html">Auto
     * Scaling and Amazon VPC</a> in the <i>Auto Scaling Developer Guide</i>.
     * <note> <p>If you specify a value for this parameter, be sure to
     * specify at least one subnet using the <i>VPCZoneIdentifier</i>
     * parameter when you create your group. </note> <p>Default: If the
     * instance is launched into a default subnet, the default is
     * <code>true</code>. If the instance is launched into a nondefault
     * subnet, the default is <code>false</code>. For more information, see
     * <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide//as-supported-platforms.html">Supported
     * Platforms</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associatePublicIpAddress Used for groups that launch instances into a virtual private cloud
     *         (VPC). Specifies whether to assign a public IP address to each
     *         instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html">Auto
     *         Scaling and Amazon VPC</a> in the <i>Auto Scaling Developer Guide</i>.
     *         <note> <p>If you specify a value for this parameter, be sure to
     *         specify at least one subnet using the <i>VPCZoneIdentifier</i>
     *         parameter when you create your group. </note> <p>Default: If the
     *         instance is launched into a default subnet, the default is
     *         <code>true</code>. If the instance is launched into a nondefault
     *         subnet, the default is <code>false</code>. For more information, see
     *         <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide//as-supported-platforms.html">Supported
     *         Platforms</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLaunchConfigurationRequest withAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
        return this;
    }

    /**
     * Used for groups that launch instances into a virtual private cloud
     * (VPC). Specifies whether to assign a public IP address to each
     * instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html">Auto
     * Scaling and Amazon VPC</a> in the <i>Auto Scaling Developer Guide</i>.
     * <note> <p>If you specify a value for this parameter, be sure to
     * specify at least one subnet using the <i>VPCZoneIdentifier</i>
     * parameter when you create your group. </note> <p>Default: If the
     * instance is launched into a default subnet, the default is
     * <code>true</code>. If the instance is launched into a nondefault
     * subnet, the default is <code>false</code>. For more information, see
     * <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide//as-supported-platforms.html">Supported
     * Platforms</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *
     * @return Used for groups that launch instances into a virtual private cloud
     *         (VPC). Specifies whether to assign a public IP address to each
     *         instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html">Auto
     *         Scaling and Amazon VPC</a> in the <i>Auto Scaling Developer Guide</i>.
     *         <note> <p>If you specify a value for this parameter, be sure to
     *         specify at least one subnet using the <i>VPCZoneIdentifier</i>
     *         parameter when you create your group. </note> <p>Default: If the
     *         instance is launched into a default subnet, the default is
     *         <code>true</code>. If the instance is launched into a nondefault
     *         subnet, the default is <code>false</code>. For more information, see
     *         <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide//as-supported-platforms.html">Supported
     *         Platforms</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */
    public Boolean getAssociatePublicIpAddress() {
        return associatePublicIpAddress;
    }

    /**
     * The tenancy of the instance. An instance with a tenancy of
     * <code>dedicated</code> runs on single-tenant hardware and can only be
     * launched in a VPC. <p>You must set the value of this parameter to
     * <code>dedicated</code> if want to launch Dedicated Instances in a
     * shared tenancy VPC (VPC with instance placement tenancy attribute set
     * to <code>default</code>). <p>If you specify a value for this
     * parameter, be sure to specify at least one VPC subnet using the
     * <i>VPCZoneIdentifier</i> parameter when you create your group. <p>For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html">Auto
     * Scaling and Amazon VPC</a> in the <i>Auto Scaling Developer Guide</i>.
     * <p>Valid values: <code>default</code> | <code>dedicated</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The tenancy of the instance. An instance with a tenancy of
     *         <code>dedicated</code> runs on single-tenant hardware and can only be
     *         launched in a VPC. <p>You must set the value of this parameter to
     *         <code>dedicated</code> if want to launch Dedicated Instances in a
     *         shared tenancy VPC (VPC with instance placement tenancy attribute set
     *         to <code>default</code>). <p>If you specify a value for this
     *         parameter, be sure to specify at least one VPC subnet using the
     *         <i>VPCZoneIdentifier</i> parameter when you create your group. <p>For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html">Auto
     *         Scaling and Amazon VPC</a> in the <i>Auto Scaling Developer Guide</i>.
     *         <p>Valid values: <code>default</code> | <code>dedicated</code>
     */
    public String getPlacementTenancy() {
        return placementTenancy;
    }
    
    /**
     * The tenancy of the instance. An instance with a tenancy of
     * <code>dedicated</code> runs on single-tenant hardware and can only be
     * launched in a VPC. <p>You must set the value of this parameter to
     * <code>dedicated</code> if want to launch Dedicated Instances in a
     * shared tenancy VPC (VPC with instance placement tenancy attribute set
     * to <code>default</code>). <p>If you specify a value for this
     * parameter, be sure to specify at least one VPC subnet using the
     * <i>VPCZoneIdentifier</i> parameter when you create your group. <p>For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html">Auto
     * Scaling and Amazon VPC</a> in the <i>Auto Scaling Developer Guide</i>.
     * <p>Valid values: <code>default</code> | <code>dedicated</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param placementTenancy The tenancy of the instance. An instance with a tenancy of
     *         <code>dedicated</code> runs on single-tenant hardware and can only be
     *         launched in a VPC. <p>You must set the value of this parameter to
     *         <code>dedicated</code> if want to launch Dedicated Instances in a
     *         shared tenancy VPC (VPC with instance placement tenancy attribute set
     *         to <code>default</code>). <p>If you specify a value for this
     *         parameter, be sure to specify at least one VPC subnet using the
     *         <i>VPCZoneIdentifier</i> parameter when you create your group. <p>For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html">Auto
     *         Scaling and Amazon VPC</a> in the <i>Auto Scaling Developer Guide</i>.
     *         <p>Valid values: <code>default</code> | <code>dedicated</code>
     */
    public void setPlacementTenancy(String placementTenancy) {
        this.placementTenancy = placementTenancy;
    }
    
    /**
     * The tenancy of the instance. An instance with a tenancy of
     * <code>dedicated</code> runs on single-tenant hardware and can only be
     * launched in a VPC. <p>You must set the value of this parameter to
     * <code>dedicated</code> if want to launch Dedicated Instances in a
     * shared tenancy VPC (VPC with instance placement tenancy attribute set
     * to <code>default</code>). <p>If you specify a value for this
     * parameter, be sure to specify at least one VPC subnet using the
     * <i>VPCZoneIdentifier</i> parameter when you create your group. <p>For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html">Auto
     * Scaling and Amazon VPC</a> in the <i>Auto Scaling Developer Guide</i>.
     * <p>Valid values: <code>default</code> | <code>dedicated</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param placementTenancy The tenancy of the instance. An instance with a tenancy of
     *         <code>dedicated</code> runs on single-tenant hardware and can only be
     *         launched in a VPC. <p>You must set the value of this parameter to
     *         <code>dedicated</code> if want to launch Dedicated Instances in a
     *         shared tenancy VPC (VPC with instance placement tenancy attribute set
     *         to <code>default</code>). <p>If you specify a value for this
     *         parameter, be sure to specify at least one VPC subnet using the
     *         <i>VPCZoneIdentifier</i> parameter when you create your group. <p>For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html">Auto
     *         Scaling and Amazon VPC</a> in the <i>Auto Scaling Developer Guide</i>.
     *         <p>Valid values: <code>default</code> | <code>dedicated</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLaunchConfigurationRequest withPlacementTenancy(String placementTenancy) {
        this.placementTenancy = placementTenancy;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLaunchConfigurationName() != null) sb.append("LaunchConfigurationName: " + getLaunchConfigurationName() + ",");
        if (getImageId() != null) sb.append("ImageId: " + getImageId() + ",");
        if (getKeyName() != null) sb.append("KeyName: " + getKeyName() + ",");
        if (getSecurityGroups() != null) sb.append("SecurityGroups: " + getSecurityGroups() + ",");
        if (getClassicLinkVPCId() != null) sb.append("ClassicLinkVPCId: " + getClassicLinkVPCId() + ",");
        if (getClassicLinkVPCSecurityGroups() != null) sb.append("ClassicLinkVPCSecurityGroups: " + getClassicLinkVPCSecurityGroups() + ",");
        if (getUserData() != null) sb.append("UserData: " + getUserData() + ",");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() + ",");
        if (getKernelId() != null) sb.append("KernelId: " + getKernelId() + ",");
        if (getRamdiskId() != null) sb.append("RamdiskId: " + getRamdiskId() + ",");
        if (getBlockDeviceMappings() != null) sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (getInstanceMonitoring() != null) sb.append("InstanceMonitoring: " + getInstanceMonitoring() + ",");
        if (getSpotPrice() != null) sb.append("SpotPrice: " + getSpotPrice() + ",");
        if (getIamInstanceProfile() != null) sb.append("IamInstanceProfile: " + getIamInstanceProfile() + ",");
        if (isEbsOptimized() != null) sb.append("EbsOptimized: " + isEbsOptimized() + ",");
        if (isAssociatePublicIpAddress() != null) sb.append("AssociatePublicIpAddress: " + isAssociatePublicIpAddress() + ",");
        if (getPlacementTenancy() != null) sb.append("PlacementTenancy: " + getPlacementTenancy() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLaunchConfigurationName() == null) ? 0 : getLaunchConfigurationName().hashCode()); 
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode()); 
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode()); 
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode()); 
        hashCode = prime * hashCode + ((getClassicLinkVPCId() == null) ? 0 : getClassicLinkVPCId().hashCode()); 
        hashCode = prime * hashCode + ((getClassicLinkVPCSecurityGroups() == null) ? 0 : getClassicLinkVPCSecurityGroups().hashCode()); 
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode()); 
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode()); 
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceMonitoring() == null) ? 0 : getInstanceMonitoring().hashCode()); 
        hashCode = prime * hashCode + ((getSpotPrice() == null) ? 0 : getSpotPrice().hashCode()); 
        hashCode = prime * hashCode + ((getIamInstanceProfile() == null) ? 0 : getIamInstanceProfile().hashCode()); 
        hashCode = prime * hashCode + ((isEbsOptimized() == null) ? 0 : isEbsOptimized().hashCode()); 
        hashCode = prime * hashCode + ((isAssociatePublicIpAddress() == null) ? 0 : isAssociatePublicIpAddress().hashCode()); 
        hashCode = prime * hashCode + ((getPlacementTenancy() == null) ? 0 : getPlacementTenancy().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateLaunchConfigurationRequest == false) return false;
        CreateLaunchConfigurationRequest other = (CreateLaunchConfigurationRequest)obj;
        
        if (other.getLaunchConfigurationName() == null ^ this.getLaunchConfigurationName() == null) return false;
        if (other.getLaunchConfigurationName() != null && other.getLaunchConfigurationName().equals(this.getLaunchConfigurationName()) == false) return false; 
        if (other.getImageId() == null ^ this.getImageId() == null) return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false) return false; 
        if (other.getKeyName() == null ^ this.getKeyName() == null) return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false) return false; 
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null) return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false) return false; 
        if (other.getClassicLinkVPCId() == null ^ this.getClassicLinkVPCId() == null) return false;
        if (other.getClassicLinkVPCId() != null && other.getClassicLinkVPCId().equals(this.getClassicLinkVPCId()) == false) return false; 
        if (other.getClassicLinkVPCSecurityGroups() == null ^ this.getClassicLinkVPCSecurityGroups() == null) return false;
        if (other.getClassicLinkVPCSecurityGroups() != null && other.getClassicLinkVPCSecurityGroups().equals(this.getClassicLinkVPCSecurityGroups()) == false) return false; 
        if (other.getUserData() == null ^ this.getUserData() == null) return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false) return false; 
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false; 
        if (other.getKernelId() == null ^ this.getKernelId() == null) return false;
        if (other.getKernelId() != null && other.getKernelId().equals(this.getKernelId()) == false) return false; 
        if (other.getRamdiskId() == null ^ this.getRamdiskId() == null) return false;
        if (other.getRamdiskId() != null && other.getRamdiskId().equals(this.getRamdiskId()) == false) return false; 
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null) return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false) return false; 
        if (other.getInstanceMonitoring() == null ^ this.getInstanceMonitoring() == null) return false;
        if (other.getInstanceMonitoring() != null && other.getInstanceMonitoring().equals(this.getInstanceMonitoring()) == false) return false; 
        if (other.getSpotPrice() == null ^ this.getSpotPrice() == null) return false;
        if (other.getSpotPrice() != null && other.getSpotPrice().equals(this.getSpotPrice()) == false) return false; 
        if (other.getIamInstanceProfile() == null ^ this.getIamInstanceProfile() == null) return false;
        if (other.getIamInstanceProfile() != null && other.getIamInstanceProfile().equals(this.getIamInstanceProfile()) == false) return false; 
        if (other.isEbsOptimized() == null ^ this.isEbsOptimized() == null) return false;
        if (other.isEbsOptimized() != null && other.isEbsOptimized().equals(this.isEbsOptimized()) == false) return false; 
        if (other.isAssociatePublicIpAddress() == null ^ this.isAssociatePublicIpAddress() == null) return false;
        if (other.isAssociatePublicIpAddress() != null && other.isAssociatePublicIpAddress().equals(this.isAssociatePublicIpAddress()) == false) return false; 
        if (other.getPlacementTenancy() == null ^ this.getPlacementTenancy() == null) return false;
        if (other.getPlacementTenancy() != null && other.getPlacementTenancy().equals(this.getPlacementTenancy()) == false) return false; 
        return true;
    }
    
}
    