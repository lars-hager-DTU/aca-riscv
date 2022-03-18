/*
 * Register File Block for RISC-V.
 *
 * Author:
 * 
 */

package riscv

import chisel3._
import chisel3.util._

class RegisterFile extends Module {
  val io = IO(new Bundle {
    val a = Input(UInt(8.W))
    val b = Input(UInt(8.W))
    val c = Output(UInt(8.W))
  })

  val reg = RegInit(0.U(8.W))
  reg := io.a + io.b

  io.c := reg
}

object RegisterFileMain extends App {
  println("Generating the register file hardware")
  emitVerilog(new RegisterFile(), Array("--target-dir", "generated"))
}