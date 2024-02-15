package com.github.jmchilton.blend4j.galaxy;

import com.sun.jersey.api.client.WebResource;

public interface GalaxyInstance {
  HistoriesClient getHistoriesClient();
  
  HistoryClient getHistoryClient();

  LibrariesClient getLibrariesClient();

  UsersClient getUsersClient();

  WorkflowsClient getWorkflowsClient();

  RolesClient getRolesClient();

  ToolsClient getToolsClient();

  ToolDataClient getToolDataClient();

  ConfigurationClient getConfigurationClient();
  
  ToolShedRepositoriesClient getRepositoriesClient();
    
  SearchClient getSearchClient();
  
  WebResource getWebResource();
  
  WebResource getRootWebResource();

  String getGalaxyUrl();
  
  String getApiKey();
  
  /**
   * Get a client for interacting with Galaxy's Jobs API.
   * 
   * @return a jobs client for interacting with the Jobs API for this instance.
   */
  JobsClient getJobsClient();
}
