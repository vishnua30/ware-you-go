package com.bosch.whms.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosch.whms.dao.OutBoundRequesitionFormRepository;
import com.bosch.whms.model.OutBoundRequesitionForm;
import com.bosch.whms.service.OutBoundRequesitionFormService;

@Service
public class OutBoundRequesitionFormServiceImpl implements OutBoundRequesitionFormService {

    @Autowired
    private OutBoundRequesitionFormRepository outBoundRequesitionFormRepository;

    @Override
    public List<OutBoundRequesitionForm> getAllOutBoundRequesitionForm() {
        return outBoundRequesitionFormRepository.findAll();
    }

    @Override
    public OutBoundRequesitionForm getOutBoundRequesitionFormById(Long id) {
        Optional<OutBoundRequesitionForm> optional = outBoundRequesitionFormRepository.findById(id);
        return optional.isPresent() ? optional.get() : null;
    }

    @Override
    public void createOutBoundRequesitionForm(OutBoundRequesitionForm outBoundRequesitionForm) {
        outBoundRequesitionFormRepository.save(outBoundRequesitionForm);
    }

    @Override
    public void updateOutBoundRequesitionForm(OutBoundRequesitionForm outBoundRequesitionForm) {
        outBoundRequesitionFormRepository.save(outBoundRequesitionForm);
    }

    @Override
    public void deleteOutBoundRequesitionForm(Long id) {
        outBoundRequesitionFormRepository.deleteById(id);
    }

}
