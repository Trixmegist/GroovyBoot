beans {
    xmlns ctx: "http://www.springframework.org/schema/context"
    ctx."component-scan"("base-package": "demo")
    ctx.'annotation-config'()

    foo String, "hello"
    bar String, "world"
}
