import kotlinx.cinterop.*
import platform.posix.*

expect fun freeaddrinfo(addr: CPointer<addrinfo>)


