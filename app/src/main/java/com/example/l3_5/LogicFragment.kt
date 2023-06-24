package com.example.l3_5

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.l3_5.databinding.FragmentLogicBinding
import android.os.Bundle as Bundle

class LogicFragment : Fragment() {
    // TODO: Rename and change types of parameters

    private lateinit var binding: FragmentLogicBinding
    private var i = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

         binding = FragmentLogicBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if(i<11 && i > -1) { binding.btnLogic.setOnClickListener{

               i++
               binding.tvNumber.text = i.toString()
            if(i == 10) {
            binding.btnLogic.setOnClickListener {
                i--
                binding.btnLogic.text = "-1"
                binding.tvNumber.text = i.toString()
                if(i==0) {
                    binding.btnLogic.setOnClickListener {

                        var bundle = Bundle()
                        var r = binding.tvNumber.text.toString()
                        bundle.putString("name", r)
                        var blankFragment = BlankFragment()
                        blankFragment.arguments = bundle
                        requireActivity().supportFragmentManager.beginTransaction()
                            .replace(R.id.container, blankFragment).commit()
                }
        }}
    }}

}
}
}
