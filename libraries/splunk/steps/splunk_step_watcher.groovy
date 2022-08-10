@BeforeStep
void before(){
    pringln "Splunk: running before the ${hookContext.library} library's ${hookContext.step} step"
}

@AfterStep
void after(){
    pringln "Splunk: running after the ${hookContext.library} library's ${hookContext.step} step"
}
