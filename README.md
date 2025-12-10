# Package Name : WxCloudRegistration
This package that performs an auto-registration to your tenant in two steps, the package will with it's startup setup the connection and then packages that will expose services to the cloud needs to call this package services. 

WxCloudRegistration uses the global variables and then sets up the Tenant and Account via its “startup” service. 

In the custom packages you develop, they need to have a Dependency on WxCloudRegistration and, in their startup service, call RegisterPackage from WxCloudRegistration. This “registerPackage” service then exposes the services from the package to the cloud...

There is some documentation on the packages page and the WxCloudRegistration itself contains definitions for these global variables:

WxCloud_AccountName
WxCloud_Alias
WxCloud_Password
WxCloud_RunAsUser
WxCloud_URL.value
WxCloud_UserName

If these are not set, the startup service does nothing, since I don’t want the account to get locked...

You can choose to use these globalvariables by creating a application.properties file like:

globalvariable.WxCloudRegistration.WxCloud_AccountName.value=$env{WxCloud_AccountName}
globalvariable.WxCloudRegistration.WxCloud_Alias.value=$env{WxCloud_Alias}
globalvariable.WxCloudRegistration.WxCloud_Password.value=$env{WxCloud_Password}
globalvariable.WxCloudRegistration.WxCloud_Password.isSecure=true
globalvariable.WxCloudRegistration.WxCloud_RunAsUser.value=$env{WxCloud_RunAsUser}
globalvariable.WxCloudRegistration.WxCloud_URL.value=$env{WxCloud_URL}
globalvariable.WxCloudRegistration.WxCloud_UserName.value=$env{WxCloud_UserName}

The above samples uses the Environment variables you send in, but you could also set this preconfigured in the application.properties file and then you do not need to send anything in..( basically, you can choose to edit the file and set them to whatever values you want and not inject them as environment variables).

Normally you would build a base image where you include this together with a application.properties file and later use that base image when you create new images with your custom packages.

You're custom packages need in their startup service call the wxcloudregistration:registerPackage service which register the services from your custom package
