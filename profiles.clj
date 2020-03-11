{:user {:dependencies [[org.clojure/tools.namespace "0.2.3"]]
        :injections [(require '(clojure.tools.namespace repl find))]
        :plugins [[lein-pprint "1.1.1"]
                  [lein-clojars "0.9.1"]
                  [lein-exec "0.3.1"]
                  [cider/cider-nrepl "0.24.0"]
                  [lein-ancient "0.6.15"]
                  [lein-try "0.4.3"]]
        :middleware [cider-nrepl.plugin/middleware}}
