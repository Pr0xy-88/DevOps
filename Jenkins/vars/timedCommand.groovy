//vars/timedCommand.groovy
def setCommand(commandTorun) {
    cmd = commandTorun
}

def getCommand() {
    cmd
}

def runCommand() {
    timestamp {
    cmdOut = sh(script:"${cmd}", retrunStdout:true).trim()
    }
}

def getOutput() {
    cmdOut
}
