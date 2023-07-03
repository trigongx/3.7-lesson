package com.example.a37_lesson

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.a37_lesson.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private lateinit var binding:FragmentDetailBinding
    private lateinit var dataFromMainFragment:Person


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataFromMainFragment = arguments?.getSerializable("TRIGON") as Person
        binding.apply {
            tvName.text = dataFromMainFragment.name
            tvAlive.text = dataFromMainFragment.name
            dataFromMainFragment.image?.let { imgPerson.loadImage(it) }
        }

    }

}
