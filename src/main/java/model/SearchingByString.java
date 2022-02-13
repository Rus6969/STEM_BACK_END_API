package model;

import java.util.Objects;

public class SearchingByString {

    /**
     * POJO for Searching by String API Response
     *
     */
      private   Search search;
       private String totalResults;
       private String response;

    public Search getSearch() {
        return search;
    }

    public void setSearch(Search search) {
        this.search = search;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public SearchingByString(Search search, String totalResults, String response) {
        this.search = search;
        this.totalResults = totalResults;
        this.response = response;
    }


}
