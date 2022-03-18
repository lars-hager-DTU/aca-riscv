/*
 * Data Memory Block for RISC-V
 *
 * Author:
 * 
 */

package riscv

import chisel3._
import chisel3.util._

class DataMemory extends Module {
  val io = IO(new Bundle {
    val dummy = Output(UInt(8.W))
  })
  io.dummy := 0.U
}

//object DataMemoryMain extends App {
//  println("Generating the data memory hardware")
//  emitVerilog(new DataMemory(), Array("--target-dir", "generated"))
//}