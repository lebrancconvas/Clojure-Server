; const express = require('express')
; const app = express()

; app.get('/', (req, res) => res.send('Hello World!'))

; app.listen(3000, () => console.log('Example app listening on port 3000!'))

(ns server.core)

(def express (js/require "express"))
(def app (express))
(.get app "/"
      (fn [req res]
        (.send res "Hello World.")))
(.listen app 3000 #(prn "App Running on Port 3000"))

