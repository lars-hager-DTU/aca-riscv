/*
 * Instruction Memory Module for RISC-V.
 *
 * Author:
 * 
 */

package riscv

import chisel3._
import chisel3.util._

class InstructionMemory extends Module {
  val io = IO(new Bundle {
    val dummy = Output(UInt(8.W))
  })

  io.dummy := 0.U
}

//object InstructionMemoryMain extends App {
//  println("Generating the InstructionMemory hardware")
//  emitVerilog(new InstructionMemory(), Array("--target-dir", "generated"))
//}