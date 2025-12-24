package com.shinyhut.vernacular.protocol.handshaking

import com.shinyhut.vernacular.client.VncSession
import com.shinyhut.vernacular.client.exceptions.UnsupportedProtocolVersionException
import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Unroll

import static java.lang.String.format

class ProtocolVersionNegotiatorTest extends Specification {

    @Subject
    negotiator = new ProtocolVersionNegotiator()



    def "should throw an exception if the server does not support the minimum RFB protocol version supported by this client"() {
        given:
        def bytes = new ByteArrayInputStream("RFB 003.002\n".bytes)
        def session = Mock(VncSession)
        _ * session.inputStream >> bytes

        when:
        negotiator.negotiate(session)

        then:
        thrown UnsupportedProtocolVersionException
    }
}
