/*
 * Data Memory Block for RISC-V
 *
 * Author: Martin Schoeberl (martin@jopdesign.com)
 * 
 */

package riscv

import chisel3._
import chisel3.util._

class DataMemory extends Module {
  val io = IO(new Bundle {
    val a = Input(UInt(8.W))
    val b = Input(UInt(8.W))
    val c = Output(UInt(8.W))
  })

  val reg = RegInit(0.U(8.W))
  reg := io.a + io.b

  io.c := reg
}

object DataMemoryMain extends App {
  println("Generating the data memory hardware")
  emitVerilog(new DataMemory(), Array("--target-dir", "generated"))
}