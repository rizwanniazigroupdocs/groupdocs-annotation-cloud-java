# GroupDocs.Annotation Cloud SDK for Java
This repository contains GroupDocs.Annotation Cloud SDK for Java source code. This SDK allows you to work with GroupDocs.Annotation Cloud REST APIs in your Java applications.

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add following repository and dependency to your project's POM

```xml
<repository>
    <id>groupdocs-artifact-repository</id>
    <name>GroupDocs Artifact Repository</name>
    <url>http://artifact.groupdocs.cloud/repo</url>
</repository>
```

```xml
<dependency>
    <groupId>com.groupdocs</groupId>
    <artifactId>groupdocs-annotation-cloud</artifactId>
    <version>18.4</version>
    <scope>compile</scope>
</dependency>
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/groupdocs-annotation-cloud-18.4.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.groupdocs.cloud.annotation.client.*;
import com.groupdocs.cloud.annotation.model.*;
import com.groupdocs.cloud.annotation.api.AnnotationApi;

import java.io.File;
import java.util.*;

public class AnnotationApiExample {

    public static void main(String[] args) {
        //TODO: Get your AppSID and AppKey at https://dashboard.groupdocs.cloud (free registration is required).
        String appSid = "XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX";
        String appKey = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";

        AnnotationApi apiInstance = new AnnotationApi(appSid, appKey);
        String name = "name_example"; // String | The document name.
        String folder = "folder_example"; // String | The folder name.
        String password = "password_example"; // String | 
        try {
            File result = apiInstance.deleteCleanDocument(name, folder, password);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnotationApi#deleteCleanDocument");
            e.printStackTrace();
        }
    }
}

```

## Licensing
All GroupDocs.Annotation Cloud SDKs are licensed under [MIT License](LICENSE).

## Resources
+ [**Website**](https://www.groupdocs.cloud)
+ [**Product Home**](https://products.groupdocs.cloud/annotation)
+ [**Documentation**](https://docs.groupdocs.cloud/display/annotationcloud/Home)
+ [**Free Support Forum**](https://forum.groupdocs.cloud/c/annotation)
+ [**Blog**](https://blog.groupdocs.cloud/category/annotation)

## Contact Us
Your feedback is very important to us. Please feel free to contact us using our [Support Forums](https://forum.groupdocs.cloud/c/annotation).
