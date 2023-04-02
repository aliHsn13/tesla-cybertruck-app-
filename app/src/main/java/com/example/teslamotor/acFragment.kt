package com.example.teslamotor

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.example.teslamotor.databinding.FragmentAcBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import soup.neumorphism.NeumorphImageView
import soup.neumorphism.ShapeType


class acFragment(private val acFragment: MainActivity2) : BottomSheetDialogFragment() {

    lateinit var binding: FragmentAcBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentAcBinding.inflate(layoutInflater, null, false)

        binding.btnAuto.setOnClickListener {
            if (binding.btnAuto.getShapeType() == ShapeType.FLAT) {
                binding.btnAuto.setShapeType(ShapeType.PRESSED)
                binding.btnAuto.setBackgroundColor(
                    ContextCompat.getColor(
                        requireActivity(),
                        R.color.blue_light
                    )
                )
                binding.btnAuto.setShadowColorDark(
                    ContextCompat.getColor(
                        requireActivity(),
                        R.color.blue_shadow_1
                    )
                )
                binding.btnAuto.setShadowColorLight(
                    ContextCompat.getColor(
                        requireActivity(),
                        R.color.blue_shadow_2
                    )
                )
            } else {
                binding.btnAuto.setShapeType(ShapeType.FLAT)

                binding.btnAuto.setBackgroundColor(
                    ContextCompat.getColor(
                        requireActivity(),
                        R.color.black
                    )
                )
                binding.btnAuto.setShadowColorDark(
                    ContextCompat.getColor(
                        requireActivity(),
                        R.color.new_shadow1
                    )
                )
                binding.btnAuto.setShadowColorLight(
                    ContextCompat.getColor(
                        requireActivity(),
                        R.color.new_shadow2
                    )
                )

            }

            binding.btnCool.setShapeType(ShapeType.FLAT)
            binding.btnDry.setShapeType(ShapeType.FLAT)
            binding.btnProgram.setShapeType(ShapeType.FLAT)

            binding.btnCool.setBackgroundColor(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.black
                )
            )
            binding.btnCool.setShadowColorDark(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.new_shadow1
                )
            )
            binding.btnCool.setShadowColorLight(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.new_shadow2
                )
            )

            binding.btnDry.setBackgroundColor(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.black
                )
            )
            binding.btnDry.setShadowColorDark(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.new_shadow1
                )
            )
            binding.btnDry.setShadowColorLight(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.new_shadow2
                )
            )

            binding.btnProgram.setBackgroundColor(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.black
                )
            )
            binding.btnProgram.setShadowColorDark(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.new_shadow1
                )
            )
            binding.btnProgram.setShadowColorLight(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.new_shadow2
                )
            )

        }
        /**************************************************************************/
        binding.btnDry.setOnClickListener {
            if (binding.btnDry.getShapeType() == ShapeType.FLAT) {
                binding.btnDry.setShapeType(ShapeType.PRESSED)
                binding.btnDry.setBackgroundColor(
                    ContextCompat.getColor(
                        requireActivity(),
                        R.color.blue_light
                    )
                )
                binding.btnDry.setShadowColorDark(
                    ContextCompat.getColor(
                        requireActivity(),
                        R.color.blue_shadow_1
                    )
                )
                binding.btnDry.setShadowColorLight(
                    ContextCompat.getColor(
                        requireActivity(),
                        R.color.blue_shadow_2
                    )
                )
            } else {
                binding.btnDry.setShapeType(ShapeType.FLAT)

                binding.btnDry.setBackgroundColor(
                    ContextCompat.getColor(
                        requireActivity(),
                        R.color.black
                    )
                )
                binding.btnDry.setShadowColorDark(
                    ContextCompat.getColor(
                        requireActivity(),
                        R.color.new_shadow1
                    )
                )
                binding.btnDry.setShadowColorLight(
                    ContextCompat.getColor(
                        requireActivity(),
                        R.color.new_shadow2
                    )
                )

            }

            binding.btnCool.setShapeType(ShapeType.FLAT)
            binding.btnAuto.setShapeType(ShapeType.FLAT)
            binding.btnProgram.setShapeType(ShapeType.FLAT)

            binding.btnCool.setBackgroundColor(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.black
                )
            )
            binding.btnCool.setShadowColorDark(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.new_shadow1
                )
            )
            binding.btnCool.setShadowColorLight(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.new_shadow2
                )
            )

            binding.btnAuto.setBackgroundColor(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.black
                )
            )
            binding.btnAuto.setShadowColorDark(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.new_shadow1
                )
            )
            binding.btnAuto.setShadowColorLight(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.new_shadow2
                )
            )

            binding.btnProgram.setBackgroundColor(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.black
                )
            )
            binding.btnProgram.setShadowColorDark(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.new_shadow1
                )
            )
            binding.btnProgram.setShadowColorLight(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.new_shadow2
                )
            )

        }
        /**************************************************************************/
        binding.btnCool.setOnClickListener {
            if (binding.btnCool.getShapeType() == ShapeType.FLAT) {
                binding.btnCool.setShapeType(ShapeType.PRESSED)
                binding.btnCool.setBackgroundColor(
                    ContextCompat.getColor(
                        requireActivity(),
                        R.color.blue_light
                    )
                )
                binding.btnCool.setShadowColorDark(
                    ContextCompat.getColor(
                        requireActivity(),
                        R.color.blue_shadow_1
                    )
                )
                binding.btnCool.setShadowColorLight(
                    ContextCompat.getColor(
                        requireActivity(),
                        R.color.blue_shadow_2
                    )
                )
            } else {
                binding.btnCool.setShapeType(ShapeType.FLAT)

                binding.btnCool.setBackgroundColor(
                    ContextCompat.getColor(
                        requireActivity(),
                        R.color.black
                    )
                )
                binding.btnCool.setShadowColorDark(
                    ContextCompat.getColor(
                        requireActivity(),
                        R.color.new_shadow1
                    )
                )
                binding.btnCool.setShadowColorLight(
                    ContextCompat.getColor(
                        requireActivity(),
                        R.color.new_shadow2
                    )
                )

            }

            binding.btnDry.setShapeType(ShapeType.FLAT)
            binding.btnAuto.setShapeType(ShapeType.FLAT)
            binding.btnProgram.setShapeType(ShapeType.FLAT)

            binding.btnDry.setBackgroundColor(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.black
                )
            )
            binding.btnDry.setShadowColorDark(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.new_shadow1
                )
            )
            binding.btnDry.setShadowColorLight(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.new_shadow2
                )
            )

            binding.btnAuto.setBackgroundColor(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.black
                )
            )
            binding.btnAuto.setShadowColorDark(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.new_shadow1
                )
            )
            binding.btnAuto.setShadowColorLight(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.new_shadow2
                )
            )

            binding.btnProgram.setBackgroundColor(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.black
                )
            )
            binding.btnProgram.setShadowColorDark(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.new_shadow1
                )
            )
            binding.btnProgram.setShadowColorLight(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.new_shadow2
                )
            )

        }
        /**************************************************************************/
        binding.btnProgram.setOnClickListener {
            if (binding.btnProgram.getShapeType() == ShapeType.FLAT) {
                binding.btnProgram.setShapeType(ShapeType.PRESSED)
                binding.btnProgram.setBackgroundColor(
                    ContextCompat.getColor(
                        requireActivity(),
                        R.color.blue_light
                    )
                )
                binding.btnProgram.setShadowColorDark(
                    ContextCompat.getColor(
                        requireActivity(),
                        R.color.blue_shadow_1
                    )
                )
                binding.btnProgram.setShadowColorLight(
                    ContextCompat.getColor(
                        requireActivity(),
                        R.color.blue_shadow_2
                    )
                )
            } else {
                binding.btnProgram.setShapeType(ShapeType.FLAT)

                binding.btnProgram.setBackgroundColor(
                    ContextCompat.getColor(
                        requireActivity(),
                        R.color.black
                    )
                )
                binding.btnProgram.setShadowColorDark(
                    ContextCompat.getColor(
                        requireActivity(),
                        R.color.new_shadow1
                    )
                )
                binding.btnProgram.setShadowColorLight(
                    ContextCompat.getColor(
                        requireActivity(),
                        R.color.new_shadow2
                    )
                )

            }

            binding.btnCool.setShapeType(ShapeType.FLAT)
            binding.btnAuto.setShapeType(ShapeType.FLAT)
            binding.btnDry.setShapeType(ShapeType.FLAT)

            binding.btnCool.setBackgroundColor(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.black
                )
            )
            binding.btnCool.setShadowColorDark(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.new_shadow1
                )
            )
            binding.btnCool.setShadowColorLight(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.new_shadow2
                )
            )

            binding.btnAuto.setBackgroundColor(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.black
                )
            )
            binding.btnAuto.setShadowColorDark(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.new_shadow1
                )
            )
            binding.btnAuto.setShadowColorLight(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.new_shadow2
                )
            )

            binding.btnDry.setBackgroundColor(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.black
                )
            )
            binding.btnDry.setShadowColorDark(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.new_shadow1
                )
            )
            binding.btnDry.setShadowColorLight(
                ContextCompat.getColor(
                    requireActivity(),
                    R.color.new_shadow2
                )
            )

        }
        /**************************************************************************/

        return binding.root
    }


}