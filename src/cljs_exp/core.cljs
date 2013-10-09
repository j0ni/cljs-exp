(ns cljs-exp.core
  (:require [cljs.nodejs :as nodejs]))

(def express (nodejs/require "express"))


(defn route [req res]
  (.send res "hello world"))

(defn create-app []
  (let [app (express)]
    (doto app
      (.configure
       "development"
       #(doto app
          (.use (.logger express "dev"))
          (.use (.errorHandler express {:showExceptions true
                                        :showStack true}))))
      (.get "/hello" route))))

(defn -main [& args]
  (.listen (create-app) 3050))

(set! *main-cli-fn* -main)
