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
    val dummy = Output(UInt(8.W))
  })

  io.dummy := 0.U
}

//object RegisterFileMain extends App {
//  println("Generating the register file hardware")
//  emitVerilog(new RegisterFile(), Array("--target-dir", "generated"))
//}