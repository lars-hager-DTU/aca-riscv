package riscv
/*
 * CPU (core) Module for RISC-V
 *
 * Author:
 *
 */

import chisel3._
import chisel3.util._

class Cpu extends Module{
  val io = IO(new Bundle {
    val diag = Output(UInt(32.W))
    })

  // Dummy outputs:
  io.diag       := 0.U
}

object CpuMain extends App {
  println("Generating the Cpu hardware")
  emitVerilog(new Cpu(), Array("--target-dir", "generated"))
}
