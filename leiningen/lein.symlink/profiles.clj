{:user {:local-repo "~/.m2/repository/"        
        :search-page-size 10
        :plugins [[cider/cider-nrepl "0.7.0-SNAPSHOT"]
                  [lein-exec "0.3.2"]
                  [lein-pprint "1.1.1"]]
        :dependencies [[clj-http "0.9.1"]
                       [slamhound "1.3.1"]
                       [com.cemerick/pomegranate "0.3.0"]]}
 :analysis {:dependencies [[incanter "1.5.5"]]}
 :work {:dependencies [[com.oracle/ojdbc6 "11.2.0.2.0"]
                       [org.clojure/java.jdbc "0.3.3"]
                       [java-jdbc/dsl "0.1.0"]]
        :repositories [["nexus" {:url "http://nexus.fcci-group.com:9081/nexus/content/groups/public"}]]}
 :scraping {:dependencies [[com.github.kyleburton/clj-xpath "1.4.3"]]}}
