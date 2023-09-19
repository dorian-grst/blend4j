# About

The AMP blend4j repository is forked from the original [Galaxy blend4j repository](https://github.com/galaxyproject/blend4j), with various AMP extensions and customizations. It's a Java library providing various APIs for AMP REST backend to communication with the also customized AMP Galaxy instance, for any workflow related operations.

The major changes to the original blend4j package include but are not limited to:
- extensions to data models related to GalaxyObject, History, Dataset, Tool, Job, Workflow, Invocation etc.
- extensions to service layer: BaseClient, WorkflowClient, HistoryClient
- some utils related to JSON handling  

Note that some of the above changes are general enough that they could be contributed back to the original blend4j project; yet some are pretty AMP specific and might not be applicable to other applications using Galaxy.

# Usage

Detailed information about how to use the blend4j library can be found on the [original blend4j website](https://github.com/galaxyproject/blend4j). The AMP customized blend4j repository is built into an AMP-versioned blend4j jar and published to Maven Central with each release. AMP uses jitpack to handle the build, publish, and updates of blend4j jar. 

Further information about how to install, config, run, as well as contribute to the AMP project can be found at [AMP Bootstrap](https://github.com/AudiovisualMetadataPlatform/amp_bootstrap)

