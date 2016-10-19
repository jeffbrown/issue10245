package com.demo

class CustomTagLib {

    static namespace = 'custom'

    def sayHello = { attrs ->
        out << 'Hello From com.demo.CustomTagLib!'
    }
}
