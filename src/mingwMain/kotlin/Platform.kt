import kotlinx.cinterop.*
import platform.windows.addrinfo
import platform.windows.freeaddrinfo




actual fun freeaddrinfo(addr: CPointer<addrinfo>) {
    freeaddrinfo(addr)
}
