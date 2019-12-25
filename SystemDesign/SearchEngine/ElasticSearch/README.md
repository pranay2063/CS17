
*Full-text search*
  1. *https://en.wikipedia.org/wiki/Full-text_search*
  2. *https://www.baeldung.com/elasticsearch-full-text-search-rest-api*
  
*Inverted Index*
  1. *https://www.geeksforgeeks.org/inverted-index/*

*Elasticsearch*
  
    Highly scalable, open-source, full-text search engine, analytics engine
    NoSQL store
    Cluster - Group of nodes/hosts/servers
    Types of nodes - Master, Data, Connecting (Client), Ingesting (Http)
    Index - Collection of similar documents
    Shard - An index can be divided into physical and logical units called shards. Each shard is a lucene index.
    Segment - Each lucene index is divided into smaller units called segments
    Concepts - Sharding, Replication
    Motivation behind sharding - Data in an index may excced the harware limit of a server (Horizontal Scaling)  

*Introduction*
  1. *https://www.quora.com/How-does-Elasticsearch-work*
  2. *https://hub.packtpub.com/how-does-elasticsearch-work-tutorial/*
  3. *https://dzone.com/articles/what-is-elasticsearch-and-how-it-can-be-useful*
  4. *http://www.elasticsearchtutorial.com/elasticsearch-in-5-minutes.html*
  5. *https://logz.io/blog/10-elasticsearch-concepts/*
  6. *https://medium.com/@ashish_fagna/getting-started-with-elasticsearch-creating-indices-inserting-values-and-retrieving-data-e3122e9b12c6*
  
*Creating an elasticsearch cluster*
  1. *https://dzone.com/articles/elasticsearch-tutorial-creating-an-elasticsearch-c*
  2. *https://thoughts.t37.net/designing-the-perfect-elasticsearch-cluster-the-almost-definitive-guide-e614eabc1a87*
  
*Index in elasticsearch*
  1. *https://stackoverflow.com/questions/15025876/what-is-an-index-in-elasticsearch*
  
*How to search or query elasticsearch*

    Elastic Search provides a JSON-style domain-specific language which can be used to execute queries, and is referred as the Query-DSL.
    The search API allows us to execute a search query and get back search hits that match the query. Elastic search will fetch the records at lightning speed because of schema-less table structure. 
  
  1. *https://www.elastic.co/guide/en/elasticsearch/reference/7.5/query-dsl.html*
  2. *https://www.elastic.co/guide/en/elasticsearch/client/java-api/current/java-query-dsl.html*
  3. *https://www.baeldung.com/elasticsearch-java
  
*Elasticsearch - Type, Mapping*
  1. *https://logz.io/blog/elasticsearch-mapping/*
  2. *https://www.elastic.co/blog/index-vs-type*
