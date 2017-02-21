(ns schema-example.schema-dep
  (:require [schema-example.core :as sec]
            [potemkin :as p]
            [schema.core :as s]))

(p/import-vars s/defn)

(schema.core/defn fn-one :- s/Int
  [x]
  (println x))

(defn fn-two :- s/Int
      [x]
      (println x))

(sec/defn fn-three :- s/Int
          [x]
          (println x))