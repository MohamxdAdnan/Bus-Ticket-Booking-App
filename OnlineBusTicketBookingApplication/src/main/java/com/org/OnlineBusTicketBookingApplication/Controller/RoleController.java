package com.org.OnlineBusTicketBookingApplication.Controller;

import com.org.OnlineBusTicketBookingApplication.Dto.RoleDto;
import com.org.OnlineBusTicketBookingApplication.Service.RoleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class RoleController {
    RoleService roleService;

    @PostMapping("/create")
    public ResponseEntity<RoleDto> createRole(@RequestBody RoleDto roleDto) {
        RoleDto createdRole = roleService.createRole(roleDto);
        return new ResponseEntity<>(createdRole, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<RoleDto> getRole(@PathVariable Long roleId) {
        RoleDto roleDto = roleService.getRole(roleId);
        return new ResponseEntity<>(roleDto, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<RoleDto>> getAllRoles() {
        List<RoleDto> allRoles = roleService.getAllRoles();
        return new ResponseEntity<>(allRoles, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteRole(@PathVariable Long roleId) {
        roleService.deleteRole(roleId);
        return new ResponseEntity<>("Role deleted", HttpStatus.NO_CONTENT);
    }

    @PutMapping("{id}")
    public ResponseEntity<RoleDto> updateRole(@RequestBody RoleDto roleDto, @PathVariable Long roleId) {
        RoleDto updatedRole = roleService.updateRole(roleDto, roleId);
        return new ResponseEntity<>(updatedRole, HttpStatus.OK);
    }
}
