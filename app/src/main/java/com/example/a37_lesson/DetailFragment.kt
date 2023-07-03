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
    private lateinit var navArgs: DetailFragmentArgs


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            navArgs =DetailFragmentArgs.fromBundle(it)
        }
        binding.tvName.text = navArgs.person.name
        binding.tvAlive.text = navArgs.person.life
        navArgs.person.image?.let { binding.imgPerson.loadImage(it) }

        }

    }

