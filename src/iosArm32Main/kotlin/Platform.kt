import kotlinx.cinterop.CPointer
import platform.posix.addrinfo


actual fun freeaddrinfo(addr: CPointer<addrinfo>) {
    platform.posix.freeaddrinfo(addr)
}